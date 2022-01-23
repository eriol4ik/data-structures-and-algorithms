package training.sort;

public class BubbleSort {

    // the idea is to move max element (acts like a bubble) to the end of the array
    public static void sort(int[] intArray) {
        // current i index will hold max element from unsorted elements
        for (int i = intArray.length - 1; i > 0; i--) {
            // iterate through all unsorted elements
            for (int j = 0; j < i; j++) {
                // if next element is larger than current then swap them
                // as a result the last elem at position j + 1 -> i will contain max element between unsorted
                if (intArray[j] > intArray[j + 1]) {
                    swap(intArray, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] intArray, int i, int j) {
        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }
}
