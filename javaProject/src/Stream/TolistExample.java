package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import hr.EmpDAO;
import hr.Employee;

public class TolistExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("hong", "hwag", "Park");
		// stream 중간처리 최종집계한 결과를 다시 List<String>
		Collector<Object, ?, List<Object>> col = Collectors.toList();

		List<String> newList = list.stream() // stream<String>
				.filter(s -> s.startsWith("h")).collect(Collectors.toList());

		for (String str : newList) {
			System.out.println(str);
		}
		System.out.println("-----------------------------");
		EmpDAO dao = new EmpDAO(); // List<Employee>
		Set<Employee> emps = dao.getEmps(); // Set<Employee>
		List<Employee>empList = emps.stream() // 직무가 IT_PROG 사람들을 가져와서 List<Employee> 담아.
				.filter(new Predicate<Employee>() {

					@Override
					public boolean test(Employee t) {
						return t.getJobId().equals("IT_PROG");
					}
				}).collect(Collectors.toList());
		
		empList.stream().forEach(s -> System.out.println(s));
	}
}
