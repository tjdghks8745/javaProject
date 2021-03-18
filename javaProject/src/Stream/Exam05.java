package Stream;

import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import hr.EmpDAO;
import hr.Employee;

public class Exam05 {
	private static Predicate<? super Employee> salary;

	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO(); 
		Set<Employee> emps = dao.getEmps(); 
		List<Employee>empList = emps.stream() 
				.filter(salary).average();
		
		empList.stream().forEach(s -> System.out.println(s));
	}
}
