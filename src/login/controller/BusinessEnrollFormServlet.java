package login.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BusinessEnrollFormServlet
 */
@WebServlet("/businessEnroll")
public class BusinessEnrollFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
<<<<<<< HEAD

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BusinessEnrollFormServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
=======
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BusinessEnrollFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
		request.getRequestDispatcher("WEB-INF/views/login/businessEnroll.jsp").forward(request, response);
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
