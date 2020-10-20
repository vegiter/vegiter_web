package login.model.vo;

import java.sql.Date;

public class Owner {
	private String ownNo;
	private String ownName;
	private int ownFId;
	private String ownFOrigin;
	private String ownFName;
	private String ownFPath;
	private Date ownFDate;
	private int ownFLevel;
	private String ownFStatus;
	private String memId;
	
	public Owner() {}

	public Owner(String ownNo, String ownName, int ownFId, String ownFOrigin, String ownFName, String ownFPath,
			Date ownFDate, int ownFLevel, String ownFStatus, String memId) {
		super();
		this.ownNo = ownNo;
		this.ownName = ownName;
		this.ownFId = ownFId;
		this.ownFOrigin = ownFOrigin;
		this.ownFName = ownFName;
		this.ownFPath = ownFPath;
		this.ownFDate = ownFDate;
		this.ownFLevel = ownFLevel;
		this.ownFStatus = ownFStatus;
		this.memId = memId;
	}

	public String getOwnNo() {
		return ownNo;
	}

	public void setOwnNo(String ownNo) {
		this.ownNo = ownNo;
	}

	public String getOwnName() {
		return ownName;
	}

	public void setOwnName(String ownName) {
		this.ownName = ownName;
	}

	public int getOwnFId() {
		return ownFId;
	}

	public void setOwnFId(int ownFId) {
		this.ownFId = ownFId;
	}

	public String getOwnFOrigin() {
		return ownFOrigin;
	}

	public void setOwnFOrigin(String ownFOrigin) {
		this.ownFOrigin = ownFOrigin;
	}

	public String getOwnFName() {
		return ownFName;
	}

	public void setOwnFName(String ownFName) {
		this.ownFName = ownFName;
	}

	public String getOwnFPath() {
		return ownFPath;
	}

	public void setOwnFPath(String ownFPath) {
		this.ownFPath = ownFPath;
	}

	public Date getOwnFDate() {
		return ownFDate;
	}

	public void setOwnFDate(Date ownFDate) {
		this.ownFDate = ownFDate;
	}

	public int getOwnFLevel() {
		return ownFLevel;
	}

	public void setOwnFLevel(int ownFLevel) {
		this.ownFLevel = ownFLevel;
	}

	public String getOwnFStatus() {
		return ownFStatus;
	}

	public void setOwnFStatus(String ownFStatus) {
		this.ownFStatus = ownFStatus;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	@Override
	public String toString() {
		return "Owner [ownNo=" + ownNo + ", ownName=" + ownName + ", ownFId=" + ownFId + ", ownFOrigin=" + ownFOrigin
				+ ", ownFName=" + ownFName + ", ownFPath=" + ownFPath + ", ownFDate=" + ownFDate + ", ownFLevel="
				+ ownFLevel + ", ownFStatus=" + ownFStatus + ", memId=" + memId + "]";
	}
}
