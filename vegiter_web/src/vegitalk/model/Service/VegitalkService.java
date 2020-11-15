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
import board.model.vo.BookMark;
import board.model.vo.Comments;
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
	
	public int getPostCountAll(int opt) {
		Connection conn = getConnection();
		int postCount = 0;
		
		if(opt == 0) {
			postCount = new VegitalkDAO().getPostCountAll(conn);
		} else {
			postCount = new VegitalkDAO().getPostCount(conn, opt);
		}
		close(conn);
		return postCount;
	}

//	public ArrayList<Board> getPListAll(PageInfo pi) {
//		Connection conn = getConnection();
//		ArrayList<Board> pList = new VegitalkDAO().getPListAll(conn , pi);
//		close(conn);
//		return pList;
//	}
	
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

	public int deleteAtc(int bId) {
		Connection conn = getConnection();
		int result = new VegitalkDAO().deleteAtc(conn, bId);
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public int updatePost(Board post) {
		Connection conn = getConnection();
		int result = new VegitalkDAO().updatePost(conn, post);
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

	public ArrayList<Comments> selectReplyList(int bId) {
		Connection conn = getConnection();

		ArrayList<Comments> list = new VegitalkDAO().selectCommentList(conn, bId);
		
		close(conn);

		return list;
	}

	public int editAtc(Attachment atc, int bId) {
		Connection conn = getConnection();
		int removePreAtcResult = new VegitalkDAO().deleteAtc(conn, bId);
		int insertAtcResult = new VegitalkDAO().editAttachment(conn, atc);
		
		if(insertAtcResult > 0 && removePreAtcResult > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		close(conn);
		return insertAtcResult;
	}

	public DietList selectDietList(int bId) {
		Connection conn = getConnection();
		DietList dList = new VegitalkDAO().selectDietList(conn, bId);
		close(conn);
		return dList;
	}
	
	public ArrayList<Board> getPList(PageInfo pi, int opt) {
		Connection conn = getConnection();
		ArrayList<Board> pList = new VegitalkDAO().getPList(conn, pi, opt);
		close(conn);
		return pList;
	}

	public ArrayList<BookMark> selectBookMarkList(int bId) {
		return null;
	}

	public int delComment(int bId, int comNo) {
		Connection conn = getConnection();
		int delConResult = new VegitalkDAO().delComment(conn, comNo);
		int delConCntResult = new VegitalkDAO().delCntComment(conn, bId);
		
		if(delConResult > 0 && delConCntResult > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		
		close(conn);
		return delConResult;
	}
}
