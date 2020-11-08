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
 * Servlet implementation class RecipeListTypeSort2
 */
@WebServlet("/recipe.sort")
public class RecipeListSortServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecipeListSortServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int sortType=Integer.parseInt(request.getParameter("sortType"));
			int type=Integer.parseInt(request.getParameter("type"));
			int bcate=Integer.parseInt(request.getParameter("bcate"));
			
			System.out.println("bcate는"+bcate);
 
			BoardService service=new BoardService(); 
			ArrayList<Board> bList=service.selectTList_sort(1,sortType,type);
			ArrayList<Attachment> tList=service.selectTList_sort(2,sortType,type);
			
			System.out.println(sortType+"sortType입니다!");
			System.out.println(type+"type입니다!!");
			
			System.out.println(bList+"정렬확인용");
			System.out.println(tList+"정렬확인용입니다");
			
			String page=null;
			
			if(bList !=null && tList !=null) {
				request.setAttribute("bList", bList);
				request.setAttribute("tList", tList);
				request.setAttribute("bcate", bcate);
				page="WEB-INF/views/recipe/recipelist.jsp";
			}else {
				request.setAttribute("msg", "정렬에 실패하였습니다.");
				page="WEB-INF/views/common/errorPage.jsp";
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
