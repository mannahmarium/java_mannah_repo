import java.util.*;
public class VectorFruits {
    public static void main(String[] args) {
        Vector<String> fruits = new Vector<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Pineapple");
        System.out.println("List of Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
