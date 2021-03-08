package abstractClasses;

public abstract class Animal {
	String species;

	public Animal() {

	}

	public Animal(String species) {
		this.species = species;

	}

	public void showInfo() {
		System.out.println("종류는 " + this.species + "입니다.");
	}

	public void breathe() {
		System.out.println("솜을 쉰다.");
	}

	public abstract void sound(); // 추상메소드
	
}
