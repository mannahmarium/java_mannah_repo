import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, i, fact;
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        i = 1;
        fact = 1;
        while (i <= number) {
            fact = fact * i;
            i++;
        }

        System.out.println("Factorial of " + number + " is: " + fact);
        sc.close();
    }
}


