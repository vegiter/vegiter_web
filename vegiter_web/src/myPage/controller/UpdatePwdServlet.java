package myPage.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import login.model.service.MemberService;
import login.model.vo.Member;

/**
 * Servlet implementation class UpdatePwdServlet
 */
@WebServlet(urlPatterns="/updatePwd.me", name="UpdatePwdServlet")
public class UpdatePwdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePwdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String userId = ((Member)session.getAttribute("loginUser")).getMemId();
//		String userPwd = request.getParameter("userPwd");
		String newPwd = request.getParameter("newPwd");
		
		System.out.println(userId);
		
		
		int result = new MemberService().updatePwd(userId, newPwd);
		
		String page = null;
		if(result > 0) {
			page = "/myPage.me";
		} else {
			page = "WEB-INF/views/common/errorPage.jsp";
			request.setAttribute("msg", "비밀번호 변경이 실패하였습니다.");
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
