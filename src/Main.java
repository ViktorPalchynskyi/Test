import arrays_test.RandomValues;
import arrays_test.Worker;

import java.util.Random;

public class Main {
    public static void main(String[] args) {


        Worker [] workers = {new Worker(RandomValues.getRandomName(),RandomValues.getRandomAge(30,18)),new Worker(RandomValues.getRandomName(),RandomValues.getRandomAge(30,18)),new Worker(RandomValues.getRandomName(),RandomValues.getRandomAge(30,18))};

        for (Worker p :
                workers) {
            System.out.println("Worker`s name is " + p.getName() + " and age is " +p.getAge());
        }



        }
}
