package vegitalk.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.vo.Attachment;
import board.model.vo.Board;
import vegitalk.model.Service.VegitalkService;

@WebServlet("/editForm")
public class GoEditPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GoEditPostServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bId = Integer.parseInt(request.getParameter("bId"));
		Board post = new VegitalkService().selectPost(bId);
		Attachment atc = new VegitalkService().selectAtc(bId);
		
		if(post != null) {
			int bCode = post.getBoard_code();
			request.setAttribute("post", post);
			
			if(bCode == 1 || bCode == 3) {
				request.setAttribute("atc", atc);
				request.getRequestDispatcher("WEB-INF/views/vegitalk/editTalk.jsp").forward(request, response);
			} else {
				request.getRequestDispatcher("WEB-INF/views/vegitalk/editDiet.jsp").forward(request, response);
			}
		} else {
			request.setAttribute("msg", "게시글 정보를 불러오는데 실패했어요.");
			response.sendRedirect("vegiTalk?currentPage=1");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
