import arrays_test.RandomValues;
import arrays_test.Worker;

import java.util.Random;

public class Main {
    public static void main(String[] args) {







        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
