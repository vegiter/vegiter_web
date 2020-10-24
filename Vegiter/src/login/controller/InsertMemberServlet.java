package login.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import login.model.serviec.MemberService;
import login.model.vo.Member;

/**
 * Servlet implementation class InsertMemberServlet
 */
@WebServlet("/insert.me")
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// null값으로 넣기
		
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		int code = Integer.parseInt(request.getParameter("code"));
		String name = request.getParameter("userName");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		if(gender.equals("null")) {
			gender = null;
		}
		String phone = request.getParameter("phone");
		String style = request.getParameter("style");
		if(style.equals("null")) {
			style = null;
		}
		
		Member m = new Member();
		m.setMemId(userId);
		m.setMemPwd(userPwd);
		m.setMemCode(code);
		m.setMemName(name);
		m.setMemEmail(email);
		m.setMemGender(gender.charAt(0));
		m.setMemPhone(phone);
		m.setMemStyle(style);
		
		int result = new MemberService().insertMember(m);
		
		if(result > 0) {
			response.sendRedirect(request.getContextPath());
		}else {
			request.setAttribute("msg", "회원가입에 실패하였습니다.");
			request.getRequestDispatcher("WEB-INF/views/common/errorPage.jsp");
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
