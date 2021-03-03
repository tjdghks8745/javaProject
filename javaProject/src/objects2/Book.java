package objects2;

public class Book {

	private String BN; // 책제목
	private String BJ; // 책저자
	private String BK; // 출판사
	private int BP; // 책가격

	public Book(String bN, String bJ, String bK, int bP) {
		this.BN = bN;
		this.BJ = bJ;
		this.BK = bK;
		this.BP = bP;
	}

	public String getBN() {
		return BN;
	}

	public void setBN(String bN) {
		BN = bN;
	}

	public String getBJ() {
		return BJ;
	}

	public void setBJ(String bJ) {
		BJ = bJ;
	}

	public String getBK() {
		return BK;
	}

	public void setBK(String bK) {
		BK = bK;
	}

	public int getBP() {
		return BP;
	}

	public void setBP(int bP) {
		BP = bP;
	}

}
