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
import board.model.vo.Content;

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
		String query = prop.getProperty("insertAttachment_recipe");
		int result = 0;
		System.out.println(fileList);
		try {
			for(int i = 0; i < fileList.size(); i++) {
				Attachment at = fileList.get(i);
				
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, at.getMemId());
				pstmt.setInt(2, at.getAtcType());
				pstmt.setString(3, at.getAtcOrigin());
				pstmt.setString(4, at.getAtcName());
				pstmt.setString(5, at.getAtcPath());
				pstmt.setInt(6, at.getAtcLevel());
			
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
			list=new ArrayList<Board>();
			
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
		
		try {
			pstmt=conn.prepareStatement(query);
			pstmt.setInt(1, bcate);
			rset=pstmt.executeQuery();
			list=new ArrayList<Attachment>();			
			while(rset.next()) {
					list.add(new Attachment(rset.getInt("ATC_NO"),
											rset.getString("ATC_NAME"),
											rset.getInt("board_no")));
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
				list.add(new Attachment(										
										rset.getInt("atcNo"),
										rset.getString("atcName"),
										rset.getInt("board_no")));
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
		
		String query=prop.getProperty("updateCount_recipe");
		
		try {
			pstmt=conn.prepareStatement(query);
			pstmt.setInt(1, bId);
			result=pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}			
		return result;
	}

	
	
	public Board selectBoard(Connection conn, int bId) {
		PreparedStatement pstmt=null;
		Board b=null;
		ResultSet rset=null;
		
		String query=prop.getProperty("selectBoard");
		
		try {
			pstmt=conn.prepareStatement(query);
			pstmt.setInt(1, bId);
			rset=pstmt.executeQuery();

			if(rset.next()) {
				b=new Board(rset.getInt("board_no"),
							rset.getInt("board_code"),
							rset.getString("mem_id"),
							rset.getString("board_title"),
							rset.getDate("board_date"),
							rset.getString("board_content"),
							rset.getInt("board_count"),
							rset.getInt("board_like"),
							rset.getInt("board_com"),
							rset.getInt("board_cate"),
							rset.getString("board_status"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		
		return b;
	}




//	public ArrayList<Attachment> selectThumbnail(Connection conn, int bId) {
//		PreparedStatement pstmt=null;
//		ResultSet rset=null;
//		ArrayList<Attachment>list=null;
//		
//		String query=prop.getProperty("selectRecipeThumbnail");
//		
//		try {
//			pstmt=conn.prepareStatement(query);
//			pstmt.setInt(1,bId);
//			rset=pstmt.executeQuery();
//			list=new ArrayList<Attachment>();
//			
//			while(rset.next()) {
//				Attachment at=new Attachment();
//				at.setFile
//			}
//			/*	private int atcNo;
//	private String memId;
//	private int atcType;
//	private String atcOrigin;
//	private String atcName;
//	private String atcPath;
//	private Date atcDate;
//	private int atcLevel;
//	private char atcStatus;
//	private int boardNo;*/
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		
//		
//		return null;
//	}



	public int insertBoard(Connection conn, Board b) {
		PreparedStatement pstmt=null;
		int result=0;
		String query=prop.getProperty("insertBoard_recipe");
		
		try {
			pstmt=conn.prepareStatement(query);
			pstmt.setString(1, b.getMem_id());
			pstmt.setString(2,b.getBoard_title());
			pstmt.setInt(3, b.getBoard_cate());
			
			result=pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}

	public int insertBoardContent(Connection conn, ArrayList<Content> con) {
		PreparedStatement pstmt=null;
		int result=0;
		String query=prop.getProperty("insertBoardContent_recipe");
		
		try {
			for(int i=0; i<con.size(); i++){
				Content ct=con.get(i);
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, ct.getContent());
				
				result +=pstmt.executeUpdate();
			}	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}



	public int deleteBoard(Connection conn, int bId) {
		PreparedStatement pstmt=null;
		int result=0;
		
		String query=prop.getProperty("deleteRecipe");
			
		try {
			pstmt=conn.prepareStatement("query");
			pstmt.setInt(1, bId);
			
			result=pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}



	public ArrayList<Attachment> selectThumbnail(Connection conn, int bId) {
		PreparedStatement pstmt=null;
		ResultSet rset=null;
		ArrayList<Attachment> list=null;
		
		String query=prop.getProperty("selectRecipe");
		
		try {
			pstmt=conn.prepareStatement(query);
			pstmt.setInt(1, bId);
			list=new ArrayList<Attachment>();
			rset=pstmt.executeQuery();
			
			while(rset.next()) {
				Attachment at=new Attachment();
				at.setAtcNo(rset.getInt("atc_no"));
				at.setAtcOrigin(rset.getString("atc_origin"));
				at.setAtcName(rset.getString("atc_name"));
				at.setAtcPath(rset.getString("atc_path"));
				at.setAtcDate(rset.getDate("atc_date"));
				
				list.add(at);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		return list;
	}
	
	
}
