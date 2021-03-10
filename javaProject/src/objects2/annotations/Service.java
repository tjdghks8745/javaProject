package objects2.annotations;

public class Service {
	@PrintAnnotation()
	String name;
	
	@PrintAnnotation(value = "*")
	public void method1() {
		System.out.println("실행내용 2");
		
	}
	@PrintAnnotation(value = "#", number=20)
	public void method2 () {
		System.out.println("실행내용 3");
	
	}
}
