package about.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import about.model.service.AboutService;



@WebServlet("/research")
public class ResearchSendServlet extends HttpServlet{

	private static final long serialVersionUID = 120293919239L;
	private Gson gson = new Gson();
	
    public ResearchSendServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		파라미터 매핑
		int selected = Integer.parseInt(request.getParameter("selected")); 

		int result = new AboutService().insertResearch(selected);

		List<Map<String, Object>> list = new AboutService().selectListResearch();
		
		response.setContentType("application/json; charset=utf-8");
		response.getWriter().append(gson.toJson(list));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	
}
