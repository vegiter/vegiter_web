package board.model.vo;

public class DietList {
	private String[] mFood;
	private String[] mUrl;
	private String[] lFood;
	private String[] lUrl;
	private String[] eFood;
	private String[] eUrl;
	
	public DietList() {}
	
	public DietList(String[] mFood, String[] mUrl, String[] lFood, String[] lUrl, String[] eFood, String[] eUrl) {
		super();
		this.mFood = mFood;
		this.mUrl = mUrl;
		this.lFood = lFood;
		this.lUrl = lUrl;
		this.eFood = eFood;
		this.eUrl = eUrl;
	}
	
	
	public String[] getmFood() {
		return mFood;
	}

	public void setmFood(String[] mFood) {
		this.mFood = mFood;
	}

	public String[] getmUrl() {
		return mUrl;
	}

	public void setmUrl(String[] mUrl) {
		this.mUrl = mUrl;
	}

	public String[] getlFood() {
		return lFood;
	}

	public void setlFood(String[] lFood) {
		this.lFood = lFood;
	}

	public String[] getlUrl() {
		return lUrl;
	}

	public void setlUrl(String[] lUrl) {
		this.lUrl = lUrl;
	}

	public String[] geteFood() {
		return eFood;
	}

	public void seteFood(String[] eFood) {
		this.eFood = eFood;
	}

	public String[] geteUrl() {
		return eUrl;
	}

	public void seteUrl(String[] eUrl) {
		this.eUrl = eUrl;
	}

	@Override
	public String toString() {
		return "DietList [mFood=" + mFood + ", mUrl=" + mUrl + ", lFood=" + lFood + ", lUrl=" + lUrl + ", eFood="
				+ eFood + ", eUrl=" + eUrl + ", boardCode=" + "]";
	}
}
