package Stack;

import java.util.Iterator;
import java.util.Vector;

public class Element2 {
    public static void main(String[] args) {
        animals();
        Vector<String>mammals = new Vector<>();

        // using the add () method
        mammals.add("Dog");
        mammals.add("Horse");

        // using index number
        mammals.add(2,"cat");
        System.out.println("vector: " + mammals);

        // using addAll
        Vector<String> animals = new Vector<>();
        animals.add("Crocodile");

        animals.addAll(mammals);
        System.out.println("New Vector : " + animals);


    }
    // Access Vector elements
    public static void animals(){
        Vector<String>animals = new Vector<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("horse");

        // using get()
        String element = animals.get(2);
        System.out.println("Element at index 2:" + element);

        // using iterator()
        Iterator<String> iterate = animals.iterator();
        System.out.println("Vector: ");
        while (iterate.hasNext()){
            System.out.println(iterate.next());
            System.out.println(", ");
        }


    }

}
