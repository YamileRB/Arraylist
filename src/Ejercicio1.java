import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

    public static void main(String[] args) {
        String fruit = "Apple";
        String fruit1 = "Banana";
        String fruit2 = "Cherry";

        List<String> listFruits = new ArrayList<>();

        listFruits.add("Apple");
        listFruits.add("Banana");
        listFruits.add("Cherry");

        System.out.println(listFruits);
        System.out.println(listFruits.size());


        listFruits.remove(1);
        System.out.println(listFruits);

        listFruits.set(1, "Orange");
        System.out.println(listFruits);
    }


}



