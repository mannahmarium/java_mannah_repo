import java.util.*;
public class ArrayMaxMin {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        int n,i,max,min;
        System.out.println("\nEnter the number of elements: ");
        n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("\nEnter the elements: ");
        for (i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        max= arr[0];
        min= arr[0];
        for (i=0; i<n; i++){
            if(arr[i] > max){
                max= arr[i];
            }
            if (arr[i] < min){
                min= arr[i];
            }
        }
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
