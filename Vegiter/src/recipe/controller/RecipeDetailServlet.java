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
import board.model.vo.BookMark;
import board.model.vo.Comments;
import board.model.vo.Content;
import vegitalk.model.Service.VegitalkService;

/**
 * Servlet implementation class RecipeDetail
 */
@WebServlet("/detail.recipe")
public class RecipeDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecipeDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int bId=Integer.parseInt(request.getParameter("bId"));
			
			BoardService service=new BoardService();
			
			
			
			
			Board board=service.selectBoard(bId);
			
			ArrayList<Attachment> fileList=service.selectThumbnail(bId);
			
			ArrayList<Content> conList=service.selectContent(bId);
			
			BookMark bookList=service.selectBookMark(bId);
			
//			LikeBoard likeBookList =service.selectBoardLike(bId);
			
			ArrayList<Comments> list = new VegitalkService().selectReplyList(bId);

			
			
			String page=null;
			
			if(fileList != null) {
//				request.setAttribute("likeBookList", likeBookList);
				request.setAttribute("list", list);
				request.setAttribute("bookList", bookList);
				request.setAttribute("board", board);
				request.setAttribute("fileList", fileList);
				request.setAttribute("conList", conList);
				page="WEB-INF/views/recipe/recipeView.jsp";
			}else {
				request.setAttribute("msg", "레시피 상세 보기에 실패하였습니다.");
				page="WEB-INF/veiws/views/common/errorPage.jsp";
			}
			
			request.getRequestDispatcher(page).forward(request, response);
		

	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
