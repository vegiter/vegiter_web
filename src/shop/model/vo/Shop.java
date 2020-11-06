package shop.model.vo;

public class Shop {
	private String shopId;
	private String shopName;
	private String shopAddress;
	private String shopPage;
	private String shopCoord;
	private String shopLink;
	private int shopStyle;
	private int shopRating;
	private String ownNo;
	
	public Shop() {}
			
	public Shop(String shopId, String shopName, String shopAddress, String shopPage, String shopCoord, String shopLink,
			int shopStyle, int shopRating, String ownNo) {
		super();
		this.shopId = shopId;
		this.shopName = shopName;
		this.shopAddress = shopAddress;
		this.shopPage = shopPage;
		this.shopCoord = shopCoord;
		this.shopLink = shopLink;
		this.shopStyle = shopStyle;
		this.shopRating = shopRating;
		this.ownNo = ownNo;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopAddress() {
		return shopAddress;
	}

	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}

	public String getShopPage() {
		return shopPage;
	}

	public void setShopPage(String shopPage) {
		this.shopPage = shopPage;
	}

	public String getShopCoord() {
		return shopCoord;
	}

	public void setShopCoord(String shopCoord) {
		this.shopCoord = shopCoord;
	}

	public String getShopLink() {
		return shopLink;
	}

	public void setShopLink(String shopLink) {
		this.shopLink = shopLink;
	}

	public int getShopStyle() {
		return shopStyle;
	}

	public void setShopStyle(int shopStyle) {
		this.shopStyle = shopStyle;
	}

	public int getShopRating() {
		return shopRating;
	}

	public void setShopRating(int shopRating) {
		this.shopRating = shopRating;
	}

	public String getOwnNo() {
		return ownNo;
	}

	public void setOwnNo(String ownNo) {
		this.ownNo = ownNo;
	}

	@Override
	public String toString() {
		return "Shop [shopId=" + shopId + ", shopName=" + shopName + ", shopAddress=" + shopAddress + ", shopPage="
				+ shopPage + ", shopCoord=" + shopCoord + ", shopLink=" + shopLink + ", shopStyle=" + shopStyle
				+ ", shopRating=" + shopRating + ", ownNo=" + ownNo + "]";
	}
}
