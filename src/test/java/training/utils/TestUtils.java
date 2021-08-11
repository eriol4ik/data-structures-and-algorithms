package training.utils;

import java.util.Random;

public class TestUtils {

    private static final Random random = new Random();

    public static int[] generateIntArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }
}
