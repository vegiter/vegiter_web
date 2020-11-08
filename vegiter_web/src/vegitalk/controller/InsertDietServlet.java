package vegitalk.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.vo.Board;
import board.model.vo.DietList;
import login.model.vo.Member;
import vegitalk.model.Service.VegitalkService;

@WebServlet("/insertDiet")
public class InsertDietServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InsertDietServlet() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] mFood = request.getParameterValues("mFood");
		String[] mUrl = request.getParameterValues("mUrl");
		String[] lFood = request.getParameterValues("lFood");
		String[] lUrl = request.getParameterValues("lUrl");
		String[] eFood = request.getParameterValues("eFood");
		String[] eUrl = request.getParameterValues("eUrl");
		String boardContent = request.getParameter("boardContent");
		int boardCode = Integer.parseInt(request.getParameter("boardCode"));
		String writer = ((Member)request.getSession().getAttribute("loginUser")).getMemId();

		DietList dl = new DietList(mFood, mUrl, lFood, lUrl, eFood, eUrl);
		Board b = new Board();
		b.setBoard_content(boardContent);
		b.setBoard_code(boardCode);
		b.setMem_id(writer);
		
		int result = new VegitalkService().insertDiet(dl, b);
		
		if(result> 0){
			response.sendRedirect("vegiTalk?currentPage=1");
		} else {
			request.setAttribute("msg", "게시글 등록에 실패했습니다.<br>관리자에게 문의하세요.");
			request.getRequestDispatcher("WEB-INF/views/common/errorPage.jsp").forward(request, response);
		}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
