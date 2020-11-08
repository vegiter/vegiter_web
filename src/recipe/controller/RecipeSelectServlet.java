package recipe.controller;

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
 * Servlet implementation class RecipeSelectServlet
 */
@WebServlet("/select.re")
public class RecipeSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecipeSelectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.setCharacterEncoding("UTF-8");
		
			String text=request.getParameter("text");
		
		  BoardService service=new BoardService(); 
		  ArrayList<Board> bList=service.selectTList(1,text);
		  ArrayList<Attachment>tList=service.selectTList(2,text);	//thumbnail사진
		  
		  
		  String page=null;
		  
		  if(bList !=null && tList!=null) {
			  request.setAttribute("bList", bList);
			  request.setAttribute("TList", tList);
			  page="WEB-INF/views/recipe/recipelist.jsp";		  
		  }else {
			  request.setAttribute("msg", "recipe조회에 실패하였습니다");
			  page="WEB-INF/views/common/errorPage.jsp";
			 }

		
		
		 request.getRequestDispatcher("WEB-INF/views/recipe/recipelist.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
