package login.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import login.model.service.MemberService;
import login.model.vo.Member;

/**
 * Servlet implementation class FindMemberIdServlet
 */
@WebServlet("/findMemberId.me")
public class FindMemberIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FindMemberIdServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("userName");
		String email = request.getParameter("email");

		Member member = null;
		if (email != null) {
			System.out.println("email != null");
			member = new MemberService().findId(name, email);
		} else {
			String phone1 = request.getParameter("phone-first");
			String phone2 = request.getParameter("phone-middle");
			String phone3 = request.getParameter("phone-last");
			String phone = phone1 + phone2 + phone3;
			System.out.println("phone : " + phone);
			member = new MemberService().findIdByPhone(name, phone);
		}

		String page = null;
		if (member != null) {
			page = "WEB-INF/views/login/findMemberIdForm.jsp";
			request.setAttribute("member", member);
		} else {
			page = "WEB-INF/views/common/errorPage.jsp";
			request.setAttribute("msg", "일치하는 회원이 없습니다.");
		}

		request.getRequestDispatcher(page).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
