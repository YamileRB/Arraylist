import java.util.ArrayList;

public class Ejercicio4 {


    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");
        list1.add("Date");

        list2.add("Banana");
        list2.add("Date");
        list2.add("Elderberry");
        list2.add("Fig");

        ArrayList<String> commonElements = new ArrayList<>();
        for (String item : list1) {
            if (list2.contains(item)) {
                commonElements.add(item);
            }
        }

        System.out.println("Elementos comunes: " + commonElements);
    }
}

