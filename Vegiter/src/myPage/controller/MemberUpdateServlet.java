package myPage.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import login.model.service.MemberService;
import login.model.vo.Member;

/**
 * Servlet implementation class MemberUpdateServlet
 */
@WebServlet(urlPatterns="/update.me", name="MemberUpdateServlet")
public class MemberUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("myName");
		String phone = request.getParameter("myPhone");
		String email = request.getParameter("myEmail");
		char gender = request.getParameter("gender").charAt(0);
		String style = request.getParameter("style");
		
		Member loginUser =((Member)request.getSession().getAttribute("loginUser"));

		String userId = loginUser.getMemId();
				
		Member mem = new Member();
		mem.setMemId(userId);
		mem.setMemName(name);
		mem.setMemPhone(phone);
		mem.setMemEmail(email);
		mem.setMemGender(gender);
		mem.setMemStyle(style);
		
		int result = new MemberService().updateMember(mem);
		String page = null;
	
		if(result > 0) {
			loginUser.setMemName(name);
			loginUser.setMemPhone(phone);
			loginUser.setMemEmail(email);
			loginUser.setMemGender(gender);
			loginUser.setMemStyle(style);
			page = "/myPage.me";
		} else {
			page = "WEB-INF/views/common/errorPage.jsp";
			request.setAttribute("msg", "회원정보 수정에 실패했습니다.");
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
