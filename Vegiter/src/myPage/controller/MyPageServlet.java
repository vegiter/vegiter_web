package myPage.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.service.BoardService;
import board.model.vo.Attachment;
import board.model.vo.Board;
import login.model.service.OwnerService;
import login.model.vo.Member;
import login.model.vo.Owner;
import myPage.model.vo.Bookmark;
import shop.model.service.ShopService;
import shop.model.vo.Shop;

/**
 * Servlet implementation class MyPageServlet
 */
@WebServlet("/myPage.me")
public class MyPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyPageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = ((Member)request.getSession().getAttribute("loginUser")).getMemId();
		int memCode = ((Member)request.getSession().getAttribute("loginUser")).getMemCode();
		
		BoardService bService = new BoardService();
		
		Owner owner = null;
		ArrayList<Shop> shopList = null;
		if(memCode == 2) {
			// owner와 shop정보 가져오기
			owner = new OwnerService().selectOwner(userId);
			if(owner != null) {
				shopList = new ShopService().selectShop(owner.getOwnNo());
				request.setAttribute("shopList", shopList);
			}
		}
		ArrayList<Bookmark> bookList = bService.selectBookMarkById(userId);
		
		String page = null;
		if(bookList != null) {
			ArrayList<Board> bList = bService.selectBoardByBook(bookList);
			ArrayList<Attachment> fList = bService.selectOnlyThumbnail(bookList);
			ArrayList<Board> writeList = bService.selectBoardByMem(userId);
			ArrayList<Attachment> writefList = bService.selectThumbnailByMem(userId);
			
			if(bList != null && writeList != null) {
				request.setAttribute("bList", bList);
				request.setAttribute("fList", fList);
				request.setAttribute("writeList", writeList);
				request.setAttribute("writefList", writefList);
				page = "WEB-INF/views/myinfo/profile.jsp";
			}
			
		}else{
			request.setAttribute("msg", "북마크 로드 실패");
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
