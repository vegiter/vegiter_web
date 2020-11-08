package recipe.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.oreilly.servlet.MultipartRequest;

import board.model.service.BoardService;
import board.model.vo.Attachment;
import board.model.vo.Board;
import common.MyFileRenamePolicy;
import login.model.vo.Member;

/**
 * Servlet implementation class RecipeInsertServlet
 */
@WebServlet("/insert.recipe")
public class RecipeInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecipeInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
					
		if(ServletFileUpload.isMultipartContent(request)) {
			int maxSize=1024*1024*10;  //10mb로 제한
			String root=request.getSession().getServletContext().getRealPath("/");		//webserver container의 경로 추출
			String savePath=root + "thumnail_uploadFiles/";//최종적으로 들어갈 파일
			
			File f =new File(savePath);
			if(!f.exists()) {
				f.mkdirs();
			}
			
			
			MultipartRequest multiRequest = new  MultipartRequest(request, savePath, maxSize, "UTF-8", new MyFileRenamePolicy());
			
			String title=multiRequest.getParameter("title");
			String[] content=multiRequest.getParameterValues("content");
	   		String cates=multiRequest.getParameter("cate"); 
	   		int cate=0;
	   		switch(cates) {
	   		case "비건": cate=1; break;
	   		case "락토": cate=2; break;
	   		case "오보": cate=3; break;
	   		case "락토오보": cate=4; break;
	   		case "페스코": cate=5; break;
	   		case "폴로": cate=6; break;
	   		case "플렉": cate=7; break;
	   		default:  cate=0; break;
	   		}
	   			   		
			String contents=null;
			for(int i=0; i<content.length; i++) {
				if(i==0) {
				contents += content[i];
				}
				else {
					contents +=","+content[i];
				}
			}
			

			String bWriter=((Member)request.getSession().getAttribute("loginUser")).getMemId();
			
			
			ArrayList<String> saveFiles= new ArrayList<String>();			//바뀐 파일저장
			ArrayList<String> originFiles =new ArrayList<String>();			//원본파일저장
																
			
			Enumeration<String> files=multiRequest.getFileNames();	//폼에서 전송된 파일 리스트의 이름 반환
			
			while(files.hasMoreElements()) {
				String name=files.nextElement();
			
				if(multiRequest.getFilesystemName(name)!=null) {
					saveFiles.add(multiRequest.getFilesystemName(name));
					originFiles.add(multiRequest.getOriginalFileName(name));
				}
			}
			
			Board b =new Board();
			b.setBoard_title(title);
			b.setBoard_content(contents);
			b.setBoard_cate(cate);
			b.setBoard_code(2);
			b.setBoard_cate(cate);
			
			ArrayList<Attachment> fileList =new ArrayList<Attachment>();
			
			for(int i=originFiles.size()-1; i>=0; i--) {
				Attachment at =new Attachment();
				at.setAtcPath(savePath);
				at.setAtcOrigin(originFiles.get(i));
				at.setAtcName(saveFiles.get(i));
				
				if(i == originFiles.size() - 1) {
					at.setAtcLevel(0);
				}else {
					at.setAtcLevel(1);
				}
				
				fileList.add(at);
			}
			
			int result=new BoardService().insertRecipe(b,fileList);
			
			if(result>0) {
				response.sendRedirect("recipe");				
			}else {
				for(int i=0; i<saveFiles.size(); i++) {
					File failedFile =new File(savePath + saveFiles.get(i));
					failedFile.delete();
				}
				
				request.setAttribute("msg", "사진게시판 등록에 실패하였습니다.");
				request.getRequestDispatcher("WEB-INF/views/common/errorPage.jsp").forward(request, response);
		
			}			
		}
						
						
						
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
