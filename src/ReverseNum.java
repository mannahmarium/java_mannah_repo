import java.util.*;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, i, digit, rev = 0;
        System.out.print("Enter a number:");
        num = sc.nextInt();
        for (i = num; i != 0; i = i / 10) {
            digit = i % 10;
            rev = rev * 10 + digit;
        }
        System.out.println("Reversed number: " + rev);
    }
}
