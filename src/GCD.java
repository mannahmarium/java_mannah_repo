import java.util.*;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, temp;
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD is: " + a);
    }
}

