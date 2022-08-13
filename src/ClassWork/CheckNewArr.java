package ClassWork;


public class CheckNewArr {
    public static void main(String[] args) {
        int[] array = {45, 8, 50, 23, 32, 11, 90, 89, 34};
        sortArr(array);
    }
    public static void sortArr(int[] array){
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }

        }
        for (int j : array){
            System.out.println(j);
        }
    }
}
