package board.controller;

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

/**
 * Servlet implementation class RecipeListTypeSort2
 */
@WebServlet("/recipe.sort")
public class RecipeListTypeSort2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecipeListTypeSort2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int sortType=Integer.parseInt(request.getParameter("sortType"));
			
 
			BoardService service=new BoardService(); 
			ArrayList<Board> bList=service.selectTList(1,sortType);
			ArrayList<Attachment> tList=service.selectTList(2,sortType);
			
			String page=null;
			
			if(bList !=null && tList !=null) {
				request.setAttribute("bList", bList);
				request.setAttribute("tList", tList);
				page="WEB-INF/views/recipe/recipelist.jsp";
			}else {
				request.setAttribute("msg", "정렬에 실패하였습니다.");
				page="WEB-INF/views/common/errorPage.jsp";
			}

			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
