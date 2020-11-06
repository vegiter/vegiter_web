package login.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import login.model.service.MemberService;
import login.model.vo.Member;
import login.model.vo.Owner;

/**
 * Servlet implementation class InsertMemberServlet
 */
@WebServlet(urlPatterns = "/insert.me", name = "InsertMemberServlet")
public class InsertMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InsertMemberServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// null값으로 넣기

		String userId = request.getParameter("userId");
		if (userId == null) {
			userId = request.getParameter("userId2");
		}
		int code = Integer.parseInt(request.getParameter("code"));
		String userPwd = request.getParameter("userPwd");
		String name = request.getParameter("userName");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String phone = request.getParameter("phone");
		String style = request.getParameter("style");
		if (style != null) {
			if (style.equals("null"))
				style = null;
		}

		Member m = new Member();
		m.setMemId(userId);
		m.setMemPwd(userPwd);
		m.setMemCode(code);
		m.setMemName(name);
		m.setMemEmail(email);
		if (gender != null) {
			m.setMemGender(gender.charAt(0));
		} else {
			gender = "N";
			m.setMemGender(gender.charAt(0));
		}
		m.setMemPhone(phone);
		m.setMemStyle(style);

		int result = 0;

		// 일반회원인경우
		if (code == 1) {
			result = new MemberService().insertMember(m);
		} else {
			// 사업자 회원인 경우
			String ownNo = request.getParameter("ownNumber");
			String ownName = request.getParameter("userName");
			String memId = request.getParameter("userId");

			Owner own = new Owner(ownNo, ownName, memId);

			result = new MemberService().insertMember(m, own);

		}

		if (result > 0) {
			if (code == 1) {
				response.sendRedirect(request.getContextPath());
			} else {
				request.setAttribute("memId", userId);
				System.out.println("insertServlet : " + userId);
				request.getRequestDispatcher("WEB-INF/views/login/businessFileForm.jsp").forward(request, response);
			}
		} else {
			request.setAttribute("msg", "회원가입에 실패하였습니다.");
			request.getRequestDispatcher("WEB-INF/views/common/errorPage.jsp").forward(request, response);
		}

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
