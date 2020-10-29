package login.model.serviec;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.commit;
import static common.JDBCTemplate.getConnection;
import static common.JDBCTemplate.rollback;

import java.sql.Connection;

import login.model.dao.OwnerDAO;
import login.model.vo.Owner;

public class OwnerService {

	public Owner findId(String ownerName, String ownerNum) {
		Connection conn = getConnection();

		Owner o = new OwnerDAO().findOwner(conn, ownerName, ownerNum);
		
		close(conn);
		
		return o;
	}

}
