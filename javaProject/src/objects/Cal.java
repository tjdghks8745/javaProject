package objects;

public class Cal {
	public static void main(String[] args) {
		showInfo("조성환");
		showInfo("김길동");
		Student std = new Student(null);
		std.setName("조성");
		std.setEng(90);
		std.setMath(95);
		showInfo(std);
		Student[] stds = new Student[3];
		stds[0] = new Student("조성환" , 77, 88);
		stds[1] = new Student("김성환" , 22, 88);
		stds[2] = new Student("박성환" , 66, 88);
		showInfo(stds);
		
	}
	
	public static void showInfo(Student[] students) {
		for(Student std : students) {
			if(std != null)
			showInfo(std);
			
		}
	}

	public static void showInfo(Student student) {
		System.out.println(student.getName() + "안녕하세요.");
		System.out.println("영어점수는" + student.getEng() + ", 수학점수는 " + student.getMath() + ", 점수 합계는" + (student.getEng() + student.getMath()));
	}

	public static void showInfo(String name) {
		System.out.println(name + ", 안녕하세요.");
	}
}
