import java.util.Scanner;
public class ArrayOddEven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, i, odd=0, even=0;
        System.out.println("\nEnter the number of elements: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("\nEnter the elements: ");
        for(i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i]%2==0){
                even++;
            } 
            else{
                odd++;
            }
        }

        System.out.println("Even numbers count is: " + even);
        System.out.println("Odd numbers count is: " + odd);
    }
}

