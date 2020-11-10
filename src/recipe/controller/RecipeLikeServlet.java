package recipe.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import board.model.service.BoardService;
import board.model.vo.Board;

/**
 * Servlet implementation class RecipeLikeServlet
 */
@WebServlet("/updateLike.recipe")
public class RecipeLikeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RecipeLikeServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int num=Integer.parseInt(request.getParameter("num"));
			int bId=Integer.parseInt(request.getParameter("bId"));
			String user=request.getParameter("user");
			BoardService service=new BoardService();
			
			int result=service.updateLike(num,bId,user);

			PrintWriter out=response.getWriter();
			if(result>0) {
				out.print("bookmark Success");
			}else {
				out.print("fail");
			}
			
			out.flush();
			out.close();
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
