package ClassWork;

import java.util.Arrays;
import java.util.Random;

public class Shuffle {
    public static void main(String[] args) {
        Sort();
        int [] array = {2,3,4,5,6,7,8};
        Random rand = new Random();
        for (int i = 0; i < array.length; i++){
            int randomIndex = rand.nextInt(array.length);
            int temp = array[randomIndex];
            array[randomIndex] = array[i];
            array[i] = temp;

        }
        System.out.println(Arrays.toString(array));
 }
    public static void Sort(){
        int [] array = {45,8,50,6,9,8,4,6,7,};
        int temp = 0;
        for (int i = 0; i < array.length ; i++) {
            for (int j = i + 1; j < array.length ; j++) {
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }

                }


            }
        System.out.println(Arrays.toString(array));

    }
    }

