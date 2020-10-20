package board.model.vo;

import java.sql.Date;

public class Board {
	private int board_no;
	private int board_code;
	private String mem_id;
	private String board_title;
	private Date board_date;
	private String board_content;
	private int board_count;
	private int board_like;
	private int board_com;
	private String board_status;

	public Board() {}

	public Board(int board_no, int board_code, String mem_id, String board_title, Date board_date, String board_content,
			int board_count, int board_like, int board_com, String board_status) {
		super();
		this.board_no = board_no;
		this.board_code = board_code;
		this.mem_id = mem_id;
		this.board_title = board_title;
		this.board_date = board_date;
		this.board_content = board_content;
		this.board_count = board_count;
		this.board_like = board_like;
		this.board_com = board_com;
		this.board_status = board_status;
	}

	public int getBoard_no() {
		return board_no;
	}

	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}

	public int getBoard_code() {
		return board_code;
	}

	public void setBoard_code(int board_code) {
		this.board_code = board_code;
	}

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	public String getBoard_title() {
		return board_title;
	}

	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}

	public Date getBoard_date() {
		return board_date;
	}

	public void setBoard_date(Date board_date) {
		this.board_date = board_date;
	}

	public String getBoard_content() {
		return board_content;
	}

	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}

	public int getBoard_count() {
		return board_count;
	}

	public void setBoard_count(int board_count) {
		this.board_count = board_count;
	}

	public int getBoard_like() {
		return board_like;
	}

	public void setBoard_like(int board_like) {
		this.board_like = board_like;
	}

	public int getBoard_com() {
		return board_com;
	}

	public void setBoard_com(int board_com) {
		this.board_com = board_com;
	}

	public String getBoard_status() {
		return board_status;
	}

	public void setBoard_status(String board_status) {
		this.board_status = board_status;
	}

	@Override
	public String toString() {
		return "Board [board_no=" + board_no + ", board_code=" + board_code + ", mem_id=" + mem_id + ", board_title="
				+ board_title + ", board_date=" + board_date + ", board_content=" + board_content + ", board_count="
				+ board_count + ", board_like=" + board_like + ", board_com=" + board_com + ", board_status="
				+ board_status + "]";
	}
}
