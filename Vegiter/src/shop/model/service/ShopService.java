package shop.model.service;
import static common.JDBCTemplate.getConnection;
import static common.JDBCTemplate.close;

import java.sql.Connection;
import java.util.ArrayList;

import shop.model.dao.ShopDAO;
import shop.model.vo.Shop;

public class ShopService {

	public ArrayList<Shop> selectShop(String ownNo) {
		Connection conn = getConnection();
		ArrayList<Shop> shopList = new ShopDAO().selectShop(conn, ownNo);
		close(conn);
		
		return shopList;
	}
	
}
