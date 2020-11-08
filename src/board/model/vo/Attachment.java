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
<<<<<<< HEAD
	private String atcStatus;
=======
<<<<<<< HEAD
<<<<<<< HEAD
	private String atcStatus;
=======
	private char atcStatus;
>>>>>>> 17dc2188b775d31f07cf5158c64030434addb3a3
=======
	private char atcStatus;
>>>>>>> 17dc2188b775d31f07cf5158c64030434addb3a3
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
	private int boardNo;
	
	public Attachment() {}
	
<<<<<<< HEAD
=======
<<<<<<< HEAD:Vegiter/src/board/model/vo/Attachment.java
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
	public Attachment(String atcName, int boardNo) {
		super();
		this.atcName = atcName;
		this.boardNo = boardNo;
	}
	
<<<<<<< HEAD
	public Attachment(int atcNo, String memId, int atcType, String atcOrigin, String atcName, String atcPath,
			Date atcDate, int atcLevel, String atcStatus, int boardNo) {
=======
=======
<<<<<<< HEAD:Vegiter/src/board/model/vo/Attachment.java
=======
>>>>>>> 17dc2188b775d31f07cf5158c64030434addb3a3
=======
>>>>>>> 17dc2188b775d31f07cf5158c64030434addb3a3
=======
	
	

	public Attachment(int atcNo, String atcName) {
		super();
		this.atcNo = atcNo;
		this.atcName = atcName;
	}




>>>>>>> jinsik:src/board/model/vo/Attachment.java
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 17dc2188b775d31f07cf5158c64030434addb3a3:src/board/model/vo/Attachment.java
	public Attachment(int atcNo, String memId, int atcType, String atcOrigin, String atcName, String atcPath,
			Date atcDate, int atcLevel, String atcStatus, int boardNo) {
=======
	public Attachment(int atcNo, String memId, int atcType, String atcOrigin, String atcName, String atcPath,
			Date atcDate, int atcLevel, char atcStatus, int boardNo) {
>>>>>>> 17dc2188b775d31f07cf5158c64030434addb3a3
=======
	public Attachment(int atcNo, String memId, int atcType, String atcOrigin, String atcName, String atcPath,
			Date atcDate, int atcLevel, char atcStatus, int boardNo) {
>>>>>>> 17dc2188b775d31f07cf5158c64030434addb3a3
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
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

<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
	public String getAtcStatus() {
		return atcStatus;
	}

	public void setAtcStatus(String atcStatus) {
<<<<<<< HEAD
=======
=======
=======
>>>>>>> 17dc2188b775d31f07cf5158c64030434addb3a3
	public char getAtcStatus() {
		return atcStatus;
	}

	public void setAtcStatus(char atcStatus) {
<<<<<<< HEAD
>>>>>>> 17dc2188b775d31f07cf5158c64030434addb3a3
=======
>>>>>>> 17dc2188b775d31f07cf5158c64030434addb3a3
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
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
