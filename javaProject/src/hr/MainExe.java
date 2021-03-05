package hr;

public class MainExe {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		Employee[] empList = dao.empList();
		System.out.println("salary가 5000이상인 사원정보>> ");
		for (Employee emp : empList) {
			if (emp != null && emp.getSalary() > 5000) {
				System.out.println(emp.toString());
			}
		}
		System.out.println();
		dao = new EmpDAO();
		Department[] detList = dao.detList();
		for (Department det : detList) {
			if(det != null) {
				System.out.println(det.toString());
			}
		}

	}
}
