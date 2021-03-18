package hr;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class EmpDAO {
	Connection conn = null;


	public EmpDAO() {
		String path = "config/database.properties";
		Properties prop = new Properties();
		FileReader fr = null;
		try {
			fr = new FileReader(path);
			prop.load(fr);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String passwd = "hr";
		conn = DBUtil.getConnection(url, user, passwd);

	}
	

	public Set<Employee> getEmps() {
		String sql = "select * from employees";
		Set<Employee> set = new HashSet<>();
		Statement stmt = null;
		ResultSet rs = null;

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setFirstName(rs.getString("first_name"));
				emp.setLasteName(rs.getString("last_name"));
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
				set.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, stmt, conn);
		}
		return set;
	}

	public Department[] detList() {
		Department[] department = new Department[50];
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String sql = "select * from departments";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			int i = 0;
			while (rs.next()) {
				Department det = new Department();
				det.setDepartmentid(rs.getString("department_id"));
				det.setDepartmentname(rs.getString("department_name"));
				det.setLocationid(rs.getString("location_id"));
				det.setManagerid(rs.getString("manager_id"));
				department[i++] = det;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, psmt, conn);
		}
		return department;
	}

	public Employee[] empList() {
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String sql = "select * from emp_java";
		Employee[] employees = new Employee[100];
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			int i = 0;
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmail(rs.getString("email"));
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setLasteName(rs.getString("last_name"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setSalary(rs.getInt("salary"));
//				System.out.println(emp.toString());

				employees[i++] = emp;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, psmt, conn);
		}
		System.out.println("메소드 호출 완료.");
		return employees;
	}

	public Map<String, String> getJobList() {

		String sql = "select * from jobs";
		Statement stmt = null;
		ResultSet rs = null;
		Map<String, String> map = new HashMap<>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				map.put(rs.getString("job_id"), rs.getString("job_title"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, stmt, conn);
		}
		return map;
	}
}