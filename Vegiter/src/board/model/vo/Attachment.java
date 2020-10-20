package board.model.vo;

import java.sql.Date;

public class Attachment {
	private int atcNo;
	private String memId;
	private String atcOrigin;
	private String atcName;
	private Date atcPath;
	private int atcDate;
	private String atcLevel;
	private int atcStatus;
	private int boardNo;
	
	public Attachment() {}
	
	public Attachment(int atcNo, String memId, String atcOrigin, String atcName, Date atcPath, int atcDate,
			String atcLevel, int atcStatus, int boardNo) {
		super();
		this.atcNo = atcNo;
		this.memId = memId;
		this.atcOrigin = atcOrigin;
		this.atcName = atcName;
		this.atcPath = atcPath;
		this.atcDate = atcDate;
		this.atcLevel = atcLevel;
		this.atcStatus = atcStatus;
		this.boardNo = boardNo;
	}

	public int getAtcNo() {
		return atcNo;
	}

	public void setAtcNo(int atcNo) {
		this.atcNo = atcNo;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getAtcOrigin() {
		return atcOrigin;
	}

	public void setAtcOrigin(String atcOrigin) {
		this.atcOrigin = atcOrigin;
	}

	public String getAtcName() {
		return atcName;
	}

	public void setAtcName(String atcName) {
		this.atcName = atcName;
	}

	public Date getAtcPath() {
		return atcPath;
	}

	public void setAtcPath(Date atcPath) {
		this.atcPath = atcPath;
	}

	public int getAtcDate() {
		return atcDate;
	}

	public void setAtcDate(int atcDate) {
		this.atcDate = atcDate;
	}

	public String getAtcLevel() {
		return atcLevel;
	}

	public void setAtcLevel(String atcLevel) {
		this.atcLevel = atcLevel;
	}

	public int getAtcStatus() {
		return atcStatus;
	}

	public void setAtcStatus(int atcStatus) {
		this.atcStatus = atcStatus;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	@Override
	public String toString() {
		return "Attachment [atcNo=" + atcNo + ", memId=" + memId + ", atcOrigin=" + atcOrigin + ", atcName=" + atcName
				+ ", atcPath=" + atcPath + ", atcDate=" + atcDate + ", atcLevel=" + atcLevel + ", atcStatus="
				+ atcStatus + ", boardNo=" + boardNo + "]";
	}
	
}
