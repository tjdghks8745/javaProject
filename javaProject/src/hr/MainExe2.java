package hr;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MainExe2 {
	public static void main(String[] args) {
		//정렬 급여기준...
		EmpDAO dao = new EmpDAO();
		Set<Employee> set = dao.getEmps(); //getEmps 가 지금 EmpDAO 에 메소드를 정의해놓지 않아서 안되는거임 
		 // 전체리스트 Set 저장
		TreeSet<Employee> tset = new TreeSet<Employee>(); //salary 정렬
		
		Iterator<Employee> iter = set.iterator();
		
		while(iter.hasNext()) {
			tset.add(iter.next()); //salary 정렬되면서 저장.
		}
		iter = tset.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next()); //salary 출력.
		}
	}
}	
