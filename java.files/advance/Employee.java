package advance;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Employee implements Comparable<Employee> {
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
    public int compareTo(Employee anotherEmployee) {    //compare to function
        return (this.getId()-anotherEmployee.getId());
    }
    @Override
    public String toString() {  //when employee is printed it will print this
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", joiningDate=" + joiningDate +
                '}'+"\n";
    }
}
class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1010, "Rajeev", 100000.00, LocalDate.of(2010, 7, 10)));
        employees.add(new Employee(1004, "Chris", 95000.50, LocalDate.of(2017, 3, 19)));
        employees.add(new Employee(1015, "David", 134000.00, LocalDate.of(2017, 9, 28)));
        System.out.println("Employees (Before Sorting) :\n " + employees);
        System.out.println();
        // This will use the `compareTo()` method of the `Employee` class to compare two employees and sort them.
        Collections.sort(employees);
        System.out.println("\nEmployees (After Sorting) by Id :\n " + employees);
        Comparator<Employee> byname=new Comparator<Employee>(){  //use of comparater
            @Override
            public int compare(Employee e1,Employee e2){
                return e1.getName().compareTo(e2.getName());
            }
        };
        Collections.sort(employees,byname);
        System.out.println("\n\nSorting After By name:\n"+employees);
        Comparator<Employee> bydate=new Comparator<Employee>(){
            @Override
            public int compare(Employee e1,Employee e2){
                if(e1.getJoiningDate()==e2.getJoiningDate()){
                    return 0;
                }
                else if(e1.getJoiningDate().compareTo(e2.getJoiningDate())<0){
                    return -1;
                }
                else{
                    return 1;
                }
            }
        };
        Collections.sort(employees,bydate);
        System.out.println("\n\nSorting After By Date:\n"+employees);
    }
}