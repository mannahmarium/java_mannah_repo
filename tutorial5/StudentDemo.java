import java.util.*;
class Student{
	String name, course;
	long regno;
	int marks[]= new int[6];
    int total, rank;
	Student(String name, long regno, String course, int marks[]){
		this.name= name;
		this.regno= regno;
		this.course= course;
		for (int i=0; i<6; i++){
            this.marks[i]= marks[i];
        }
    }
    void getTotal(){
        total= 0;
        for (int i=0; i<6; i++){
            total= total+ marks[i];
        }
    }
    void displayDetails(){
        System.out.println(regno + "\t" + name + "\t\t" + course + "\t" + rank + "\n");
    }
}
public class StudentDemo {
	public static void main(String[]args) {
		int[] marks= new int[6];
		int n,i,j;
		String name, course;
		long regno;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		n= sc.nextInt();
		Student[] s1= new Student[n];
		for (i=0; i<n; i++) {
			System.out.println("Enter the name of student "+ (i+1) +": ");
			name= sc.next();
			System.out.println("Enter the register number of student "+ (i+1) +": ");
			regno= sc.nextLong();
			System.out.println("Enter the course of student "+ (i+1) +": ");
			course= sc.next();
			System.out.println("Enter the marks of 6 subjects of student "+ (i+1) +": ");
			for (j=0; j<6; j++) {
				System.out.println("Enter the mark of subject "+(j+1)+": ");
				marks[j]= sc.nextInt();
			}
			s1[i]=new Student(name, regno, course, marks);
            s1[i].getTotal();
		}
        Arrays.sort(s1, (a,b) -> b.total - a.total);
        s1[0].rank= 1;
        for (i=1; i<n; i++){
            if (s1[i].total == s1[i-1].total){
                s1[i].rank = s1[i-1].rank;
            }
            else{
                s1[i].rank= i+1;
            }
        }
        System.out.println("---Ranked Student List---");
        System.out.println("Reg no." + "\t" + "Name" + "\t\t" + "Course" + "\t" + "Rank\n");
        for (i=0; i<n; i++){
            s1[i].displayDetails();
        }
	}
}

