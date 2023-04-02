package in.ashokit.client;

import in.ashokit.bean.Employee;
import in.ashokit.util.JsonUtil;

public class Test {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpno(201);
		emp.setName("rama");
		emp.setSalary(50000);
		String jsonEmployee = JsonUtil.convertjavaToJson(emp);
		System.out.println(jsonEmployee);

		System.out.println("========================");

		Employee emp1 = JsonUtil.convertJsonTojava(jsonEmployee, Employee.class);
		System.out.println(emp1.getEmpno() + " " + emp1.getName() + " " + emp1.getSalary() + " ");

	}
}
