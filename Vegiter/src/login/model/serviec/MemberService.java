package login.model.serviec;

import static common.JDBCTemplate.rollback;
import static common.JDBCTemplate.commit;
import static common.JDBCTemplate.close;
import static common.JDBCTemplate.getConnection;

import java.sql.Connection;

import login.model.dao.MemberDAO;
import login.model.vo.Member;

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
	
}
