package board.model.dao;

import static common.JDBCTemplate.close;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import board.model.vo.Attachment;
import board.model.vo.Board;

public class BoardDAO {
	private Properties prop = new Properties();
	
	
	public BoardDAO() {
		String fileName = BoardDAO.class.getResource("/sql/board/board-query.properties").getPath();
		try {
			prop.load(new FileReader(fileName));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

	public int insertAttachment(Connection conn, ArrayList<Attachment> fileList) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = prop.getProperty("insertAttachment");
		
		try {
			for(int i = 0; i < fileList.size(); i++) {
				Attachment at = fileList.get(i);
				
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, at.getMemId());
				pstmt.setInt(2, at.getBoardNo());
				pstmt.setInt(3, at.getAtcType());
				pstmt.setString(4, at.getAtcOrigin());
				pstmt.setString(5, at.getAtcName());
				pstmt.setString(6, at.getAtcPath());
				pstmt.setDate(7, at.getAtcDate());
				pstmt.setInt(8,  at.getAtcLevel());;
			
				result += pstmt.executeUpdate();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}



	
	public ArrayList selectBList(Connection conn, int bcate) {		//레시피 가져오기
		PreparedStatement pstmt=null;
		ResultSet rset=null;
		ArrayList<Board>list=null;
		
		String query=prop.getProperty("selectBList_TypeSort");
		
		try {
			pstmt=conn.prepareStatement(query);
			pstmt.setInt(1, bcate);
			rset=pstmt.executeQuery();
			
			
			while(rset.next()) {
				list.add(new Board(rset.getInt("board_no"),
									rset.getInt("board_code"),
									rset.getString("mem_id"),
									rset.getString("board_title"),
									rset.getDate("board_date"),
									rset.getString("board_content"),
									rset.getInt("board_count"),
									rset.getInt("board_like"),
									rset.getInt("board_com"),
									rset.getInt("board_cate"),
									rset.getString("board_status")));				
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}

		return list;
	}

	
	
	public ArrayList selectTList(Connection conn, int bcate) {	//레시피 가져오기
		PreparedStatement pstmt=null;
		ResultSet rset=null;
		ArrayList<Attachment> list =null;
		
		String query=prop.getProperty("selectTList_TypeSort");
		//selectTList_TypeSort=SELECT * FROM ATTACHMENT WHERE STATUS='Y' AND FILE_LEVEL=0 AND BOARD_CATE=?
		try {
			pstmt=conn.prepareStatement(query);
			rset=pstmt.executeQuery();
			
			while(rset.next()) {
				list.add(new Attachment(rset.getInt("atcNo"),
										rset.getString("atcName")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		return list;
	}



	public ArrayList selectBList(Connection conn, String text) {		//검색
		PreparedStatement pstmt=null;
		ResultSet rset=null;
		ArrayList<Board>list=null;
		String query=prop.getProperty("selectBList_select");
		
		try {
			pstmt=conn.prepareStatement(query);
			pstmt.setString(1, text);
			rset=pstmt.executeQuery();
			
			while(rset.next()) {
				list.add(new Board(rset.getInt("board_no"),
									rset.getInt("board_code"),
									rset.getString("mem_id"),
									rset.getString("board_title"),
									rset.getDate("board_date"),
									rset.getString("board_content"),
									rset.getInt("board_count"),
									rset.getInt("board_like"),
									rset.getInt("board_com"),
									rset.getInt("board_cate"),
									rset.getString("board_status")));				
			}	
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
						
		return list;
	}

	public ArrayList selectTList(Connection conn, String text) {			//검색
		PreparedStatement pstmt=null;
		ResultSet rset=null;
		ArrayList<Attachment> list =null;
		
		String query=prop.getProperty("selectTList_select");
		
		try {
			pstmt=conn.prepareStatement(query);
			rset=pstmt.executeQuery();
			
			while(rset.next()) {
				list.add(new Attachment(rset.getInt("atcNo"),
										rset.getString("atcName")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		
		
		
		return list;
	}

	public int updateCount(Connection conn, int bId) {
		PreparedStatement pstmt=null;
		int result=0;
		
		String query=prop.getProperty("updateCount");
		
		
		
		return 0;
	}

	public Board selectBoard(Connection conn, int bId) {
		PreparedStatement pstmt=null;
		Board b=null;
		ResultSet rset=null;
		
		String query=prop.getProperty("selectBoard");
		
		
		
		return null;
	}

	public ArrayList<Attachment> selectThumbnail(Connection conn, int bId) {
		PreparedStatement pstmt=null;
		ResultSet rset=null;
		ArrayList<Attachment>list=null;
		
		String query=prop.getProperty("selectRecipeThumbnail");
		
		try {
			pstmt=conn.prepareStatement(query);
			pstmt.setInt(1,bId);
			rset=pstmt.executeQuery();
			list=new ArrayList<Attachment>();
			
			while(rset.next()) {
				Attachment at=new Attachment();
				at.setFile
			}
			/*	private int atcNo;
	private String memId;
	private int atcType;
	private String atcOrigin;
	private String atcName;
	private String atcPath;
	private Date atcDate;
	private int atcLevel;
	private char atcStatus;
	private int boardNo;*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return null;
	}
	
	
}
