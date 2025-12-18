/*1. Create a class Employee with:
• Instance variables: empId, empName, salary
• A constructor that initializes values
• A method displayEmployee() to display details
🟢 Take input for two employees and print their data.*/

import java.util.*;
class Employee {
	int empId;
	String empName;
	long salary;
	Employee(int empId,String empName, long salary){
		this.empId= empId;
		this.empName= empName;
		this.salary= salary;
	}
	void displayEmployee() {
		System.out.println("--- Employee Details ---");
		System.out.println("Employee's ID: " + empId);
		System.out.println("Employee's name: " + empName);
		System.out.println("Employee's salary: " + salary +"\n");
	}
}
public class EmployeeDemo{
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		long salary;
		String empName;
		int empId,i;
		for (i=1;i<=2;i++) {
        System.out.println("Enter the deatils of employee "+ i);
		System.out.println("Enter the employee's ID: ");
		empId= sc.nextInt();
		System.out.println("Enter the employee's name: ");
		empName= sc.next();
		System.out.println("Enter the employee's salary: ");
		salary= sc.nextLong();
		Employee e1=new Employee(empId,empName,salary);
		e1.displayEmployee();
		}
	}
}