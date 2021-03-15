package hr;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MainExe {
	public static void main(String[] args) {
		
		//job 리스트 
		EmpDAO dao = new EmpDAO();
		dao.getJobList();
		Map<String, String> map = new HashMap<>();
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String 
			
		}
	
		
		
//		Employee[] empList = dao.empList();
//		System.out.println("salary가 5000이상인 사원정보>> ");
//		for (Employee emp : empList) {
//			if (emp != null && emp.getSalary() > 5000) {
//				System.out.println(emp.toString());
//			}
//		}
//		System.out.println();
//		dao = new EmpDAO();
//		Department[] detList = dao.detList();
//		for (Department det : detList) {
//			if (det != null) {
//				System.out.println(det.toString());
			}
	}
