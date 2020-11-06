package board.model.vo;

public class PageInfo {
	private int postCount;
	private int currentPage;
	private int pageLimit;
	private int postLimit;
	private int maxPage;
	private int startPage;
	private int endPage;
	
	public PageInfo() {}
	
	public PageInfo(int postCount, int currentPage, int pageLimit, int postLimit, int maxPage, int startPage,
			int endPage) {
		super();
		this.postCount = postCount;
		this.currentPage = currentPage;
		this.pageLimit = pageLimit;
		this.postLimit = postLimit;
		this.maxPage = maxPage;
		this.startPage = startPage;
		this.endPage = endPage;
	}

	public int getPostCount() {
		return postCount;
	}

	public void setPostCount(int postCount) {
		this.postCount = postCount;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageLimit() {
		return pageLimit;
	}

	public void setPageLimit(int pageLimit) {
		this.pageLimit = pageLimit;
	}

	public int getPostLimit() {
		return postLimit;
	}

	public void setPostLimit(int postLimit) {
		this.postLimit = postLimit;
	}

	public int getMaxPage() {
		return maxPage;
	}

	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	@Override
	public String toString() {
		return "PageInfo [postCount=" + postCount + ", currentPage=" + currentPage + ", pageLimit=" + pageLimit
				+ ", postLimit=" + postLimit + ", maxPage=" + maxPage + ", startPage=" + startPage + ", endPage="
				+ endPage + "]";
	}
}
