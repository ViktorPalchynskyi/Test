package arrays_test;

import java.util.Random;

public class RandomValues {


    public static String getRandomName() {
        String[] names = {
                "Hobert",
                "Chang",
                "Ronny",
                "Damon",
                "Emery",
                "Carter",
                "Hyman",
                "Zack",
                "Dwayne",
                "Marquis",
                "Ethan",
                "Antony",
                "Jeremiah",
                "Junior",
                "Herbert",
                "Margarito",
                "Jake",
                "Zachery",
                "Monte",
                "Perry"};

        Random random = new Random();
        int randomName = random.nextInt(names.length);
        return names[randomName];

    }


    public static int getRandomAge (int min, int max){
        Random random = new Random();
        return random.nextInt(min - max) + min;
    }


}
