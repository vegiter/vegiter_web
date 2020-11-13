package board.model.service;

import static common.JDBCTemplate.close;

import static common.JDBCTemplate.commit;
import static common.JDBCTemplate.getConnection;
import static common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import board.model.dao.BoardDAO;
import board.model.vo.Attachment;
import board.model.vo.Board;
import board.model.vo.BookMark;
import board.model.vo.Comments;
import board.model.vo.Content;
import myPage.model.vo.Bookmark;
import vegitalk.model.dao.VegitalkDAO;

public class BoardService {



	public ArrayList selectTList(int i, int bcate) {				//레시피 리스트 불러오기
		//타입별 레시피 목록
		Connection conn=getConnection();
		
		ArrayList list=null;
		
		BoardDAO dao=new BoardDAO();
				
		if(i==1) {
			list=dao.selectBList(conn,bcate);		
			System.out.println(list+"서비스 확인 b");
		}else {
			list=dao.selectTList(conn,bcate);			
			System.out.println(list+"서비스 확인 t");
			}		
			close(conn);
		return list;		
	}
	
	
	public ArrayList selectTList_sort(int i, int sortType, int type) {		//정렬된 레시피 리스트 불러오기	(1이면 보드, 2면 첨부파일 , 두번째는 정렬기준 1=최신순, 2=좋아요순, 3=댓글순,  세번째는 비건게시글타입)
		
		Connection conn=getConnection();
		
		ArrayList list=null;

		BoardDAO dao=new BoardDAO();
		
		if(i==1) {
			list=dao.selectBList_sort(conn,sortType,type);
			
		}else {
			list=dao.selectTList_sort(conn, sortType, type);
		}
		close(conn);
		
		
		return list;
	}



	public Board selectBoard(int bId) {
		Connection conn=getConnection();
		
		int result=new BoardDAO().updateCount(conn,bId);
		
		Board b=null;	
		
		if(result>0) {
			b=new BoardDAO().selectBoard(conn,bId);
				if(b !=null) {
					commit(conn);
				}else {
					rollback(conn);
				}
		}
			close(conn);
			
		return b;
	}


	public int insertRecipe(ArrayList<Content> con, Board b, ArrayList<Attachment> fileList) {
		Connection conn=getConnection();
		BoardDAO dao=new BoardDAO();
		
		System.out.println(fileList);
		
		int result1=dao.insertBoard(conn,b);
		
		int result2=dao.insertAttachment(conn, fileList);
	
		int result3=dao.insertBoardContent(conn,con);
		
		if(result1>0 && result2>0 && result3>0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		
		return result1;
		
	}


	public int deleteBoard(int bId) {
		Connection conn=getConnection();
		
		int result=new BoardDAO().deleteBoard(conn,bId);
		
		if(result>0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}


	public ArrayList<Attachment> selectThumbnail(int bId) {
		Connection conn=getConnection();
		
		int result=new BoardDAO().updateCount(conn,bId);
		
		ArrayList<Attachment> list=null;
		
		if(result>0) {
			list=new BoardDAO().selectThumbnail(conn,bId);
			
			if(list!=null) {
				commit(conn);
			}else {
				rollback(conn);
			}
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		
		return list;
	}

	public BookMark selectBookMark(int bId) {
		Connection conn=getConnection();
		
		int result=new BoardDAO().updateCount(conn,bId);
		
		BookMark bookMark =null;
		
		if(result>0) {
			bookMark=new BoardDAO().selectBookMark(conn,bId);
			
			if(bookMark!=null) {
				commit(conn);
			}else {
				rollback(conn);
			}
		}
		
		close(conn);
		
		return bookMark;
	}

	

	public ArrayList<Content> selectContent(int bId) {
		Connection conn=getConnection();
		
		int result=new BoardDAO().updateCount(conn, bId);
		
		ArrayList<Content> list=null;
		
		if(result>0) {
			list=new BoardDAO().selectContent(conn,bId);
			
			if(list!=null) {
				commit(conn);
			}else {
				rollback(conn);
			}
		}else {
			rollback(conn);
		}
		
		close(conn);

		return list;
	}


	public ArrayList searchTList(int i, String text, int type) {				//검색
		
		Connection conn=getConnection();
		
		ArrayList list=null;
		
		BoardDAO dao=new BoardDAO();
		
		if(i==1) {
			list=dao.searchBList(conn, text, type);
			System.out.println(list+"이거는 뭘까?");
		}else {
			list=dao.searchTList(conn,text,type);
			System.out.println(list+"사진은?");
		}
		
		return list;
	}


	public int updateLike(int num, int bId) {

		Connection conn=getConnection();
		
		int result=new BoardDAO().updateLike(conn,num,bId);
		
		if(result>0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}


	public int insertBookMark(String user, int bId) {
		Connection conn=getConnection();

		BoardDAO dao=new BoardDAO();
		
		int result=dao.insertBookMark(conn,user,bId);
		
		if(result>0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}


	public int deleteBookMark(String user, int bId) {
		Connection conn=getConnection();

		BoardDAO dao=new BoardDAO();
		
		int result=dao.deleteBookMark(conn,user,bId);
		
		if(result>0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}


	public int countComment(int bId) {
		Connection conn = getConnection();
		int result = new BoardDAO().countComment(conn, bId);
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		close(conn);
		return result;
	}


	public ArrayList<Comments> insertComment(Comments c) {
		Connection conn = getConnection();
		
		BoardDAO dao = new BoardDAO();
		
		int result = dao.insertComment(conn, c);
		
		ArrayList<Comments> list = null;
		if(result > 0) {
			commit(conn);
			list = dao.selectCommentList(conn, c.getBoardNo());
		} else {
			rollback(conn);
		}
		
		close(conn);
		
		return list;
	}

	// Mypage에서 북마크리스트 가져오기
	public ArrayList<Bookmark> selectBookMarkById(String userId) {
		Connection conn = getConnection();
		ArrayList<Bookmark> bookList = new BoardDAO().selectBookMarkById(conn, userId);
		
		close(conn);
		return bookList;
	}

	// Bookmark
	public ArrayList<Board> selectBoardByBook(ArrayList<Bookmark> bookList) {
		Connection conn = getConnection();
		ArrayList<Board> bList = new BoardDAO().selectBoardByBook(conn, bookList);
		close(conn);
		return bList;
	}

	public ArrayList<Attachment> selectOnlyThumbnail(ArrayList<Bookmark> bookList) {
		Connection conn = getConnection();
		ArrayList<Attachment> fList = new BoardDAO().selectOnlyThumbnail(conn, bookList);
		close(conn);
		return fList;
	}

}
