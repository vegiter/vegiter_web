package myPage.controller;

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
import login.model.vo.Member;
import myPage.model.vo.Bookmark;

/**
 * Servlet implementation class MyPageServlet
 */
@WebServlet("/myPage.me")
public class MyPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyPageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = ((Member)request.getSession().getAttribute("loginUser")).getMemId();
		BoardService bService = new BoardService();
		ArrayList<Bookmark> bookList = bService.selectBookMarkById(userId);
		
		String page = null;
		if(bookList != null) {
			ArrayList<Board> bList = bService.selectBoardByBook(bookList);
			ArrayList<Attachment> fList = bService.selectOnlyThumbnail(bookList);
			
			if(bList != null) {
				request.setAttribute("bList", bList);
				request.setAttribute("fList", fList);
				page = "WEB-INF/views/myinfo/profile.jsp";
			}
			
		}else{
			request.setAttribute("msg", "북마크 로드 실패");
			page = "WEB-INF/views/common/errorPage.jsp";
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
