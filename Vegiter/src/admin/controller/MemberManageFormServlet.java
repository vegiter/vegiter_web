package admin.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		ArrayList<Member> memList = new MemberService().selectMemberAll();
		ArrayList<Owner> ownList = new OwnerService().selectOwnerAll();
		ArrayList<Shop> shopList = new ShopService().selectShopAll();
		
		if(memList != null && ownList != null) {
			request.setAttribute("memList", memList);
			request.setAttribute("ownList", ownList);
			request.setAttribute("shopList", shopList);
			request.getRequestDispatcher("WEB-INF/views/admin/adminMain.jsp").forward(request, response);
			
		}else {
			request.setAttribute("msg", "회원리스트 로드 오류");
			request.getRequestDispatcher("WEB-INF/views/common/errorPage.jsp").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
