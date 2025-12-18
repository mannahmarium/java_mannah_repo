import java.util.*;
public class ArrayAscendingSort{
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        int n,i;
        System.out.println("\nEnter the number of elements: ");
        n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("\nEnter the elements: ");
        for (i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("\nSorted array in ascending order: ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}