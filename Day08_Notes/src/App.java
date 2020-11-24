import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {

	private String name;
	private double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary >= 0) {
			this.salary = salary;
		}
		this.salary = 0.0;
	}

	@Override
	public int compareTo(Employee o) {
				return this.name.compareTo(o.name);
				
				
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

	
	
	
	
	

}

public class App {

	public static void main(String[] args) {
		List<Employee> listEmployee = new ArrayList<Employee>();
		
		Employee emp1 = new Employee("B", 1000);
		listEmployee.add(emp1);
		
		listEmployee.add(new Employee("A", 4000));
		listEmployee.add(new Employee("D", 2000));
		listEmployee.add(new Employee("C", 6000));

		for(Employee emp : listEmployee) {
			System.out.println(emp);
		}

		Collections.sort(listEmployee);
		
System.out.println("after sort");
		
		
		for(Employee emp : listEmployee) {
			System.out.println(emp);
		}


	}

}
