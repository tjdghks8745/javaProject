package homework;

public class StudentExample {
	public static void main(String[] args) {
//
//		Student[] student = new Student[3];
//		student[0] = new Student("홍길동", 90, 85);
//		student[1] = new Student("김길동", 85, 85);
//		student[2] = new Student("이길동", 76, 90);
//		
//		for (Student students : student) {
//			students.im();

		Student s1 = new Student("홍길동", 90, 85);
		Student s2 = new Student("김길동", 80, 75);
		Student s3 = new Student("이길동", 70, 95);

		Student[] students = new Student[3];
		students[0] = s1;
		students[1] = s2;
		students[1] = s3;

		for (Student student : students) {
			student.im();
		}
	}

}
