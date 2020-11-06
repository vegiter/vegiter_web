package about.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import about.model.dao.AboutDAO;

public class AboutService {

	public int insertResearch(int selected) throws RuntimeException{
		
		Connection conn = getConnection();
		
		int result = new AboutDAO().insertResearch(conn, selected);
		
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}
	
	public List<Map<String, Object>> selectListResearch() throws RuntimeException{
		
		Connection conn = getConnection();
		List<Map<String, Object>> result = new AboutDAO().selectListResearch(conn);
		close(conn);
		
		return result;
	}
	
}
