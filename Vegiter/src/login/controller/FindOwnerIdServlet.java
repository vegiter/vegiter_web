package login.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import login.model.service.OwnerService;
import login.model.vo.Owner;

/**
 * Servlet implementation class FindOwnerIdServlet
 */
@WebServlet("/findOwnerId.me")
public class FindOwnerIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindOwnerIdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ownerName = request.getParameter("ownerName");
		String ownerNum = request.getParameter("ownerNum");
		
		Owner owner = new OwnerService().findId(ownerName, ownerNum);
		
		String page = null;
		if(owner != null) {
			page = "WEB-INF/views/login/findOwnerId.jsp";
			request.setAttribute("owner", owner);
		} else {
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
