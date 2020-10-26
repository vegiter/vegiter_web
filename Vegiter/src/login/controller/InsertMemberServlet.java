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

import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.oreilly.servlet.MultipartRequest;

import common.MyFileRenamePolicy;
import login.model.serviec.MemberService;
import login.model.vo.Member;

/**
 * Servlet implementation class InsertMemberServlet
 */
@WebServlet(urlPatterns="/insert.me", name="InsertMemberServlet")
public class InsertMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertMemberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// null값으로 넣기
		
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		int code = Integer.parseInt(request.getParameter("code"));
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
		
		if(code == 2) {
			if(ServletFileUpload.isMultipartContent(request)) {
				int maxSize = 1024 * 1024 * 10;
				String root = request.getSession().getServletContext().getRealPath("/");
				String savePath = root + "owner_uploadFiles/";
				
				File f = new File(savePath);
				if(!f.exists()) {
					f.mkdir();
				}
				
				MultipartRequest multiRequest = new MultipartRequest(request, savePath, maxSize, "UTF-8", new MyFileRenamePolicy());
				
				String ownNo = request.getParameter("ownNumber");
				String ownName = request.getParameter("userName");
				
				// 파일 원본 이름/ 바뀐이름 저장
				ArrayList<String> saveFiles = new ArrayList<String>();
				ArrayList<String> originFiles = new ArrayList<String>();
				
				Enumeration<String> files = multiRequest.getFileNames();
				while(files.hasMoreElements()) {
					
				}
				
			}
			
		}
		
		int result = new MemberService().insertMember(m);
		
		if(result > 0) {
			response.sendRedirect(request.getContextPath());
		}else {
			request.setAttribute("msg", "회원가입에 실패하였습니다.");
			request.getRequestDispatcher("WEB-INF/views/common/errorPage.jsp");
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
