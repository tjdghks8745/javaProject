package Stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortExample {
	public static void main(String[] args) {
		int[] intAry = {5,3,2,1,4};
		IntStream is = Arrays.stream(intAry);
		is.sorted().forEach(number -> System.out.println(number));
		
		Student[] stdAry = {new Student("hong", 10)
				, new Student("shin" , 20)
				, new Student("Yu", 30)};
		Stream<Student> st = Arrays.stream(stdAry);
		
				}
}
