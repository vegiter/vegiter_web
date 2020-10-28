package board.model.service;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.commit;
import static common.JDBCTemplate.getConnection;
import static common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import board.model.dao.BoardDAO;
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

}
