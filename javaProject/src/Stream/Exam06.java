package Stream;

import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import hr.EmpDAO;
import hr.Employee;

public class Exam06 {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO(); 
		Set<Employee> emps = dao.getEmps(); 
		List<Employee>empList = emps.stream() 
				.filter(new Predicate<Employee>() {

					@Override
					public boolean test(Employee t) {
						return t.getJobId().equals("IT_PROG");
					}
				}).collect(Collectors.toList());
		
		empList.stream().forEach(s -> System.out.println(s));
	}
}
