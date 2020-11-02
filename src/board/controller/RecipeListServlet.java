package board.controller;

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
import board.model.vo.PageInfo;

/**
 * Servlet implementation class RecipeListServlet
 */
@WebServlet("/recipe")
public class RecipeListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RecipeListServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		  BoardService service=new BoardService(); 
		  ArrayList<Board> bList=service.selectTList(1);
		  ArrayList<Attachment>tList=service.selectTList(2);	//thumbnail사진
		  String VeganType="1";
		  
		  String page=null;
		  
		 /*
		  //페이징 처리 변수
		  int listCount;
		  int currentPage;
		  int pageLimit;
		  int boardLimit;
		  int maxPage;
		  int startPage;
		  int endPage;
		  
		  listCount =service.getListCount();
		  
		  currentPage=1;
		  
		  if(request.getParameter("currentPage")!=null) {
			  currentPage=Integer.parseInt(request.getParameter("currentPage"));
		  }
		  
		  pageLimit=10;
		  boardLimit=10;
		  
		  //최대 페이지 계산하는 곳
		  maxPage=(int)Math.ceil((double)listCount/boardLimit);
		  
		  //시작페이지 계산
		  startPage=pageLimit * ((currentPage-1)/pageLimit) +1;
		  
		  
		  //마지막페이지 계산
		  endPage=startPage + pageLimit-1;
		  if(maxPage<endPage) {
			  endPage=maxPage;
		  }
		  
			PageInfo pi = new PageInfo(currentPage,listCount,pageLimit,boardLimit,maxPage,startPage,endPage);
			
			*/
			
			
			
			
			
			
		  
//		  if(bList !=null && tList!=null) {
		  if(true) {
			  request.setAttribute("bList", bList);
			  request.setAttribute("TList", tList);
			  request.setAttribute("VeganType",VeganType);
			  page="WEB-INF/views/recipe/recipelist.jsp";		  
		  }else {
			  request.setAttribute("msg", "recipe조회에 실패하였습니다");
			  page="WEB-INF/views/common/errorPage.jsp";
			 }
		  
		  request.getRequestDispatcher(page).forward(request, response);
		 
		  request.getRequestDispatcher("WEB-INF/views/recipe/recipelist.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
