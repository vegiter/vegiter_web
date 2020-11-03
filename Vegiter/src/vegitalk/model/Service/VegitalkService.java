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
		
		System.out.println("service : " + pResult + ", " + aResult);
		
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
		return postCount;
	}

	public ArrayList<Board> selectPList(PageInfo pi) {
		// TODO Auto-generated method stub
		return null;
	}
}
