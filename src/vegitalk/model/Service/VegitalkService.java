package vegitalk.model.Service;

import static common.JDBCTemplate.getConnection;
import static common.JDBCTemplate.commit;
import static common.JDBCTemplate.rollback;
import static common.JDBCTemplate.close;

import java.sql.Connection;
import java.util.ArrayList;

import board.model.vo.Attachment;
import board.model.vo.Board;
import board.model.vo.Comments;
import vegitalk.model.dao.VegitalkDAO;

public class VegitalkService {

	public int insertPost(Board b, Attachment atc) {
		
		Connection conn = getConnection();
		
		int pResult = new VegitalkDAO().insertPost(conn, b);
		int aResult = new VegitalkDAO().insertAttachment(conn, atc);
		
		System.out.println("service : " + pResult + ", " + aResult);
		
		if(pResult > 0 && aResult > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		close(conn);
		return pResult;
	}

	public int test(String st, int i) {
		Connection conn = getConnection();
		
		int result = new VegitalkDAO().insertPost(conn, st, i);
	
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public ArrayList<Comments> selectReplyList(int bId) {
		Connection conn = getConnection();

		ArrayList<Comments> list = new VegitalkDAO().selectCommentList(conn, bId);
		
		close(conn);

		return list;
	}

	public ArrayList<Comments> insertComment(Comments c) {
		Connection conn = getConnection();
		
		VegitalkDAO vDAO = new VegitalkDAO();
		
		int result = vDAO.insertComment(conn, c);
		
		ArrayList<Comments> list = null;
		if(result > 0) {
			commit(conn);
			list = vDAO.selectCommentList(conn, c.getBoardNo());
		} else {
			rollback(conn);
		}
		
		close(conn);
		
		return list;
	}

	public int countComment(int bId) {
		Connection conn = getConnection();
		int result = new VegitalkDAO().countComment(conn, bId);
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
}
