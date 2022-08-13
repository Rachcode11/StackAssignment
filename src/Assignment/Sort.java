package Assignment;

import java.util.Arrays;

public class Sort {
    public static void sortArr(int [] array){
     int temp = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++ ){
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }
    public static void main(String[] args) {
        int [] array = {45,8,50,10,5,17};
        sortArr(array);

    }

}

