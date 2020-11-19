package board.model.dao;

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

import board.model.vo.Attachment;
import board.model.vo.Board;
import board.model.vo.BookMark;
import board.model.vo.Comments;
import board.model.vo.Content;
import myPage.model.vo.Bookmark;

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



	public ArrayList searchBList(Connection conn, String text, int type) {		//검색
		PreparedStatement pstmt=null;
		ResultSet rset=null;
		ArrayList<Board>list=null;
		String query=prop.getProperty("selectBList_search");
		
		try {
			pstmt=conn.prepareStatement(query);
			System.out.println(text+"text는 뭘까?");
			pstmt.setString(1, '%'+text+'%');
			System.out.println(type+"뭘까?");
			pstmt.setInt(2,type);
			
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
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
						
		return list;
	}

	
	public ArrayList searchTList(Connection conn, String text, int type) {			//검색
		PreparedStatement pstmt=null;
		ResultSet rset=null;
		ArrayList<Attachment> list =null;
		
		String query=prop.getProperty("selectTList_search");	///////////////////////////////검색 쿼리 설정!! 
		
		try {
			pstmt=conn.prepareStatement(query);
			pstmt.setInt(1, type);
			rset=pstmt.executeQuery();
			list=new ArrayList<Attachment>();
			while(rset.next()) {
				list.add(new Attachment(										
										rset.getInt("ATC_NO"),
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
			pstmt=conn.prepareStatement(query);
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

	
	public BookMark selectBookMark(Connection conn, int bId) {
		PreparedStatement pstmt=null;
		ResultSet rset=null;
		BookMark bookmark =null;
		
		String query=prop.getProperty("selectBookMark");
		
		try {
			pstmt=conn.prepareStatement(query);
			pstmt.setInt(1, bId);
			rset=pstmt.executeQuery();
			
			if(rset.next()) {
				bookmark=new BookMark(rset.getInt("bmk_no"),
							rset.getString("mem_id"),
							rset.getString("shop_Id"),
							rset.getInt("board_no"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		
		return bookmark;
	}

	
	


	public ArrayList<Content> selectContent(Connection conn, int bId) {
		PreparedStatement pstmt=null;
		ResultSet rset=null;
		ArrayList<Content>list=null;
		
		String query=prop.getProperty("selectRContent");
		
		try {
			pstmt=conn.prepareStatement(query);
			pstmt.setInt(1, bId);
			list=new ArrayList<Content>();
			rset=pstmt.executeQuery();
			
			while(rset.next()) {
				Content con=new Content();
				con.setContent(rset.getString("RCONTENT_CON"));

				list.add(con);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		return list;
	}



	public ArrayList selectBList_sort(Connection conn, int sortType, int type) {
		PreparedStatement pstmt=null;
		ResultSet rset=null;
		ArrayList<Board> list =null;
		String query=null;
		System.out.println(sortType+"");
		if(sortType==1) {
			 query=prop.getProperty("selectBList_RecentSort");
		}else if(sortType==2) {
			 query=prop.getProperty("selectBList_LikeSort");
		}else if(sortType==3){
			 query=prop.getProperty("selectBList_ComSort");
		}else {
			 query=prop.getProperty("selectBList_ViewSort");
		}
			try {
				pstmt=conn.prepareStatement(query);
				pstmt.setInt(1,type);
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
				e.printStackTrace();
			}finally {
				close(rset);
				close(pstmt);
			}
		return list;
	}



	public ArrayList selectTList_sort(Connection conn, int sortType, int type) {
		PreparedStatement pstmt=null;
		ResultSet rset=null;
		ArrayList<Attachment> list =null;
		String query=null;
		
		if(sortType==1) {
			 query=prop.getProperty("selectTList_RecentSort");
		}else if(sortType==2) {
			 query=prop.getProperty("selectTList_LikeSort");
		}else if(sortType==3){
			 query=prop.getProperty("selectTList_ComSort");
		}else {
			 query=prop.getProperty("selectTList_ViewSort");
		}
			try {
				pstmt=conn.prepareStatement(query);
				pstmt.setInt(1,type);
				rset=pstmt.executeQuery();
				list =new ArrayList<Attachment>();
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



	public int updateLike(Connection conn, int num, int bId) {
		PreparedStatement pstmt=null;
		int result=0;
		String query=null;
		
		if(num%2 !=0) {		//like개수 상승
			 query=prop.getProperty("updateLike_plus");
		}else {				//like개수 하락
			 query=prop.getProperty("updateLike_minus");
		}
		
		
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



	public int insertBookMark(Connection conn, String user, int bId) {
		PreparedStatement pstmt=null;
		int result=0;
		String query=prop.getProperty("insertBookMark");
		
		try {
			pstmt=conn.prepareStatement(query);
			pstmt.setString(1, user);
			pstmt.setInt(2, bId);
			
			result=pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}



	public int deleteBookMark(Connection conn, String user, int bId) {
		PreparedStatement pstmt=null;
		int result=0;
		String query=prop.getProperty("deleteBookMark");
		
		try {
			pstmt=conn.prepareStatement(query);
			pstmt.setString(1, user);
			pstmt.setInt(2, bId);
			
			result=pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}



	public int countComment(Connection conn, int bId) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("countComment");
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, bId);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}



	public int insertComment(Connection conn, Comments c) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("insertComment");

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, c.getBoardNo());
			pstmt.setString(2, c.getMemId());
			pstmt.setString(3, c.getComContent());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}



	public ArrayList<Comments> selectCommentList(Connection conn, int boardNo) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Comments> list = null;
		
		String query = prop.getProperty("selectCommentList");
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, boardNo);
			
			rset = pstmt.executeQuery();
			list = new ArrayList<Comments>();
			while(rset.next()) {
				list.add(new Comments(rset.getInt("com_no"),
									  rset.getString("mem_id"),
									  rset.getString("com_content"),
									  rset.getDate("com_date"),
									  rset.getInt("board_no")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}

	
	// Mypage에 북마크 리스트 가져오기
	public ArrayList<Bookmark> selectBookMarkById(Connection conn, String userId) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Bookmark> bookList = null;
		String query = prop.getProperty("selectBookMarkById");
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			rset = pstmt.executeQuery();
			
			bookList = new ArrayList<Bookmark>();
			while(rset.next()) {
				Bookmark book = new Bookmark(rset.getInt("bmk_no"),
											rset.getString("mem_id"),
											rset.getString("shop_id"),
											rset.getInt("board_no"));
				bookList.add(book);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
	
		return bookList;
	}

	public ArrayList<Board> selectBoardByBook(Connection conn, ArrayList<Bookmark> bookList) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Board> bList = null;
		String query = prop.getProperty("selectBoard");
		
		try {
			bList = new ArrayList<Board>();
			for(int i = 0; i < bookList.size(); i++) {
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(1, bookList.get(i).getBoardNo());
				rset = pstmt.executeQuery();
				if(rset.next()) {
					Board b = new Board(rset.getInt("board_no"),
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
					bList.add(b);
				}
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		
		return bList;
	}



	public ArrayList<Attachment> selectOnlyThumbnail(Connection conn, ArrayList<Bookmark> bookList) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String query = prop.getProperty("selectOnlyThumbnail");
		ArrayList<Attachment> fList = null;
		
		try {
			fList = new ArrayList<Attachment>();
			for(int i = 0; i < bookList.size(); i++) {
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(1, bookList.get(i).getBoardNo());
				
				rset = pstmt.executeQuery();
				if(rset.next()) {
					fList.add(new Attachment(rset.getInt("atc_no"),
										rset.getString("mem_id"),
										rset.getInt("atc_type"),
										rset.getString("atc_origin"),
										rset.getString("atc_name"),
										rset.getString("atc_path"),
										rset.getDate("atc_date"),
										rset.getInt("atc_level"),
										rset.getString("atc_status").charAt(0),
										rset.getInt("board_no")));
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		return fList;
	}



	public ArrayList<Board> selectBoardByMem(Connection conn, String userId) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Board> writeList = null;
		String query = prop.getProperty("selectBoardByMem");
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			
			writeList = new ArrayList<Board>();
			rset = pstmt.executeQuery();
			while(rset.next()) {
				writeList.add(new Board(rset.getInt("board_no"),
										rset.getInt("board_code"),
										rset.getString("mem_id"),
										rset.getString("board_title"),
										rset.getDate("board_date"),
										rset.getString("board_content"),
										rset.getInt("board_count"),
										rset.getInt("board_like"),
										rset.getInt("board_com"),
										rset.getString("board_status")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rset);
			
		}
		return writeList;
	}



	public ArrayList<Attachment> selectThumbnailByMem(Connection conn, String userId) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Attachment> writefList = null;
		String query = prop.getProperty("selectThumbnailByMem");
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			
			rset = pstmt.executeQuery();
			writefList = new ArrayList<Attachment>();
			while(rset.next()) {
				writefList.add(new Attachment(rset.getInt("atc_no"),
										rset.getString("mem_id"),
										rset.getInt("atc_type"),
										rset.getString("atc_origin"),
										rset.getString("atc_name"),
										rset.getString("atc_path"),
										rset.getDate("atc_date"),
										rset.getInt("atc_level"),
										rset.getString("atc_status").charAt(0),
										rset.getInt("board_no")));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		
		return writefList;
	}



	public int insertAttachmentForEnroll(Connection conn, ArrayList<Attachment> fileList) {
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
				pstmt.setInt(7,  at.getAtcLevel());;
			
				result += pstmt.executeUpdate();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}



	public ArrayList<Board> selectNotice(Connection conn) {
		Statement stmt = null;
		ResultSet rset = null;
		String query = prop.getProperty("selectNotice");
		ArrayList<Board> noticeList = null;
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			noticeList = new ArrayList<Board>();
			while(rset.next()) {
				noticeList.add(new Board(rset.getInt("board_no"),
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
			e.printStackTrace();
		}finally {
			close(rset);
			close(stmt);
		}
		return noticeList;
	}
	
}
