package login.model.service;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.commit;
import static common.JDBCTemplate.getConnection;
import static common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import board.model.dao.BoardDAO;
import board.model.vo.Attachment;
import board.model.vo.PageInfo;
import login.model.dao.MemberDAO;
import login.model.vo.Member;
import login.model.vo.Owner;
import shop.model.vo.Shop;

public class MemberService {

	public Member loginMember(Member member) {
		Connection conn = getConnection();

		Member loginUser = new MemberDAO().loginMember(conn, member);
		close(conn);

		return loginUser;
	}

	public Member loginSocialMember(Member member) {
		Connection conn = getConnection();

		Member loginUser = new MemberDAO().loginSocialMember(conn, member);
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

		int result = new BoardDAO().insertAttachmentForEnroll(conn, fileList);

		if (result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public int insertMember(Member m, Owner own, Shop shop) {
		Connection conn = getConnection();
		MemberDAO mDAO = new MemberDAO();

		int result1 = mDAO.insertMember(conn, m);
		int result2 = mDAO.insertOwner(conn, own);
		int result3 = mDAO.insertShop(conn, shop);

		if (result1 > 0 && result2 > 0 && result3 > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}

		close(conn);
		return result1;
	}

	public int insertMember(Member m) {
		Connection conn = getConnection();

		int result = new MemberDAO().insertMember(conn, m);
		if (result > 0) {
			commit(conn);
		} else {
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

		if (result > 0) {
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
	
	   public int checkPwd(String userId,String userPwd) {
		      Connection conn = getConnection();
		      
		      int result = new MemberDAO().checkPwd(conn, userId, userPwd);
		      close(conn);
		      
		      return result;
		   }
		//   public Member selectMember(String loginUserId) {
//		      Connection conn = getConnection();
//		      Member member = new MemberDAO().selectMember(conn, loginUserId);
//		      close(conn);
//		      return member;
		//   }

		   public int updateMember(Member mem) {
		      Connection conn = getConnection();
		      int result = new MemberDAO().updateMember(conn,mem);
		      if (result > 0 ) {
		         commit(conn);
		      }else {
		         rollback(conn);
		      }
		      close(conn);
		      System.out.println(result);
		      return result;
		   }

		   public int updatePwd(String userId, String newPwd) {
		      Connection conn = getConnection();
		      
		      int result = new MemberDAO().updatePwd(conn, userId, newPwd);
		      
		      if(result > 0) {
		         commit(conn);
		      } else {
		         rollback(conn);
		      }
		      
		      close(conn);
		      return result;
		   }

		   public int deleteMember(String userId) {
		      Connection conn = getConnection();
		      
		      int result = new MemberDAO().deleteMember(conn, userId);
		      
		      if(result > 0) {
		         commit(conn);
		      } else {
		         rollback(conn);
		      }
		      
		      close(conn);
		      
		      return result;
		   }

		public ArrayList<Member> selectMemberAll() {
			Connection conn = getConnection();
			ArrayList<Member> memList = new MemberDAO().selectMemberAll(conn);
			close(conn);
			return memList;
		}

		public int getListCount(int num) {
			Connection conn = getConnection();
			int result = new MemberDAO().getListCount(conn, num);
			return result;
		}

		public ArrayList<Member> selectMemList(PageInfo pi) {
			Connection conn = getConnection();
			ArrayList<Member> memList = new MemberDAO().selectMemList(conn, pi);
			close(conn);
			return memList;
		}

}
