package Assignment;

import java.util.*;

public class Shuffle {
    public static void main(String[] args) {
        Shuffle2();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(list);
        Collections.shuffle(list, new Random());
        System.out.println(list);

    }
    public static void Shuffle2(){
        int[] array = {1,2,3,4,5,6,7,8};
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomIndex = rand.nextInt(array.length);
            int temp = array[randomIndex];
            array[randomIndex] = array[i];
            array[i] = temp;

        }
        System.out.println(Arrays.toString(array));

    }


    }


