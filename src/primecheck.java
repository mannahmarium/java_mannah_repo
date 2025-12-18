import java.util.*;
public class primecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, count;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        count = 0;
        if (num <= 1) {
            System.out.println("Not Prime");
        } 
        else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
    }
}