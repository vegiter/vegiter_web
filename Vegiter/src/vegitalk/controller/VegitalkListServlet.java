package vegitalk.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vegitalk.model.Service.VegitalkService;

@WebServlet("/VegitalkListServlet")
public class VegitalkListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public VegitalkListServlet() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		VegitalkService vs = new VegitalkService();
		//int postCount = vs.getPostCount();
		int currentPage = 1;
		int pageLimit = 5;
		int postLimit = 12;
		int maxPage;
		int startPage;
		int endPage;
		int boardCode;
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
