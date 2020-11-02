package vegitalk.model.Service;

import static common.JDBCTemplate.getConnection;
import static common.JDBCTemplate.commit;
import static common.JDBCTemplate.rollback;
import static common.JDBCTemplate.close;

import java.sql.Connection;

import board.model.vo.Attachment;
import board.model.vo.Board;
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

}
