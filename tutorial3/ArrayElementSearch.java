import java.util.*;
public class ArrayElementSearch {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        int n,i,key,pos=-1;
        System.out.println("\nEnter the number of elements: ");
        n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("\nEnter the elements: ");
        for (i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        key= sc.nextInt();
        for(i=0; i<n; i++){
            if (key==arr[i]){
                pos=i;
            }
        }
        if(pos!= -1){
            System.out.println("Element " + key + " found at position " + pos);
        }
        else{
            System.out.println("Element not found.");
        }
    }
}
    

