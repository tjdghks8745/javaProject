package objects2;

public class Member {
	private String ID; // 회원ID
	private String name; // 회원이름
	private Book[] rentBooks = new Book[3]; // 대여도서

	public Member() {
		
	}
	public Member(String iD, String name) {
		this.ID = iD;
		this.name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 대여기능
	public void rent(Book book) {
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i] == null) {
				rentBooks[i] = book;
				break;
			}
		}
	}

	// 반납기능
	public void overdue(Book book) {
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i].getBJ().equals(book.getBJ())) { // 문자열 비교 .equals 사용. 확인하기
				rentBooks[i] = null;
				break;
			}
		}
	}

	public void getBookInfo() { // 존나모르겟네
		String bookInfo = "";
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i] != null) {
				bookInfo = bookInfo +  rentBooks[i].getBN();
			}
		}
		System.out.println(name + "/" +  bookInfo);
	}
}