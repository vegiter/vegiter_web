package login.model.serviec;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.commit;
import static common.JDBCTemplate.getConnection;
import static common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import javax.xml.ws.Response;

import board.model.dao.BoardDAO;
import board.model.vo.Attachment;
import login.model.dao.MemberDAO;
import login.model.vo.Member;
import login.model.vo.Owner;

public class MemberService {

	public Member loginMember(Member member) {
		Connection conn = getConnection();
		
		Member loginUser =  new MemberDAO().loginMember(conn, member);
		close(conn);
		
		return loginUser;
	}
	public Member loginSocialMember(Member member) {
		Connection conn = getConnection();
		
		Member loginUser =  new MemberDAO().loginSocialMember(conn, member);
		close(conn);
		
		return loginUser;
	}

	public int checkId(String userId) {
		Connection conn = getConnection();
		
		int result = new MemberDAO().checkId(conn, userId);
		close(conn);
		
		return result;
	}

	public int insertMember(ArrayList<Attachment> fileList) {
		Connection conn = getConnection();
		
		int result = new BoardDAO().insertAttachment(conn, fileList);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	
	public int insertMember(Member m, Owner own) {
		Connection conn = getConnection();
		MemberDAO mDAO = new MemberDAO();
		
		int result1 = mDAO.insertMember(conn, m);
		int result2 = mDAO.insertOwner(conn, own);
		
		if(result1 > 0 && result2 > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		return result1;
	}

	public int insertMember(Member m) {
		Connection conn = getConnection();
				
		int result = new MemberDAO().insertMember(conn, m);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public int checkOwnNumber(String ownNumber) {
		Connection conn = getConnection();
		int result = new MemberDAO().checkOwnNumber(conn, ownNumber);
		
		close(conn);
		return result;
	}
 
	public Member findId(String name, String email) {
		Connection conn = getConnection();
		
		Member m = new MemberDAO().findMember(conn, name, email);
		
		close(conn);
		
		return m;
	}

	public Member findPwd(String name, String id, String email) {
		Connection conn = getConnection();
		
		Member m = new MemberDAO().findPwd(conn, name, id, email);
		
		close(conn);
		
		return m;
	}

	public int changePwd(String id, String pwd) {
		Connection conn = getConnection();
		
		int result = new MemberDAO().changePwd(conn, id, pwd);
		
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		
		close(conn);
		return result;
	}
	public Member findIdByPhone(String name, String phone) {
		Connection conn = getConnection();
		Member mem = new MemberDAO().findMemberByPhone(conn, name, phone);
		close(conn);
		return mem;
	}
	public Member findPwdByPhone(String name, String id, String phone) {
		Connection conn = getConnection();
		Member mem = new MemberDAO().findPwdByPhone(conn, name, id, phone);
		close(conn);
		return mem;
	}
	public Member findPwdOwner(String name, String id, String number) {
		Connection conn = getConnection();
		Member mem = new MemberDAO().findPwdOwner(conn, name, id, number);
		close(conn);
		return mem;
	}
	public int checkEmail(String email) {
		Connection conn = getConnection();
		int result = new MemberDAO().checkEmail(conn, email);
		close(conn);
		return result;
	}
	public int checkPhone(String phone) {
		Connection conn = getConnection();
		int result = new MemberDAO().checkPhone(conn, phone);
		close(conn);
		return result;
	}

}
