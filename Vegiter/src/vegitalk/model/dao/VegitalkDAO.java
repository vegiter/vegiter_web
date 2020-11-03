package vegitalk.model.dao;

import static common.JDBCTemplate.close;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import board.model.vo.Attachment;
import board.model.vo.Board;
import board.model.vo.DietList;

public class VegitalkDAO {
	private Properties prop = new Properties();
			
	public VegitalkDAO() {
		String fileName = VegitalkDAO.class.getResource("/sql/board/board-query.properties").getPath();
		try {
			prop.load(new BufferedReader(new FileReader(fileName)));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int insertPost(Connection conn, Board b) {
		String query = prop.getProperty("insertPost");
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, b.getBoard_code());
			pstmt.setString(2, b.getMem_id());
			pstmt.setString(3, b.getBoard_content());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}

	public int insertAttachment(Connection conn, Attachment atc) {
		String query = prop.getProperty("insertAttachment");
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, atc.getMemId());
			pstmt.setInt(2, atc.getAtcType());
			pstmt.setString(3, atc.getAtcOrigin());
			pstmt.setString(4, atc.getAtcName());
			pstmt.setString(5, atc.getAtcPath());
			pstmt.setInt(6, atc.getAtcLevel());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}
	
	public String arrToStr(String[] arr) {
		String str = "";
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length - 1){
				str += arr[i];
			} else {
				str += arr[i]+ ",";
			}
		}
		return str;
	}

	public int insertDiet(Connection conn, DietList dl) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = prop.getProperty("insertDiet");
		
		String mfStr = arrToStr(dl.getmFood());
		String muStr = arrToStr(dl.getmUrl());
		String lfStr = arrToStr(dl.getlFood());
		String luStr = arrToStr(dl.getlUrl());
		String efStr = arrToStr(dl.geteFood());
		String euStr = arrToStr(dl.geteUrl());
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, mfStr);
			pstmt.setString(2, muStr);
			pstmt.setString(3, lfStr);
			pstmt.setString(4, luStr);
			pstmt.setString(5, efStr);
			pstmt.setString(6, euStr);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}

	public int getPostCountAll(Connection conn) {
		Statement stmt = null;
		ResultSet rset = null;
		int postCount = 0;
		String query = prop.getProperty("getPostCountAll");
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			if(rset.next()) {
				postCount = rset.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		return postCount;
	}
	
	public int getPostCount(Connection conn, int boardCode) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		int postCount = 0;
		String query = prop.getProperty("getPostCountAll");
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, boardCode);
			rset = pstmt.executeQuery(query);
			
			if(rset.next()) {
				postCount = rset.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return postCount;
	}
}
