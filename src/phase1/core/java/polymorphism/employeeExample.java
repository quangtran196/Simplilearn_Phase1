package phase1.core.java.polymorphism;

import java.util.*;

class Employee {
	public String name;
	public 	int salary;
	public String Jobtitle;
	
	Employee (String name, String Jobtitle, int salary){
		this.name = name;
		this.salary = salary;
		this.Jobtitle = Jobtitle;
	}
	
}

class company{
	private final List<Employee> emps ;
	
	company (List<Employee> emps){
		this.emps = emps;
		
	}
	
	public List<Employee> getEmps(){
		return emps;
	}
	
}

public class employeeExample {

	public static void main(String args[]) {
		Employee e1 = new Employee("Nathan","Manager", 200000);
		Employee e2 = new Employee("Mike","Software Engineer", 120000);
		Employee e3 = new Employee("Chen","TeleSale", 89000);
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		company empList = new company(list);
		
		List<Employee> emps = empList.getEmps();
		for (Employee emp: emps) {
			System.out.println("Name: " + emp.name + ", Job: Title "+
		emp.Jobtitle +", Salary: "+ emp.salary);
		}
	}
}
