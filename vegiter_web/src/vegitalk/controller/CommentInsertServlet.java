package vegitalk.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import board.model.vo.Board;
import board.model.vo.Comments;
import vegitalk.model.Service.VegitalkService;

@WebServlet("/insertComment.bo")
public class CommentInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CommentInsertServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String writer = request.getParameter("writer");
		int bId = Integer.parseInt(request.getParameter("bId"));
		String content = request.getParameter("content");
		
		
		Comments c = new Comments();
		c.setBoardNo(bId);
		c.setMemId(writer);
		c.setComContent(content);
		
		ArrayList<Comments> list = new VegitalkService().insertComment(c);
		
		response.setContentType("application/json;");
		GsonBuilder gb = new GsonBuilder();
		GsonBuilder dateGb = gb.setDateFormat("yyyy-MM-dd");
		Gson gson = dateGb.create();
		gson.toJson(list, response.getWriter());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
