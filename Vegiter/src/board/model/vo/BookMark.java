package board.model.vo;

public class BookMark {

	private int  bmk_no;
	private String mem_Id;
	private String shop_Id;
	private int board_no;
	
	public BookMark() {}
	
	
	
	public BookMark(int bmk_no, String mem_Id, String shop_Id, int board_no) {
		super();
		this.bmk_no = bmk_no;
		this.mem_Id = mem_Id;
		this.shop_Id = shop_Id;
		this.board_no = board_no;
	}



	public int getBmk_no() {
		return bmk_no;
	}
	public void setBmk_no(int bmk_no) {
		this.bmk_no = bmk_no;
	}
	public String getMem_Id() {
		return mem_Id;
	}
	public void setMem_Id(String mem_Id) {
		this.mem_Id = mem_Id;
	}
	public String getShop_Id() {
		return shop_Id;
	}
	public void setShop_Id(String shop_Id) {
		this.shop_Id = shop_Id;
	}
	public int getBoard_no() {
		return board_no;
	}
	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}



	@Override
	public String toString() {
		return "BookMark [bmk_no=" + bmk_no + ", mem_Id=" + mem_Id + ", shop_Id=" + shop_Id + ", board_no=" + board_no
				+ "]";
	}
	
	
	
	
	
}
