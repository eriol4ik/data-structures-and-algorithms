package training.sort;

public class SelectionSort {

    public static void sort(int[] intArray) {
        // start from the last elem in the array, which will hold max sorted elem from unsorted elements
        for (int i = intArray.length - 1; i > 0; i--) {
            int maxElemIndex = 0;
            // search for the max element from unsorted elements, i = last unsorted element
            for (int j = 1; j <= i; j++) {
                if (intArray[j] > intArray[maxElemIndex]) {
                    maxElemIndex = j;
                }
            }
            // move found element to current sort index
            swap(intArray, maxElemIndex, i);
        }
    }

    private static void swap(int[] intArray, int i, int j) {
        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }
}
