import java.util.Scanner;
public class ArrayDisplay {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n,i;
        System.out.println("\nEnter the number of elements: ");
        n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("\nEnter the elements: ");
        for (i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("\nEntered elements in given order: ");
        for(i=0; i<n; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println("\nEntered elements in reverse order: ");
        for(i=n-1; i>=0; i--){
            System.out.println(arr[i] + " ");
        }
    }
}
