package recipe.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.service.BoardService;

/**
 * Servlet implementation class RecipeDeleteServlet
 */
@WebServlet("/delete.recipe")
public class RecipeDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RecipeDeleteServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int bId=Integer.parseInt(request.getParameter("bId"));
			
			int result=new BoardService().deleteBoard(bId);
			
			if(result>0) {
				response.sendRedirect("recipe");
			}else {
				request.setAttribute("msg", "삭제에 실패하였습니다.");
				request.getRequestDispatcher("WEB-INF/views/common/errorPage.jsp").forward(request, response);
			}
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
