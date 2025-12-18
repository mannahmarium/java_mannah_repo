/*2. Create a class Circle with:
• Instance variable: radius
• A constructor to initialize radius
• Method to compute and display area and circumference
🟢 Use formula: area = πr², circumference = 2πr.*/

import java.util.*;
class Circle{
    double radius;
    Circle(double radius){
        this.radius= radius;
    }
    void displayArea(){
        double area;
        area= 3.14* radius * radius;
        System.out.println("Area of the circle with radius " + radius + " is: " + area);
    }
    void displayCircum(){
        double circum;
        circum= 2 * 3.14 * radius;
        System.out.println("Circumference of the circle with radius " + radius + " is: " + circum);
    }
}
public class CircleDemo {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        double radius;
        System.out.println("Enter the radius of the circle: ");
        radius= sc.nextDouble();
        Circle c= new Circle(radius);
        c.displayArea();
        c.displayCircum();
    }
}
