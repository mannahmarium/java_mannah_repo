import java.util.*;
public class VectorLarg {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<Integer>();
        numbers.add(25);
        numbers.add(60);
        numbers.add(15);
        numbers.add(80);
        numbers.add(45);
        int max = numbers.get(0);
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum value: " + max);
    }
}
