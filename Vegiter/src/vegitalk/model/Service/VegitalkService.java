package vegitalk.model.Service;

import static common.JDBCTemplate.getConnection;
import static common.JDBCTemplate.commit;
import static common.JDBCTemplate.rollback;
import static common.JDBCTemplate.close;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;

import board.model.vo.Attachment;
import board.model.vo.Board;
import board.model.vo.DietList;
import board.model.vo.PageInfo;
import vegitalk.model.dao.VegitalkDAO;

public class VegitalkService {

	public int insertPost(Board b, Attachment atc) {
		
		Connection conn = getConnection();
		
		int pResult = new VegitalkDAO().insertPost(conn, b);
		int aResult = new VegitalkDAO().insertAttachment(conn, atc);
		
		if(pResult > 0 && aResult > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		close(conn);
		return pResult;
	}

	public int insertDiet(DietList dl, Board b) {
		Connection conn = getConnection();
		VegitalkDAO vd = new VegitalkDAO();
		int pResult = vd.insertPost(conn, b);
		int dResult = vd.insertDiet(conn, dl);
		
		if(dResult > 0 && pResult > 0) {
			commit(conn);
		} else{
			rollback(conn);
		}
		close(conn);
		return pResult;
	}
	
	public int getPostCountAll() {
		Connection conn = getConnection();
		int postCount = new VegitalkDAO().getPostCountAll(conn);
		close(conn);
		return postCount;
	}
	
	public int getPostCount(int boardCode) {
		Connection conn = getConnection();
		int postCount = new VegitalkDAO().getPostCount(conn, boardCode);
		close(conn);
		return postCount;
	}

	public ArrayList<Board> getPListAll(PageInfo pi) {
		Connection conn = getConnection();
		ArrayList<Board> pList = new VegitalkDAO().getPListAll(conn , pi);
		close(conn);
		return pList;
	}
	
	public ArrayList<Board> getPList(PageInfo pi, int boardCode) {
		Connection conn = getConnection();
		ArrayList<Board> pList = new VegitalkDAO().getPList(conn, pi, boardCode);
		close(conn);
		return pList;
	}
	
	public ArrayList<Attachment> getAList() {
		Connection conn = getConnection();
		ArrayList<Attachment>aList = new VegitalkDAO().getAList(conn);
		close(conn);
		return aList;
	}

	public Board selectPost(int bId) {
		Connection conn = getConnection();
		Board post = new VegitalkDAO().selectPost(conn, bId);
		close(conn);
		return post;
	}

	public Attachment selectAtc(int bId) {
		Connection conn = getConnection();
		Attachment atc = new VegitalkDAO().selectAtc(conn, bId);
		close(conn);
		return atc;
	}

	public int deletePost(int bId) {
		Connection conn = getConnection();
		int result = new VegitalkDAO().deletePost(conn, bId);
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public int editPost(Board post) {
		Connection conn = getConnection();
		int result = new VegitalkDAO().editPost(conn, post);
		
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public int updateNewAtc(Attachment atc, int bId) {
		Connection conn = getConnection();
		int offStatusResult = new VegitalkDAO().offAtcStatus(conn, bId);
		int insertResult = new VegitalkDAO().updateNewAtc(conn, atc, bId);
		
		if(offStatusResult > 0 && insertResult > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		close(conn);
		return insertResult;
	}
}
