package vegitalk.controller;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.oreilly.servlet.MultipartRequest;

import board.model.vo.Attachment;
import board.model.vo.Board;
import vegitalk.common.MyFileRenamePolicy;
import vegitalk.model.Service.VegitalkService;

@WebServlet("/updateEdit")
public class UpdateEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateEditServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Board b = new Board();
		Attachment atc = null;
		int pResult = 0;
		int aResult = 1;
		int bId = 0;
		int bCode = 0;
		
		if(ServletFileUpload.isMultipartContent(request)) {
			int maxSize = 1024 * 1024 * 30;
			String savePath = request.getSession().getServletContext().getRealPath("/") + "uploaded_Images/";
			File f = new File(savePath);
			if(!f.exists()) {
				f.mkdirs();
			}
			
			MultipartRequest multiRequest = new MultipartRequest(request, savePath, maxSize, "UTF-8", new MyFileRenamePolicy());
			bId = Integer.parseInt(multiRequest.getParameter("bId"));
			bCode = Integer.parseInt(multiRequest.getParameter("bCode"));
			String boardContent = multiRequest.getParameter("boardContent");
			String writer = multiRequest.getParameter("writer");
			
			String newAtcName =  new String();
			String originAtcName = new String();
			Enumeration<String> files = multiRequest.getFileNames();
			
			if(files.hasMoreElements()) {
				String name = files.nextElement();
				
				if(multiRequest.getFilesystemName(name) != null) {
					atc = new Attachment();
					atc.setAtcName(multiRequest.getFilesystemName(name));
					atc.setAtcOrigin(multiRequest.getOriginalFileName(name));
					atc.setAtcPath(savePath);
					atc.setMemId(writer);
					atc.setAtcType(bCode);
					atc.setBoardNo(bId);
					atc.setAtcLevel(0);
				}
			}
			
			b.setBoard_no(bId);
			b.setBoard_content(boardContent);
	
			
			pResult = new VegitalkService().updatePost(b);
			
			if(atc != null) {
				aResult = new VegitalkService().editAtc(atc, bId);
			}
		}
		
		if(pResult > 0 && aResult > 0) {
			response.sendRedirect("detail?bId=" + bId + "&bCode=" + bCode);
		} else {
			request.setAttribute("msg", "게시글을 수정하지 못했어요.<br>관리자에게 문의해주세요.");
			request.getRequestDispatcher("WEB-INF/views/common/errorPage.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
