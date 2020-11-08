package login.model.dao;

import static common.JDBCTemplate.close;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import board.model.vo.Attachment;
import login.model.vo.Member;
import login.model.vo.Owner;
<<<<<<< HEAD
import shop.model.vo.Shop;

public class MemberDAO {
	private Properties prop = new Properties();

=======

public class MemberDAO {
	private Properties prop = new Properties();
	
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
	public MemberDAO() {
		String fileName = MemberDAO.class.getResource("/sql/member/member-query.properties").getPath();
		try {
			prop.load(new FileReader(fileName));
<<<<<<< HEAD

=======
			
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Member loginMember(Connection conn, Member member) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member loginUser = null;
<<<<<<< HEAD

		String query = prop.getProperty("loginMember");

=======
		
		String query = prop.getProperty("loginMember");
		
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getMemId());
			pstmt.setString(2, member.getMemPwd());
<<<<<<< HEAD

			rset = pstmt.executeQuery();

			if (rset.next()) {
				loginUser = new Member(rset.getString("mem_id"), rset.getString("mem_pwd"), rset.getInt("mem_code"),
						rset.getString("mem_name"), rset.getString("mem_gender").charAt(0), rset.getString("mem_phone"),
						rset.getString("mem_email"), rset.getString("mem_style"), rset.getString("mem_status"),
						rset.getDate("mem_deldate"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}

		return loginUser;
	}

	public Member loginSocialMember(Connection conn, Member member) {

		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member loginUser = null;

		String query = prop.getProperty("loginSocial");

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getMemId());

			rset = pstmt.executeQuery();

			if (rset.next()) {
				loginUser = new Member(rset.getString("mem_id"), rset.getString("mem_pwd"), rset.getInt("mem_code"),
						rset.getString("mem_name"), rset.getString("mem_gender").charAt(0), rset.getString("mem_phone"),
						rset.getString("mem_email"), rset.getString("mem_style"), rset.getString("mem_status"),
						rset.getDate("mem_deldate"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}

=======
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				loginUser = new Member(rset.getString("mem_id"),
										rset.getString("mem_pwd"),
										rset.getInt("mem_code"),
										rset.getString("mem_name"),
										rset.getString("mem_gender").charAt(0),
										rset.getString("mem_phone"),
										rset.getString("mem_email"),
										rset.getString("mem_style"),
										rset.getString("mem_status"),
										rset.getDate("mem_deldate"));
				System.out.println(loginUser);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
		return loginUser;
	}

	public int checkId(Connection conn, String userId) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		int result = 0;
		String query = prop.getProperty("checkId");
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
<<<<<<< HEAD

			rset = pstmt.executeQuery();

			if (rset.next()) {
				result = rset.getInt(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}

=======
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				result = rset.getInt(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
		return result;
	}

	public int insertMember(Connection conn, Member m) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = prop.getProperty("insertMember");
<<<<<<< HEAD

=======
		
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getMemId());
			pstmt.setString(2, m.getMemPwd());
			pstmt.setInt(3, m.getMemCode());
			pstmt.setString(4, m.getMemName());
<<<<<<< HEAD
			pstmt.setString(5, m.getMemGender() + "");
			pstmt.setString(6, m.getMemPhone());
			pstmt.setString(7, m.getMemEmail());
			pstmt.setString(8, m.getMemStyle());

			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
=======
			pstmt.setString(5, m.getMemGender()+"");
			pstmt.setString(6, m.getMemPhone());
			pstmt.setString(7, m.getMemEmail());
			pstmt.setString(8, m.getMemStyle());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
			close(pstmt);
		}
		return result;
	}

	public int insertOwner(Connection conn, Owner own) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = prop.getProperty("insertOwner");
<<<<<<< HEAD

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, own.getOwnNo());
			pstmt.setString(2, own.getOwnName());
			pstmt.setString(3, own.getMemId());

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
=======
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, own.getOwnNo());
			pstmt.setString(2,  own.getOwnName());
			pstmt.setString(3, own.getMemId());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
			close(pstmt);
		}
		return result;
	}

	public int checkOwnNumber(Connection conn, String ownNumber) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
<<<<<<< HEAD

=======
		
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
		String query = prop.getProperty("checkOwnNumber");
		int result = 0;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, ownNumber);
<<<<<<< HEAD

			rset = pstmt.executeQuery();

			if (rset.next()) {
				result = rset.getInt(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}

		return result;
	}

	public Member findMember(Connection conn, String name, String email) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member m = null;

		String query = prop.getProperty("findMember");

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			rset = pstmt.executeQuery();
			if (rset.next()) {
				m = new Member(rset.getString("mem_id"), rset.getString("mem_pwd"), rset.getInt("mem_code"),
						rset.getString("mem_name"), rset.getString("mem_gender").charAt(0), rset.getString("mem_phone"),
						rset.getString("mem_email"), rset.getString("mem_style"), rset.getString("mem_status"),
						rset.getDate("mem_deldate"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}

		return m;
	}

	public Member findPwd(Connection conn, String name, String id, String email) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member m = null;

		String query = prop.getProperty("findPwd");

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, id);
			pstmt.setString(3, email);
			rset = pstmt.executeQuery();
			if (rset.next()) {
				m = new Member(rset.getString("mem_id"), rset.getString("mem_pwd"), rset.getInt("mem_code"),
						rset.getString("mem_name"), rset.getString("mem_gender").charAt(0), rset.getString("mem_phone"),
						rset.getString("mem_email"), rset.getString("mem_style"), rset.getString("mem_status"),
						rset.getDate("mem_deldate"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}

		return m;
	}

	public int changePwd(Connection conn, String id, String pwd) {
		PreparedStatement pstmt = null;
		int result = 0;

		String query = prop.getProperty("changePwd");

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, pwd);
			pstmt.setString(2, id);

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;
	}

	public Member findMemberByPhone(Connection conn, String name, String phone) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member mem = null;
		String query = prop.getProperty("findMemberByPhone");

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, phone);
			rset = pstmt.executeQuery();

			if (rset.next()) {
				mem = new Member(rset.getString("mem_id"), rset.getString("mem_pwd"), rset.getInt("mem_code"),
						rset.getString("mem_name"), rset.getString("mem_gender").charAt(0), rset.getString("mem_phone"),
						rset.getString("mem_email"), rset.getString("mem_style"), rset.getString("mem_status"),
						rset.getDate("mem_deldate"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}

		return mem;
	}

	public Member findPwdByPhone(Connection conn, String name, String id, String phone) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member mem = null;
		String query = prop.getProperty("findPwdByPhone");

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, id);
			pstmt.setString(3, phone);
			rset = pstmt.executeQuery();

			if (rset.next()) {
				mem = new Member(rset.getString("mem_id"), rset.getString("mem_pwd"), rset.getInt("mem_code"),
						rset.getString("mem_name"), rset.getString("mem_gender").charAt(0), rset.getString("mem_phone"),
						rset.getString("mem_email"), rset.getString("mem_style"), rset.getString("mem_status"),
						rset.getDate("mem_deldate"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return mem;
	}

	public Member findPwdOwner(Connection conn, String name, String id, String number) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member mem = null;
		String query = prop.getProperty("findPwdOwner");

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, id);
			pstmt.setString(3, number);
			rset = pstmt.executeQuery();

			if (rset.next()) {
				mem = new Member(rset.getString("mem_id"), rset.getString("mem_pwd"), rset.getInt("mem_code"),
						rset.getString("mem_name"), rset.getString("mem_gender").charAt(0), rset.getString("mem_phone"),
						rset.getString("mem_email"), rset.getString("mem_style"), rset.getString("mem_status"),
						rset.getDate("mem_deldate"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return mem;
	}

	public int insertShop(Connection conn, Shop shop) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = prop.getProperty("insertShop");
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, shop.getOwnNo());
			pstmt.setString(2, shop.getShopName());
			pstmt.setString(3, shop.getShopAddress());
			pstmt.setString(4, shop.getShopPage());
			
			result = pstmt.executeUpdate();
=======
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				result = rset.getInt(1);
			}
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
<<<<<<< HEAD
=======
			close(rset);
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
			close(pstmt);
		}
		
		return result;
	}

}
