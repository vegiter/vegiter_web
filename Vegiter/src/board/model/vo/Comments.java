package board.model.vo;

import java.sql.Date;

public class Comments {

	private int comNo;
	private String memId;
	private String comContent;
	private Date comDate;
	private int boardNo;
	
	public Comments() {}
			
	public Comments(int comNo, String memId, String comContent, Date comDate, int boardNo) {
		super();
		this.comNo = comNo;
		this.memId = memId;
		this.comContent = comContent;
		this.comDate = comDate;
		this.boardNo = boardNo;
	}

	public int getComNo() {
		return comNo;
	}

	public void setComNo(int comNo) {
		this.comNo = comNo;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getComContent() {
		return comContent;
	}

	public void setComContent(String comContent) {
		this.comContent = comContent;
	}

	public Date getComDate() {
		return comDate;
	}

	public void setComDate(Date comDate) {
		this.comDate = comDate;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	@Override
	public String toString() {
		return "Comments [comNo=" + comNo + ", memId=" + memId + ", comContent=" + comContent + ", comDate=" + comDate
				+ ", boardNo=" + boardNo + "]";
	}
}
