package login.model.serviec;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.commit;
import static common.JDBCTemplate.getConnection;
import static common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import board.model.dao.BoardDAO;
import board.model.vo.Attachment;
import login.model.dao.MemberDAO;
import login.model.vo.Member;
import login.model.vo.Owner;

public class MemberService {

	public Member loginMember(Member member) {
		Connection conn = getConnection();
		
		Member loginUser = new MemberDAO().loginMember(conn, member);
		
		close(conn);
		
		return loginUser;
	}

	public int checkId(String userId) {
		Connection conn = getConnection();
		
		int result = new MemberDAO().checkId(conn, userId);
		close(conn);
		
		return result;
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

	public int insertMember(Member m, Owner own, ArrayList<Attachment> fileList) {
		Connection conn = getConnection();
		
		MemberDAO mDAO = new MemberDAO();
		
		int result1 = mDAO.insertMember(conn, m);
		int result2 = mDAO.insertOwner(conn, own);
		int result3 = new BoardDAO().insertAttachment(conn, fileList);
		
		if(result1 > 0 && result2 > 0 && result3 >0) {
			commit(conn);
			
		}else {
			rollback(conn);
		}
		close(conn);
		
		return result1;
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

	public int checkOwnNumber(String ownNumber) {
		Connection conn = getConnection();
		int result = new MemberDAO().checkOwnNumber(conn, ownNumber);
		
		close(conn);
		return result;
	}
	
}