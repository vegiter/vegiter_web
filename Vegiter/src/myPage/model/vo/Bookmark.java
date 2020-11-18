
package myPage.model.vo;

public class Bookmark {
	private int bmkNo;
	private String memId;
	private String shopId;
	private int boardNo;
	
	
	
	public Bookmark() {}
	
	
	
	public Bookmark(int bmkNo, String memId, String shopId, int boardNo) {
		super();
		this.bmkNo = bmkNo;
		this.memId = memId;
		this.shopId = shopId;
		this.boardNo = boardNo;
	}



	public int getBmkNo() {
		return bmkNo;
	}

	public void setBmkNo(int bmkNo) {
		this.bmkNo = bmkNo;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}



	@Override
	public String toString() {
		return "Bookmark [bmkNo=" + bmkNo + ", memId=" + memId + ", shopId=" + shopId + ", boardNo=" + boardNo + "]";
	}

}
