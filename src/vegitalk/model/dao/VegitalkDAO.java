package vegitalk.model.dao;

import static common.JDBCTemplate.close;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import board.model.vo.Attachment;
import board.model.vo.Board;

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

	public int insertPost(Connection conn, String st, int i) {
		String query = prop.getProperty("test");
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, st);
			pstmt.setInt(2, i);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}
}
