package vegitalk.controller;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.oreilly.servlet.MultipartRequest;

import board.model.vo.Attachment;
import board.model.vo.Board;
import login.model.vo.Member;
import vegitalk.common.MyFileRenamePolicy;
import vegitalk.model.Service.VegitalkService;

@WebServlet("/insertTalk")
public class InsertTalkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InsertTalkServlet() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Board b = new Board();
		Attachment atc = new Attachment();
		int result = 0;
		
		if(ServletFileUpload.isMultipartContent(request)) {
			int maxSize = 1024 * 1024 * 30;
			String savePath = request.getSession().getServletContext().getRealPath("/") + "uploaded_Images/";
			File f = new File(savePath);
			if(!f.exists()) {
				f.mkdirs();
			}
			
			MultipartRequest multiRequest = new MultipartRequest(request, savePath, maxSize, "UTF-8", new MyFileRenamePolicy());
			int boardCode = Integer.parseInt(multiRequest.getParameter("boardCode"));
			String boardContent = multiRequest.getParameter("boardContent");
			String writer = ((Member)request.getSession().getAttribute("loginUser")).getMemId();
			
			String newAtcName =  new String();
			String originAtcName = new String();
			Enumeration<String> files = multiRequest.getFileNames();
			
			if(files.hasMoreElements()) {
				String name = files.nextElement();
				
				if(multiRequest.getFilesystemName(name) != null) {
					atc.setAtcName(multiRequest.getFilesystemName(name));
					atc.setAtcOrigin(multiRequest.getOriginalFileName(name));
					atc.setAtcPath(savePath);
					atc.setMemId(writer);
					atc.setAtcType(boardCode);
					atc.setAtcLevel(0);
				}
			}
			
			b.setBoard_code(boardCode);
			b.setBoard_content(boardContent);
			b.setMem_id(writer);
			
			result = new VegitalkService().insertPost(b, atc);
		}
		
		if(result > 0) {
			request.getRequestDispatcher("/vegiTalk").forward(request, response);
		} else {
			request.setAttribute("msg", "게시글 등록에 실패했습니다.<br>관리자에게 문의해주세요.");
			request.getRequestDispatcher("WEB-INF/views/common/errorPage.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
