package myPage.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import login.model.service.MemberService;
import login.model.vo.Member;

/**
 * Servlet implementation class CheckPwdServlet
 */
@WebServlet(urlPatterns="/checkPwd.me", name="CheckPwdServlet")
public class CheckPwdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckPwdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userPwd = request.getParameter("userPwd");
		
		String userId = ((Member)request.getSession().getAttribute("loginUser")).getMemId();
				
		
		Member member = new Member();
		
		member.setMemId(userId);
		member.setMemPwd(userPwd);
		
		
		
		int result = new MemberService().checkPwd(userId,userPwd);
		
		System.out.println("service "+result);
		
		PrintWriter out = response.getWriter();
		if(result > 0) {
			out.print("success");
//			request.getRequestDispatcher("WEB-INF/views/myinfo/myInfomation.jsp").forward(request, response);
		}else {
			out.print("fail");
		}

		
		
//		
//		String userId = request.getParameter("userId");
//		String userPwd = request.getParameter("userPwd");
//		System.out.println("userId"+userId);
//		Member member = new Member(userId, userPwd);
//		System.out.println("userId"+userId);
//		Member loginUser = new MemberService().loginMember(member);
//		System.out.println("userId"+loginUser);
//		if(loginUser != null) {
//			HttpSession session = request.getSession();
//			session.setAttribute("loginUser", loginUser);
		/*
		 * if(result > 0) { out.print("success");
		 * request.getRequestDispatcher("WEB-INF/views/myinfo/myInfomation.jsp").forward
		 * (request, response); }else { out.print("success");
		 * request.getRequestDispatcher("WEB-INF/views/myinfo/myInfomation.jsp").forward
		 * (request, response); }
		 */
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
