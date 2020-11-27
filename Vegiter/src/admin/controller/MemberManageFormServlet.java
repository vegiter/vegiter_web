package admin.controller;

import java.io.IOException;

import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.vo.PageInfo;
import login.model.service.MemberService;
import login.model.service.OwnerService;
import login.model.vo.Member;
import login.model.vo.Owner;
import shop.model.service.ShopService;
import shop.model.vo.Shop;

/**
 * Servlet implementation class MemberManageFormServlet
 */
@WebServlet("/admin")
public class MemberManageFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberManageFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberService memService = new MemberService();
		OwnerService ownService = new OwnerService();
		
		ArrayList<Owner> ownList = new OwnerService().selectOwnerAll();
		ArrayList<Shop> shopList = new ShopService().selectShopAll();
		
		// < Member > 
		// 페이징 처리 변수
		int listCount;		// 총 게시물 개수
		int currentPage;	// 현재 페이지
		int pageLimit;		// 한 페이지에 표시할 페이지 수
		int boardLimit;		// 한 페이지에서 보일 게시글 최대 개수
		int maxPage;		
		int startPage;		// 페이징이 된 페이지 중 시작 페이지
		int endPage;		// 마지막 페이지
		
		listCount = memService.getListCount(1);
		
		currentPage = 1;
		if(request.getParameter("currentPage") != null) {
			currentPage = Integer.parseInt(request.getParameter("currentPage"));
		}
		pageLimit = 10;
		boardLimit = 10;
		
		// 올림  (전체 / 게시물최대)
		maxPage = (int)Math.ceil((double)listCount/boardLimit);
		startPage = ((currentPage-1)/pageLimit)*pageLimit + 1;
		
		// endPage계산
		endPage = startPage + pageLimit -1;
		if(maxPage < endPage) {
			endPage = maxPage;
		}
		PageInfo pi = new PageInfo(listCount, currentPage, pageLimit, boardLimit,maxPage, startPage, endPage );
		ArrayList<Member> memList = memService.selectMemList(pi);
		
		// < Owner >
		// 페이징 변수 처리
		int listCountO;
		int currentPageO;
		int pageLimitO;
		int boardLimitO;
		int maxPageO;
		int startPageO;
		int endPageO;
		listCountO = memService.getListCount(2);
		
		currentPageO = 1;
		if(request.getParameter("currentPageO") != null) {
			currentPageO = Integer.parseInt(request.getParameter("currentPageO"));
		}
		pageLimitO = 10;
		boardLimitO = 10; 
		
		maxPageO = (int)Math.ceil(((double)listCountO/boardLimitO));
		startPageO = ((currentPageO -1)/pageLimitO) * pageLimitO + 1;
		endPageO = startPageO + pageLimitO -1;
		if(maxPageO < endPageO) {
			endPageO = maxPageO;
		}
		PageInfo pi2 = new PageInfo(listCountO,currentPageO, pageLimitO, boardLimitO, maxPageO, startPageO, endPageO);
//		ArrayList<Member> ownMemList = memService.selectMemList(pi2);
		
		String page = null;
		if(memList != null && ownList != null) {
			request.setAttribute("pi", pi);
			request.setAttribute("memList", memList);
			request.setAttribute("ownList", ownList);
			request.setAttribute("shopList", shopList);
			page = "WEB-INF/views/admin/adminMain.jsp";
			
		}else {
			request.setAttribute("msg", "회원리스트 로드 오류");
			page = "WEB-INF/views/common/errorPage.jsp";
		}
		request.getRequestDispatcher(page).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
