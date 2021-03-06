package vegitalk.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.service.BoardService;
import board.model.vo.Attachment;
import board.model.vo.Board;
import board.model.vo.BookMark;
import board.model.vo.Comments;
import board.model.vo.DietList;
import vegitalk.model.Service.VegitalkService;

@WebServlet("/detail")
public class DetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DetailServlet() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bId = Integer.parseInt(request.getParameter("bId"));
		int bCode = Integer.parseInt(request.getParameter("bCode"));
		Board post = new VegitalkService().selectPost(bId);
		Attachment atc = new VegitalkService().selectAtc(bId);
		ArrayList<Comments> list = new VegitalkService().selectReplyList(bId);
		BookMark bmkList = new BoardService().selectBookMark(bId);
		
		if (post != null) {
			request.setAttribute("list", list);
			request.setAttribute("bmkList", bmkList);
			if(bCode == 1 || bCode == 3) {
				request.setAttribute("post", post);
				request.setAttribute("atc", atc);
				request.getRequestDispatcher("WEB-INF/views/vegitalk/detailTalk.jsp").forward(request, response);
			}
			if(bCode == 2) {
				DietList dList = new VegitalkService().selectDietList(bId);
				request.setAttribute("post", post);
				request.setAttribute("dList", dList);
				request.getRequestDispatcher("WEB-INF/views/vegitalk/detailDiet.jsp").forward(request, response);
			}
		} else {
			request.setAttribute("msg", "게시글을 읽어오지 못했어요.");
			request.getRequestDispatcher("WEB-INF/views/common/errorPage.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
