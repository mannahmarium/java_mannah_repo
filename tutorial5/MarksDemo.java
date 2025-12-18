/* 4. Create a class Marks with:
• Variables: mark1, mark2, mark3
• Constructor to initialize all marks
• Method to calculate and return total and average
🟢 Input marks of a student and display result.*/

import java.util.*;
class Marks{
    double mark1, mark2, mark3;
    Marks(double mark1, double mark2, double mark3){
        this.mark1= mark1;
        this.mark2= mark2;
        this.mark3= mark3;
    }
    double getTotal(){
        double total;
        total= mark1 + mark2 + mark3;
        return total;
    }
    double getAverage(){
        double average;
        average= getTotal()/3;
        return average;
    }
}
public class MarksDemo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double mark1, mark2, mark3;
        System.out.println("Enter the mark of subject 1: ");
        mark1= sc.nextDouble();
        System.out.println("Enter the mark of subject 2: ");
        mark2= sc.nextDouble();
        System.out.println("Enter the mark of subject 3: ");
        mark3= sc.nextDouble();
        Marks m= new Marks(mark1, mark2, mark3);
        System.out.println("---Result---");
        System.out.println("Total of the 3 subjects: " + m.getTotal());
        System.out.println("Average of the 3 subjects: " + m.getAverage());
    }
}
