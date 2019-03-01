import arrays_test.RandomValues;
import arrays_test.Worker;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        int[] array = {10, 100, 1, 42, 4, 8};
        boolean isSort = false;
        int change;
        System.out.println("Before the sort " + Arrays.toString(array));
        while (!isSort) {
            isSort = true;
            for (int i = 0; i < array.length - 1; i++) {


                if (array[i] > array[i + 1]) {
                    isSort = false;


                    change = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = change;

                }
            }
        }
        System.out.println("After the sort " + Arrays.toString(array));





    }
}
