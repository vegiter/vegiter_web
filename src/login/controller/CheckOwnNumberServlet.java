package login.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

<<<<<<< HEAD
import login.model.service.MemberService;
=======
import login.model.serviec.MemberService;
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거

/**
 * Servlet implementation class CheckOwnNumberServlet
 */
@WebServlet("/checkOwnNumber")
public class CheckOwnNumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
<<<<<<< HEAD

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CheckOwnNumberServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String ownNumber = request.getParameter("ownNumber");

		int result = new MemberService().checkOwnNumber(ownNumber);
		PrintWriter out = response.getWriter();
		if (result > 0) {
			out.print("fail");
		} else {
=======
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckOwnNumberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ownNumber = request.getParameter("ownNumber");
		
		int result = new MemberService().checkOwnNumber(ownNumber);
		PrintWriter out = response.getWriter();
		if(result > 0) {
			out.print("fail");
		}else {
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
			out.print("success2");
		}
	}

	/**
<<<<<<< HEAD
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
=======
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
