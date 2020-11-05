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
import board.model.vo.Content;
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
			String bWriter=((Member)request.getSession().getAttribute("loginUser")).getMemId();
			System.out.println(bWriter+"확인합니다");
			String title=multiRequest.getParameter("title");
			String[] content=multiRequest.getParameterValues("content");
	   		int cates=Integer.parseInt(multiRequest.getParameter("cate")); 
	   		
	   		System.out.println(""+title);
	   			   					
			
			
			ArrayList<String> saveFiles= new ArrayList<String>();			//바뀐 파일저장
			ArrayList<String> originFiles =new ArrayList<String>();			//원본파일저장
																
			
			Enumeration<String> files=multiRequest.getFileNames();	//폼에서 전송된 파일 리스트의 이름 반환
			System.out.println("확인용!!!");
			while(files.hasMoreElements()) {
				String name=files.nextElement();
			
				if(multiRequest.getFilesystemName(name)!=null) {
					saveFiles.add(multiRequest.getFilesystemName(name));
					originFiles.add(multiRequest.getOriginalFileName(name));
					
					System.out.println(multiRequest.getFilesystemName(name));
				}
			}
			
			Board b =new Board();
			b.setBoard_title(title);
			b.setMem_id(bWriter);
			b.setBoard_cate(cates);
			b.setBoard_code(0);
			System.out.println(b.getMem_id());
			
			ArrayList<Content> con=new ArrayList<Content>();
			for(int i=0; i<content.length; i++) {
				if((content[i].trim())!="") {
					Content c=new Content();
					System.out.println(i+","+content[i]);
					c.setContent(content[i]);				
					con.add(c);
				}
			}
			
			
			ArrayList<Attachment> fileList =new ArrayList<Attachment>();
			
			for(int i=originFiles.size()-1; i>=0; i--) {
				Attachment at =new Attachment();
				
				at.setMemId(bWriter);
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
			
			System.out.println(fileList+"연습입니다.");
			
			
			
			int result=new BoardService().insertRecipe(con,b,fileList);
			
			if(result>0) {
				response.sendRedirect("recipe");				
			}else {
				for(int i=0; i<saveFiles.size(); i++) {
					File failedFile =new File(savePath + saveFiles.get(i));
					failedFile.delete();
				}
				
				request.setAttribute("msg", "레시피게시판 등록에 실패하였습니다.");
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
