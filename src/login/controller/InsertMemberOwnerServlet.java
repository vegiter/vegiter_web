package login.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

<<<<<<< HEAD
import org.apache.commons.fileupload.servlet.ServletFileUpload;
=======
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거

import com.oreilly.servlet.MultipartRequest;

import board.model.vo.Attachment;
import common.MyFileRenamePolicy;
<<<<<<< HEAD
import login.model.service.MemberService;
=======
import login.model.serviec.MemberService;
import login.model.vo.Member;
import login.model.vo.Owner;
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거

/**
 * Servlet implementation class InsertMemberOwnerServlet
 */
@WebServlet(urlPatterns="/insert.ow", name="InsertOwnerServlet")
public class InsertMemberOwnerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertMemberOwnerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
<<<<<<< HEAD
=======
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd1");
		int code = Integer.parseInt(request.getParameter("code"));
		System.out.println("Servlet : " + userPwd);
		String name = request.getParameter("userName");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String phone = request.getParameter("phone");
		String style = request.getParameter("style");
		if(style.equals("null")) {
			style = null;
		}
		
		Member m = new Member();
		m.setMemId(userId);
		m.setMemPwd(userPwd);
		m.setMemCode(code);
		m.setMemName(name);
		m.setMemEmail(email);
		if(gender != null) {
			m.setMemGender(gender.charAt(0));
		}
		m.setMemPhone(phone);
		m.setMemStyle(style);
		
		String ownNo = request.getParameter("ownNumber");
		String ownName = request.getParameter("userName");
		String memId = request.getParameter("userId");
		
		Owner own = new Owner(ownNo, ownName, memId);
		
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
		int result = 0;
		
		// 파일이 있을 시에
		if(ServletFileUpload.isMultipartContent(request)) { 
			int maxSize = 1024 * 1024 * 10;
			String root = request.getSession().getServletContext().getRealPath("/");
			String savePath = root + "owner_uploadFiles/";
			
			File f = new File(savePath);
			if(!f.exists()) {
				f.mkdir();
			}
			
			MultipartRequest multiRequest = new MultipartRequest(request, savePath, maxSize, "UTF-8", new MyFileRenamePolicy());
			
<<<<<<< HEAD
			String memId = multiRequest.getParameter("memId");
			
=======
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
			
			// 파일 원본 이름/ 바뀐이름 저장
			ArrayList<String> saveFiles = new ArrayList<String>();
			ArrayList<String> originFiles = new ArrayList<String>();
			
			Enumeration<String> files = multiRequest.getFileNames();
			while(files.hasMoreElements()) {
				String fName = files.nextElement();
				
				if(multiRequest.getFilesystemName(fName) != null) {
					saveFiles.add(multiRequest.getFilesystemName(fName));
					originFiles.add(multiRequest.getOriginalFileName(fName));
				}
				
				System.out.println(saveFiles);
				System.out.println(originFiles);
				
			}
			
			ArrayList<Attachment> fileList = new ArrayList<Attachment>();
			
			for(int i = originFiles.size()-1; i >= 0; i--) {
				Attachment at = new Attachment();
				at.setMemId(memId);
				at.setAtcPath(savePath);
				at.setAtcOrigin(originFiles.get(i));
				at.setAtcType(4);
				at.setAtcName(saveFiles.get(i));
<<<<<<< HEAD
				at.setBoardNo(-1);
=======
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
				
				// 역순으로 저장되어 있음
				if(i == originFiles.size() - 1) {
					at.setAtcLevel(0);
				}else {
					at.setAtcLevel(1);
				}
				fileList.add(at);
			}
<<<<<<< HEAD
			result = new MemberService().insertMember(fileList);
			
			if(result > 0) {
				response.sendRedirect("index.jsp");
			}else {
				request.setAttribute("msg", "사업자 파일 업로드에 실패하셨습니다.");
				request.getRequestDispatcher("WEB-INF/views/common/errorPage.jsp").forward(request, response);
			}
=======
			result = new MemberService().insertMember(m,own, fileList);
			
			if(result > 0) {
				response.sendRedirect(request.getContextPath());
			}else {
				request.setAttribute("msg", "사업자 회원가입(파일 업로드)에 실패하셨습니다.");
				request.getRequestDispatcher("WEB-INF/views/common/errorPage.jsp").forward(request, response);
			}
		}else {
		// 파일이 없을 시
			result = new MemberService().insertMember(m, own);
			
			if(result > 0) {
				response.sendRedirect(request.getContextPath());
			}else {
				request.setAttribute("msg", "사업자 회원가입에 실패하였습니다.");
				request.getRequestDispatcher("WEB-INF/views/common/errorPage.jsp").forward(request, response);;
			}
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
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
