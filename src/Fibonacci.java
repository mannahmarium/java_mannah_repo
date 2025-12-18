
import java.util.*;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit, a = 0, b = 1, next;
        System.out.print("Enter the limit: ");
        limit = sc.nextInt();
        System.out.print("Fibonacci Series up to " + limit + ": ");
        while (a <= limit) {
            System.out.print(a + " ");
            next = a + b;
            a = b;
            b = next;
        }
    }
}
