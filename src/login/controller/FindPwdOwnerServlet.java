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
 * Servlet implementation class FindPwdOwnerServlet
 */
@WebServlet("/findPwdOwnerForm.me")
public class FindPwdOwnerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindPwdOwnerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("ownerName");
		String id = request.getParameter("ownerId");
		String number = request.getParameter("ownerNumber");
		
		Member mem = new MemberService().findPwdOwner(name, id, number);
		String page = null;
		
		if(mem != null) {
			page = "WEB-INF/views/login/findPwdForm.jsp";
			request.setAttribute("member", mem);
		}else {
			page = "WEB-INF/views/common/errorPage.jsp";
			request.setAttribute("msg", "일치하는 회원이 없습니다.");
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
