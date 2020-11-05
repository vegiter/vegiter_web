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
import board.model.vo.Content;

public class BoardService {



	public ArrayList selectTList(int i, int bcate) {
		
		System.out.println("Service");
		//타입별 레시피 목록
		Connection conn=getConnection();
		
		ArrayList list=null;
		
		BoardDAO dao=new BoardDAO();
				

		if(i==1) {
			list=dao.selectBList(conn,bcate);		
		}else {
			list=dao.selectTList(conn,bcate);			
			}		
		close(conn);


		return list;		
	}
	
	
	public ArrayList selectTList(int i, String text) {		//검색
		Connection conn=getConnection();
		BoardDAO dao=new BoardDAO();
		ArrayList list=null;
		
	
		
		if(i==1) {
			list=dao.selectBList(conn, text);
		}else{
			list=dao.selectTList(conn,text);
		}
		


		
		close(conn);
		
		return list;
		
	}
	
	
	

//	public int insertRecipe(Board b, ArrayList<Attachment> fileList) {
//		Connection conn=getConnection();
//		BoardDAO dao=new BoardDAO();
//		
//		int result1=dao.insertBoard(conn,b);
//		int result2=dao.insertAttachment(conn, fileList);
//	
//		if(result1>0 && result2>0) {
//			commit(conn);
//		}else {
//			rollback(conn);
//		}
//		close(conn);
//		
//		return result1;
//	}



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
		
		int result=new 
		
		
		
		return null;
	}




	
	
//	public ArrayList<Attachment> selectThumbnail(int bId) {
//		Connection conn=getConnection();
//		int result=new BoardDAO().updateCount(conn, bId);
//		
//		ArrayList<Attachment>list=null;
//		
//		if(result>0) {
//			list=new BoardDAO().selectThumbnail(conn,bId);
//			
//				if(list !=null) {
//					commit(conn);
//				}else {
//					rollback(conn);
//				}
//		}else {
//			rollback(conn);
//		}	
//			
//			close(conn);						
//		
//		return list;
//	}

}
