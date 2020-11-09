package vegitalk.controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.service.BoardService;

@WebServlet("/setBmk.post")
public class BmkSetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BmkSetServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("user");	
		int bId=Integer.parseInt(request.getParameter("bId"));
		BoardService service = new BoardService();
		
		int result = service.insertBookMark(user,bId);
		
		PrintWriter out=response.getWriter();
		if(result>0) {
			out.print("bookmark Success");
		}else {
			out.print("fail");
		}
		out.flush();
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
