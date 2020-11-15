package vegitalk.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import vegitalk.model.Service.VegitalkService;
import vegitalk.model.dao.VegitalkDAO;

@WebServlet("/deleteCom")
public class DeleteCommentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteCommentServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int comNo = Integer.parseInt(request.getParameter("comNo"));
		int bId = Integer.parseInt(request.getParameter("bId"));
		
		int result = new VegitalkService().delComment(bId, comNo);
		
		response.setContentType("application/json;");
		if(result < 0) {
			request.setAttribute("msg", "댓글을 삭제하지 못했습니다.<br>다시 시도해주세요.");
			request.getRequestDispatcher("/WEB-INF/common/errorPage.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
