package board.model.vo;

public class PageInfo {
<<<<<<< HEAD
	private int postCount;
	private int currentPage;
	private int pageLimit;
	private int postLimit;
=======
	private int currentPage;
	private int listCount;
	private int pageLimit;
	private int boardLimit;
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
	private int maxPage;
	private int startPage;
	private int endPage;
	
<<<<<<< HEAD
	public PageInfo() {}
	
	public PageInfo(int postCount, int currentPage, int pageLimit, int postLimit, int maxPage, int startPage,
			int endPage) {
		super();
		this.postCount = postCount;
		this.currentPage = currentPage;
		this.pageLimit = pageLimit;
		this.postLimit = postLimit;
=======
	
	public PageInfo() {}


	public PageInfo(int currentPage, int listCount, int pageLimit, int boardLimit, int maxPage, int startPage,
			int endPage) {
		super();
		this.currentPage = currentPage;
		this.listCount = listCount;
		this.pageLimit = pageLimit;
		this.boardLimit = boardLimit;
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
		this.maxPage = maxPage;
		this.startPage = startPage;
		this.endPage = endPage;
	}

<<<<<<< HEAD
	public int getPostCount() {
		return postCount;
	}

	public void setPostCount(int postCount) {
		this.postCount = postCount;
	}
=======
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거

	public int getCurrentPage() {
		return currentPage;
	}

<<<<<<< HEAD
=======

>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

<<<<<<< HEAD
=======

	public int getListCount() {
		return listCount;
	}


	public void setListCount(int listCount) {
		this.listCount = listCount;
	}


>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
	public int getPageLimit() {
		return pageLimit;
	}

<<<<<<< HEAD
=======

>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
	public void setPageLimit(int pageLimit) {
		this.pageLimit = pageLimit;
	}

<<<<<<< HEAD
	public int getPostLimit() {
		return postLimit;
	}

	public void setPostLimit(int postLimit) {
		this.postLimit = postLimit;
	}

=======

	public int getBoardLimit() {
		return boardLimit;
	}


	public void setBoardLimit(int boardLimit) {
		this.boardLimit = boardLimit;
	}


>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
	public int getMaxPage() {
		return maxPage;
	}

<<<<<<< HEAD
=======

>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}

<<<<<<< HEAD
=======

>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
	public int getStartPage() {
		return startPage;
	}

<<<<<<< HEAD
=======

>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

<<<<<<< HEAD
=======

>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
	public int getEndPage() {
		return endPage;
	}

<<<<<<< HEAD
=======

>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

<<<<<<< HEAD
	@Override
	public String toString() {
		return "PageInfo [postCount=" + postCount + ", currentPage=" + currentPage + ", pageLimit=" + pageLimit
				+ ", postLimit=" + postLimit + ", maxPage=" + maxPage + ", startPage=" + startPage + ", endPage="
				+ endPage + "]";
	}
=======

	@Override
	public String toString() {
		return "PageInfo [currentPage=" + currentPage + ", listCount=" + listCount + ", pageLimit=" + pageLimit
				+ ", boardLimit=" + boardLimit + ", maxPage=" + maxPage + ", startPage=" + startPage + ", endPage="
				+ endPage + "]";
	}

	
	
	
	
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
}
