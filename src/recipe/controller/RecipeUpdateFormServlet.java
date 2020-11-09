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
import board.model.vo.Content;
import login.model.vo.Member;

/**
 * Servlet implementation class RecipeUpdateServlet
 */
@WebServlet("/update.recipe")
public class RecipeUpdateFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecipeUpdateFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bNo = Integer.parseInt(request.getParameter("bId"));
//		String memId = ((Member)request.getSession().getAttribute("loginUser")).getMemId();
		
		Board board = new BoardService().selectBoard(bNo);
		ArrayList<Attachment> attach = new BoardService().selectThumbnail(bNo);
		ArrayList<Content> content = new BoardService().selectContent(bNo);
		String page = null;
		if(attach != null) {
			request.setAttribute("board", board);
			request.setAttribute("fileList", attach);
			request.setAttribute("conList", content);
			page = "WEB-INF/views/recipe/recipeModifyForm.jsp";
		}else {
			request.setAttribute("msg", "레시피 상세 보기에 실패하였습니다.");
			page="WEB-INF/veiws/views/common/errorPage.jsp";
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
