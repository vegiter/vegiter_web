package vegitalk.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vegitalk.model.Service.VegitalkService;

@WebServlet("/delete")
public class DeleteVegitalkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteVegitalkServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bId = Integer.parseInt(request.getParameter("bId"));
		int bCode = Integer.parseInt(request.getParameter("bCode"));
		System.out.println("비코:" + bCode);
		int aResult = 1;
		
		int pResult = new VegitalkService().deletePost(bId);
		if(bCode == 1 || bCode == 3) {
			aResult = new VegitalkService().deleteAtc(bId);
		}
		
		if(pResult > 0 && aResult > 0){
			response.sendRedirect("vegiTalk?currentPage=1");
		} else {
			request.setAttribute("msg", "게시글을 삭제하지 못했어요.<br>다시 시도해주세요.");
			request.getRequestDispatcher("WEB-INF/views/common/errorPage.jsp").forward(request, response);
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
