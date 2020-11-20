package login.model.dao;

import static common.JDBCTemplate.close;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import login.model.vo.Owner;

public class OwnerDAO {

	private Properties prop = new Properties();

	public OwnerDAO() {
		String fileName = MemberDAO.class.getResource("/sql/member/member-query.properties").getPath();
		try {
			prop.load(new FileReader(fileName));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Owner findOwner(Connection conn, String ownerName, String ownerNum) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Owner o = null;

		String query = prop.getProperty("findOwner");
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, ownerNum);
			pstmt.setString(2, ownerName);
			rset = pstmt.executeQuery();
			if (rset.next()) {
				o = new Owner(rset.getString("own_no"), rset.getString("own_name"), rset.getString("mem_id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}

		return o;
	}

	public Owner selectOwner(Connection conn, String userId) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Owner owner = null;
		String query = prop.getProperty("selectOwner");
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			
			rset = pstmt.executeQuery();
			if(rset.next()) {
				owner = new Owner(rset.getString("own_no"),
								  rset.getString("own_name"),
								  rset.getString("mem_id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
				
		return owner;
	}

	public ArrayList<Owner> selectOwnerAll(Connection conn) {
		Statement stmt = null;
		ResultSet rset = null;
		ArrayList<Owner> ownList = null;
		String query = prop.getProperty("selectOwnerAll");
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			ownList = new ArrayList<Owner>();
			while(rset.next()) {
				ownList.add(new Owner(rset.getString("own_no"),
									rset.getString("own_name"),
									rset.getString("mem_id")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(stmt);
		}
		return ownList;
	}

}
