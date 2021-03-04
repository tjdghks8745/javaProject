package objects2;

public class SingletonExample {
	public static void main(String[] args) {
	//	Singleton s1 = new Singleton(); // 외부에서 정적인 static 을 사용해서 다른 클래스에서 이용 불가 인스턴스 생성불가
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		Book b1 = new Book("자바", "저자" , "출판사", 1000); 
		Book b2 = new Book("자바", "저자" , "출판사", 1000);
		
		System.out.println(s1 == s2); //변수의 위치에 대한 비교 
		System.out.println(b1 == b2);
	}
}
