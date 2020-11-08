package recipe.controller;

import java.io.IOException;

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
			BoardService service=new BoardService();
			
		
			
			int result=service.updateLike(num,bId);
			
//			if(result>0) {			//like업데이트가 잘 되었을때
//				
//			}else {					//like업데이트에 문제가 생길떼
//				
//			}
			
			
			response.setContentType("application/json;");
			Gson gson=new Gson();
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
