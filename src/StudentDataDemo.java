import java.util.Scanner;
class StudentData{
    String name;
    int age;
    void display(){
        System.out.println("\nStudent data");
        System.out.println("\nName: " + name);
        System.out.println("\nAge: " + age);
    }
}
public class StudentDataDemo {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	        StudentData student = new StudentData();
	        System.out.println("Enter name: ");
	        student.name = sc.nextLine();
	        System.out.println("Enter age: ");
	        student.age = sc.nextInt();
	        student.display();
	        sc.close();
    }
}
