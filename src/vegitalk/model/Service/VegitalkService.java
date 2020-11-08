package vegitalk.model.Service;

import static common.JDBCTemplate.getConnection;
import static common.JDBCTemplate.commit;
import static common.JDBCTemplate.rollback;
import static common.JDBCTemplate.close;

import java.sql.Connection;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Arrays;

import board.model.vo.Attachment;
import board.model.vo.Board;
import board.model.vo.DietList;
import board.model.vo.PageInfo;
=======

import board.model.vo.Attachment;
import board.model.vo.Board;
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
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

<<<<<<< HEAD
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

	public Board selectPost(int bId, int bCode) {
		Connection conn = getConnection();
		Board post = new VegitalkDAO().selectPost(conn, bId, bCode);
		close(conn);
		return post;
	}

	public Attachment selectAtc(int bId) {
		Connection conn = getConnection();
		Attachment atc = new VegitalkDAO().selectAtc(conn, bId);
		close(conn);
		return atc;
	}
=======
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

>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
}
