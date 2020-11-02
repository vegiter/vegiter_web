package board.model.vo;

import java.sql.Date;

public class Attachment {
	private int atcNo;
	private String memId;
	private int atcType;
	private String atcOrigin;
	private String atcName;
	private String atcPath;
	private Date atcDate;
	private int atcLevel;
	private char atcStatus;
	private int boardNo;
	
	public Attachment() {}
	
	public Attachment(int atcNo, String memId, int atcType, String atcOrigin, String atcName, String atcPath,
			Date atcDate, int atcLevel, char atcStatus, int boardNo) {
		super();
		this.atcNo = atcNo;
		this.memId = memId;
		this.atcType = atcType;
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

	public int getAtcType() {
		return atcType;
	}

	public void setAtcType(int atcType) {
		this.atcType = atcType;
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

	public String getAtcPath() {
		return atcPath;
	}

	public void setAtcPath(String atcPath) {
		this.atcPath = atcPath;
	}

	public Date getAtcDate() {
		return atcDate;
	}

	public void setAtcDate(Date atcDate) {
		this.atcDate = atcDate;
	}

	public int getAtcLevel() {
		return atcLevel;
	}

	public void setAtcLevel(int atcLevel) {
		this.atcLevel = atcLevel;
	}

	public char getAtcStatus() {
		return atcStatus;
	}

	public void setAtcStatus(char atcStatus) {
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
		return "Attachment [atcNo=" + atcNo + ", memId=" + memId + ", atcType=" + atcType + ", atcOrigin=" + atcOrigin
				+ ", atcName=" + atcName + ", atcPath=" + atcPath + ", atcDate=" + atcDate + ", atcLevel=" + atcLevel
				+ ", atcStatus=" + atcStatus + ", boardNo=" + boardNo + "]";
	}

}
