import java.util.*;
public class VectorColours {
    public static void main(String[] args) {
        Vector<String> colors = new Vector<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.remove("Green");
        System.out.println("Colors after removing 'Green':");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
