package tutorial6;

class Employee {
    protected int salary;
    Employee(int salary) {
        this.salary = salary;
    }
    protected void showSalary() {
        System.out.println("Salary: " + salary);
    }
}
class Manager extends Employee{
     Manager(int salary) {
        super(salary);
    }

    void showManagerSalary() {
        System.out.println("Manager salary: " + salary);
        showSalary();
    }
}
public class EmployeeDemo {
    public static void main(String[] args) {
        Manager m = new Manager(50000);
        m.showManagerSalary();
    }
}