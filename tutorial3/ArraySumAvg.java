import java.util.*;
public class ArraySumAvg {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        int n,i,sum=0;
        float avg=0;
        System.out.println("\nEnter the number of elements: ");
        n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("\nEnter the elements: ");
        for (i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        for (i=0; i<n; i++){
            sum+=arr[i];
        }
        avg= (float) sum/n;
        System.out.println("Sum of elements in the array: " + sum);
        System.out.println("Average of elements in the array: " + avg);
    }
}
