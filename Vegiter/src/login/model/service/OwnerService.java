package login.model.service;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.commit;
import static common.JDBCTemplate.getConnection;
import static common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import login.model.dao.OwnerDAO;
import login.model.vo.Owner;

public class OwnerService {

	public Owner findId(String ownerName, String ownerNum) {
		Connection conn = getConnection();

		Owner o = new OwnerDAO().findOwner(conn, ownerName, ownerNum);

		close(conn);

		return o;
	}

	public Owner selectOwner(String userId) {
		Connection conn = getConnection();
		Owner owner = new OwnerDAO().selectOwner(conn, userId);
		close(conn);
		return owner;
	}

	public ArrayList<Owner> selectOwnerAll() {
		Connection conn = getConnection();
		ArrayList<Owner> ownList = new OwnerDAO().selectOwnerAll(conn);
		close(conn);
		return ownList;
	}

}
