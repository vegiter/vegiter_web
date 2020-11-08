package login.controller;

<<<<<<< HEAD
import java.io.IOException;
=======
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

<<<<<<< HEAD
import login.model.service.MemberService;
import login.model.vo.Member;
import login.model.vo.Owner;
import shop.model.vo.Shop;
=======
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.oreilly.servlet.MultipartRequest;

import board.model.vo.Attachment;
import common.MyFileRenamePolicy;
import login.model.serviec.MemberService;
import login.model.vo.Member;
import login.model.vo.Owner;
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거

/**
 * Servlet implementation class InsertMemberServlet
 */
<<<<<<< HEAD
@WebServlet(urlPatterns = "/insert.me", name = "InsertMemberServlet")
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// null값으로 넣기

		String userId = request.getParameter("userId");
		if (userId == null) {
			userId = request.getParameter("userId2");
		}
=======
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
	
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
		int code = Integer.parseInt(request.getParameter("code"));
		String userPwd = request.getParameter("userPwd");
		String name = request.getParameter("userName");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String phone = request.getParameter("phone");
		String style = request.getParameter("style");
<<<<<<< HEAD
		if (style != null) {
			if (style.equals("null"))
				style = null;
		}

=======
		if(style.equals("null")) {
			style = null;
		}
		
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
		Member m = new Member();
		m.setMemId(userId);
		m.setMemPwd(userPwd);
		m.setMemCode(code);
		m.setMemName(name);
		m.setMemEmail(email);
<<<<<<< HEAD
		if (gender != null) {
			m.setMemGender(gender.charAt(0));
		} else {
			gender = "N";
=======
		if(gender != null) {
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
			m.setMemGender(gender.charAt(0));
		}
		m.setMemPhone(phone);
		m.setMemStyle(style);
<<<<<<< HEAD

		int result = 0;

		// 일반회원인경우
		if (code == 1) {
			result = new MemberService().insertMember(m);
		} else {
			// 사업자 회원인 경우
			String ownNo = request.getParameter("ownNumber");
			String ownName = request.getParameter("userName");
			String memId = request.getParameter("userId");

			Owner own = new Owner(ownNo, ownName, memId);
			
			String shopName = request.getParameter("shopName");
			String url = request.getParameter("url");
			String address = request.getParameter("address");
			
			Shop shop = new Shop();
			shop.setShopName(shopName);
			shop.setOwnNo(ownNo);
			shop.setShopAddress(address);
			shop.setShopPage(url);

			result = new MemberService().insertMember(m, own, shop);

		}

		if (result > 0) {
			if (code == 1) {
				response.sendRedirect(request.getContextPath());
			} else {
				request.setAttribute("memId", userId);
				System.out.println("insertServlet : " + userId);
				request.getRequestDispatcher("WEB-INF/views/login/businessFileForm.jsp").forward(request, response);
			}
		} else {
			request.setAttribute("msg", "회원가입에 실패하였습니다.");
			request.getRequestDispatcher("WEB-INF/views/common/errorPage.jsp").forward(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
=======
		
		int result = 0;
		
	
		// 일반회원인경우
		result = new MemberService().insertMember(m);
			
		if(result > 0) {
			response.sendRedirect(request.getContextPath());
		}else {
			request.setAttribute("msg", "회원가입에 실패하였습니다.");
			request.getRequestDispatcher("WEB-INF/views/common/errorPage.jsp").forward(request, response);;
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
