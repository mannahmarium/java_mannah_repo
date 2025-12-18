import java.util.Scanner;
public class VowelsConsonant{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);  // Get first character from input

        switch (ch) {
            case 'a': case 'A':
            case 'e': case 'E':
            case 'i': case 'I':
            case 'o': case 'O':
            case 'u': case 'U':
                System.out.println(ch + " is a Vowel.");
                break;
            default:
                if (Character.isLetter(ch)) {
                    System.out.println(ch + " is a Consonant.");
                } else {
                    System.out.println("Not an alphabet!");
                }
        }
    }
}
