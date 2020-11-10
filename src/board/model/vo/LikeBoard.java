package board.model.vo;

public class LikeBoard {

		private int board_no;
		private String mem_Id;
		private int like_count;
		
		public LikeBoard() {}
		
		public LikeBoard(int board_no, String mem_Id, int like_count) {
			super();
			this.board_no = board_no;
			this.mem_Id = mem_Id;
			this.like_count = like_count;
		}

		public int getBoard_no() {
			return board_no;
		}

		public void setBoard_no(int board_no) {
			this.board_no = board_no;
		}

		public String getMem_Id() {
			return mem_Id;
		}

		public void setMem_Id(String mem_Id) {
			this.mem_Id = mem_Id;
		}

		public int getLike_count() {
			return like_count;
		}

		public void setLike_count(int like_count) {
			this.like_count = like_count;
		}

		@Override
		public String toString() {
			return "LikeBoard [board_no=" + board_no + ", mem_Id=" + mem_Id + ", like_count=" + like_count + "]";
		}


	
}
