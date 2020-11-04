package common;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCTemplate {

	private JDBCTemplate() {}
	
	public static Connection getConnection() {
		
		String fileName = JDBCTemplate.class.getResource("/sql/driver.properties").getPath();
		Connection conn = null;
		Properties prop = new Properties();
		
		try {
			prop.load(new FileReader(fileName));
			Class.forName(prop.getProperty("driver"));
			
			conn = DriverManager.getConnection(prop.getProperty("url"),
										       prop.getProperty("username"),
											   prop.getProperty("password"));
			conn.setAutoCommit(false);
		} catch (IOException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	/* 자원 반납 메소드 */
	public static void close(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet rest) {
		try {
			if(rest != null && !rest.isClosed()) {
				rest.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Statement stmt) {
		try {
			if(stmt != null && !stmt.isClosed()) {
				stmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(PreparedStatement pstmt) {
		try {
			if(pstmt != null && !pstmt.isClosed()) {
				pstmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	/* commit, rollback 메소드 */
	public static void commit(Connection conn) {
		try {
			if(conn != null && conn.isClosed()) {
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void rollback(Connection conn) {
		try {
			if(conn != null && conn.isClosed()) {
				conn.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}