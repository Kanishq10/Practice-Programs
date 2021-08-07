package advance__java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Employee;
class Employee {
	private int id;
	private String name;
	private double salary;
	private LocalDate joiningDate;
	public Employee(int id, String name, double salary, LocalDate joiningDate) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.joiningDate = joiningDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		this.salary = salary;
	}
	public LocalDate getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}
	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", name='" + name + '\'' +
				", salary=" + salary +
				", joiningDate=" + joiningDate +
				'}'+"\n";
	}
}
class Emp {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1010, "Rajeev", 100000.00, LocalDate.of(2010, 7, 10)));
		employees.add(new Employee(1004, "Chris", 95000.50, LocalDate.of(2017, 3, 19)));
		employees.add(new Employee(1015, "David", 134000.00, LocalDate.of(2017, 9, 28)));
		employees.add(new Employee(1009, "Steve", 100000.00, LocalDate.of(2016, 5, 18)));
		System.out.println("Employees : " + employees);
		// Sort employees by Name
		Comparator<Employee> employeeNameComparator = new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getName().compareTo(e2.getName());
			}
		};
		/*
The above Comparator can also be written using lambda expression like so =>
employeeNameComparator = (e1, e2) -> e1.getName().compareTo(e2.getName());
Which can be shortened even further using Java 8 Comparator default method
employeeNameComparator = Comparator.comparing(Employee::getName)
		 */
		Collections.sort(employees, employeeNameComparator);
		System.out.println("\nEmployees (Sorted by Name) : " + employees);
		// Sort employees by Salary
		Comparator<Employee> employeeSalaryComparator = new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				if(e1.getSalary() < e2.getSalary()) {
					return -1;
				} else if (e1.getSalary() > e2.getSalary()) {
					return 1;
				} else {
					return 0;
				}
			}
		};
		Collections.sort(employees, employeeSalaryComparator);
		System.out.println("\nEmployees (Sorted by Salary) : " + employees);
		// Sort employees by JoiningDate
		Comparator<Employee> employeeJoiningDateComparator = new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getJoiningDate().compareTo(e2.getJoiningDate());
			}
		};
		Collections.sort(employees, employeeJoiningDateComparator);
		System.out.println("\nEmployees (Sorted by JoiningDate) : " + employees);
	}
}