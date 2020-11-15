package board.model.vo;

public class Content {
	
		private int contentNo;
		private String content;
		private int boardNo;
		
		public Content() {}

		
		public Content(int contentNo, String content, int boardNo) {
			super();
			this.contentNo = contentNo;
			this.content = content;
			this.boardNo = boardNo;
		}
		

		public int getContentNo() {
			return contentNo;
		}
		public void setContentNo(int contentNo) {
			this.contentNo = contentNo;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public int getBoardNo() {
			return boardNo;
		}
		public void setBoardNo(int boardNo) {
			this.boardNo = boardNo;
		}

		
		@Override
		public String toString() {
			return "Content [contentNo=" + contentNo + ", content=" + content + ", boardNo=" + boardNo + "]";
		}
	
}
