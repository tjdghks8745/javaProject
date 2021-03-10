package nestedClasses;

public class Outter {
	String field = "Otter-fiedld";
	
	void method() {
		System.out.println("outter=method");
	}

	class Nested {
		String field = "Nested-method";
		void method() {
			System.out.println("Neste - method");
		}
		void print() {
			System.out.println("this.field");
			this.method();
			
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}
