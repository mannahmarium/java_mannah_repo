import java.util.*;
public class VectorSearch {
    public static void main(String[] args) {
        Vector<String> items = new Vector<String>();
        items.add("Pen");
        items.add("Notebook");
        items.add("Eraser");
        items.add("Marker");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the item to search: ");
        String input = sc.nextLine();
        if (items.contains(input)) {
            System.out.println("Item found");
        } else {
            System.out.println("Item not found");
        }
    }
}
