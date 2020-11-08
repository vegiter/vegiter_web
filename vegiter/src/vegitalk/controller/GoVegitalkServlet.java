package vegitalk.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.vo.Attachment;
import board.model.vo.Board;
import board.model.vo.PageInfo;
import vegitalk.model.Service.VegitalkService;

@WebServlet("/vegiTalk")
public class GoVegitalkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GoVegitalkServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		VegitalkService vs = new VegitalkService();
		int postCount = vs.getPostCountAll();
		int currentPage = 1;
		int pageLimit = 5;
		int postLimit = 12;
		int maxPage = (int)Math.ceil((double)postCount/postLimit);
		int startPage = ((currentPage - 1) / pageLimit) * pageLimit + 1;
		int endPage = 0;
		
		if(maxPage < pageLimit) {
			endPage = maxPage;
		} else {
			endPage = startPage + pageLimit - 1;
		}
		if(request.getParameter("currentPage") != null) {
			currentPage = Integer.parseInt(request.getParameter("currentPage"));
		}
		
		PageInfo pi = new PageInfo(postCount, currentPage, pageLimit, postLimit, maxPage, startPage, endPage);
		ArrayList<Board> pList = vs.getPListAll(pi);
		ArrayList<Attachment> aList = vs.getAList();
		
		if(pList != null && aList != null) {
			request.setAttribute("pi", pi);
			request.setAttribute("pList", pList);
			request.setAttribute("aList", aList);
			request.getRequestDispatcher("WEB-INF/views/vegitalk/vegitalk.jsp").forward(request, response);
		} else {
			request.setAttribute("msg", "게시판 조회에 실패했습니다.");
			request.getRequestDispatcher("WEB-INF/views/common/errorPage.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
