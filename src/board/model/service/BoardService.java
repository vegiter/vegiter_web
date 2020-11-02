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

public class BoardService {

	public ArrayList selectTList(int i) {
			
		Connection conn=getConnection();
		
		ArrayList list=null;
		
		BoardDAO dao=new BoardDAO();
		
		if(i==1) {
			list=dao.selectBList(conn);
			
		}else {
			list=dao.selectTList(conn);
		}
		
		close(conn);
		
		
		return list;
	}

	public ArrayList selectTList(int i, int bcate) {
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

	public int insertRecipe(Board b, ArrayList<Attachment> fileList) {
		Connection conn=getConnection();
		BoardDAO dao=new BoardDAO();
		
		int result1=dao.insertBoard(conn,b);
		int result2=dao.insertAttachment(conn, fileList);
		
		
		
		
		return 0;
	}

	public ArrayList<Board> selectTList(int i, String text) {		//검색
		Connection conn=getConnection();
		BoardDAO dao=new BoardDAO();
		ArrayList list=null;
		
		if(i==1) {
			list=dao.selectBList(conn, text);
		}else {
			list=dao.selectTList(conn,text);
		}
		
		close(conn);
		
		return list;
	}

}
