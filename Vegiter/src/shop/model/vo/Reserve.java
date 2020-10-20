package shop.model.vo;

import java.sql.Date;

public class Reserve {
	private String resId;
	private Date resDate;
	private int resCount;
	private String resAsk;
	private String shopId;
	private String memId;
	
	public Reserve() {}
	
	public Reserve(String resId, Date resDate, int resCount, String resAsk, String shopId, String memId) {
		super();
		this.resId = resId;
		this.resDate = resDate;
		this.resCount = resCount;
		this.resAsk = resAsk;
		this.shopId = shopId;
		this.memId = memId;
	}

	public String getResId() {
		return resId;
	}

	public void setResId(String resId) {
		this.resId = resId;
	}

	public Date getResDate() {
		return resDate;
	}

	public void setResDate(Date resDate) {
		this.resDate = resDate;
	}

	public int getResCount() {
		return resCount;
	}

	public void setResCount(int resCount) {
		this.resCount = resCount;
	}

	public String getResAsk() {
		return resAsk;
	}

	public void setResAsk(String resAsk) {
		this.resAsk = resAsk;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	@Override
	public String toString() {
		return "Reserve [resId=" + resId + ", resDate=" + resDate + ", resCount=" + resCount + ", resAsk=" + resAsk
				+ ", shopId=" + shopId + ", memId=" + memId + "]";
	}
}
