package lamdbaExpression;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

import hr.EmpDAO;
import hr.Employee;

class Member {
	String name;
	int score;

	Member(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

public class SupplierExample2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Supplier<Member> sup = () -> {
			int cnt = 0, maxSocre = 0;
			String maxName = null;
			while (true) {
				System.out.print("이름입력: ");
				String name = scn.nextLine();
				System.out.print("점수입력: ");
				int socre = scn.nextInt();
				scn.nextLine();
				if (maxSocre < socre) {
					maxSocre = socre;
					maxName = name;
				}
				if (cnt++ == 2) {
					break;
				}
			}
			return new Member(maxName, maxSocre);
		};
	}

	DoubleSupplier ds = () -> {
		EmpDAO dao = new EmpDAO();
		Set<Employee> set = dao.getEmps();
		Iterator<Employee> iter = set.iterator();
		int sum = 0;
		int cnt = 0;
		while (iter.hasNext()) {
			Employee emp = iter.next();
			sum += emp.getSalary();
			cnt++;
		}
		return (double) sum / cnt;
	};
}
