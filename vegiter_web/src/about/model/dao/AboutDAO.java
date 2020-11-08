package about.model.dao;

import static common.JDBCTemplate.close;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class AboutDAO {

	private Properties prop = new Properties();
	
	public AboutDAO() {
		try {
            String fileName = AboutDAO.class.getResource("/sql/about/about-query.properties").getPath();
            prop.load(new FileReader(fileName));
            
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public int insertResearch(Connection conn, int selected) {
		
		PreparedStatement pstmt = null;
		String query = prop.getProperty("insertResearch");
		int result = 0;

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, selected);

			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}
	
	public List<Map<String, Object>> selectListResearch(Connection conn){
		
		PreparedStatement pstmt = null;
		List<Map<String, Object>> result = new ArrayList<>();
		ResultSet rset = null;
		Map<String, Object> map = null;
		String query = prop.getProperty("selectListResearch");
		
		try {
			pstmt = conn.prepareStatement(query);
			rset = pstmt.executeQuery();
			
			while (rset.next()) {
				map = new HashMap<>();
				map.put("cnt", rset.getInt("CNT"));
				result.add(map);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return result;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
