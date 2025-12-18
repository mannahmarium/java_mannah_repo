/*3 Create a class Book with:
• Variables: title, author, and price
• A constructor to initialize them
• Method to display book information
🟢 Add two books and display their details.*/

import java.util.*;
class Books{
    String title, author;
    double price;
    Books(String title, String author, double price){
        this.title= title;
        this.author= author;
        this.price= price;
    }
    void displayDetails(){
        System.out.println("---Book Details---");
        System.out.println("Title of the book: " + title);
        System.out.println("Author of the book: " + author);
        System.out.println("Price of the book: " + price + "\n");
    }
}
public class BooksDemo {
    public static void main(String[] args) {
        Scanner  sc= new Scanner(System.in);
        String title,author;
        double price;
        int i;
        for (i=1; i<=2; i++){
            System.out.println("Enter the details of book " + i + ": ");
            System.out.println("Enter the Title: ");
            title= sc.next();
            System.out.println("Enter the Author: ");
            author= sc.next();
            System.out.println("Enter the Price: ");
            price= sc.nextDouble();
            Books b= new Books(title, author, price);
            b.displayDetails();
        }
    }
}
