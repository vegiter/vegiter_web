package login.model.vo;

import java.sql.Date;

public class Owner {
	private String ownNo;
	private String ownName;
	private String memId;
	
	public Owner() {}

	public Owner(String ownNo, String ownName, String memId) {
		super();
		this.ownNo = ownNo;
		this.ownName = ownName;
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

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	@Override
	public String toString() {
		return "Owner [ownNo=" + ownNo + ", ownName=" + ownName + ", memId=" + memId + "]";
	}
	
}
