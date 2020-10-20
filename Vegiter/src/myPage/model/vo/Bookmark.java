package myPage.model.vo;

public class Bookmark {
	private String bmkNo;
	private String memId;
	private String shopId;
	private String boardNo;
	
	Bookmark() {}

	
	public Bookmark(String bmkNo, String memId, String shopId, String boardNo) {
		super();
		this.bmkNo = bmkNo;
		this.memId = memId;
		this.shopId = shopId;
		this.boardNo = boardNo;
	}

	public String getBmkNo() {
		return bmkNo;
	}

	public void setBmkNo(String bmkNo) {
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

	public String getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(String boardNo) {
		this.boardNo = boardNo;
	}

	@Override
	public String toString() {
		return "Bookmark [bmkNo=" + bmkNo + ", memId=" + memId + ", shopId=" + shopId + ", boardNo=" + boardNo + "]";
	}
}
