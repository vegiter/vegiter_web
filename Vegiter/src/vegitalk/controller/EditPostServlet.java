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

@WebServlet("/edit")
public class EditPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EditPostServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Board post = new Board();
		Board pReuslt = null;
		Attachment atc = new Attachment();
		int result = 0;
		int bCode = 0;
		
		if(ServletFileUpload.isMultipartContent(request) ) {
			int maxSize = 1024 * 1024 * 30;
			String savePath = request.getSession().getServletContext().getRealPath("/") + "uploaded_Images/";
			File f = new File(savePath);
			if(!f.exists()) {
				f.mkdirs();
			}
			
			MultipartRequest mpr = new MultipartRequest(request, savePath, maxSize, "UTF-8", new MyFileRenamePolicy());
			bCode = Integer.parseInt(mpr.getParameter("boardCode"));
			int bId = Integer.parseInt(mpr.getParameter("bId"));
			String boardContent = mpr.getParameter("boardContent");
			String writer = ((Member)request.getSession().getAttribute("loginUser")).getMemId();
			System.out.println("writer는?" + writer);
			String newAtcName = new String();
			String originAtcName = new String();
			Enumeration<String> files = mpr.getFileNames();
			
			if(files.hasMoreElements()) {
				String name = files.nextElement();
				
				if(mpr.getFilesystemName(name) != null) {
					atc.setAtcName(mpr.getFilesystemName(name));
					atc.setAtcOrigin(mpr.getOriginalFileName(name));
					atc.setAtcPath(savePath);
					atc.setMemId(writer);
					atc.setAtcType(bCode);
					atc.setAtcLevel(0);
				}
			}
			
			post.setBoard_no(bId);
			post.setBoard_content(boardContent);
			
			int aResult = new VegitalkService().updateNewAtc(atc, bId);
			int pResult = new VegitalkService().editPost(post);

			if(pResult > 0) {
				response.sendRedirect("detail?bId=" + bId);
			} else {
				request.setAttribute("msg", "게시글 등록에 실패했습니다.<br>관리자에게 문의해주세요.");
				request.getRequestDispatcher("WEB-INF/views/common/errorPage.jsp").forward(request, response);
			}
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
