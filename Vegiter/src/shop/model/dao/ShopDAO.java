package shop.model.dao;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import shop.model.vo.Shop;
import static common.JDBCTemplate.close;
public class ShopDAO {
	Properties prop = new Properties();
	
	public ShopDAO() {
		String fileName = ShopDAO.class.getResource("/sql/shop/shop-query.properties").getPath();
		try {
			prop.load(new FileReader(fileName));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Shop> selectShop(Connection conn, String ownNo) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Shop> shopList = null;
		String query = prop.getProperty("selectShop");
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, ownNo);
			rset = pstmt.executeQuery();
			shopList = new ArrayList<Shop>();
			while(rset.next()) {
				shopList.add(new Shop(rset.getString("shop_id"),
									  rset.getString("shop_name"),
									  rset.getString("shop_address"),
									  rset.getString("shop_page"),
									  rset.getString("shop_coord"),
									  rset.getString("shop_link"),
									  rset.getInt("shop_style"),
									  rset.getInt("shop_rating"),
									  rset.getString("own_no")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		return shopList;
	}

}
