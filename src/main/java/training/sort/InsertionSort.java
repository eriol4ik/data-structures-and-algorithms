package training.sort;

public class InsertionSort {

    public static void sort(int[] array) {
        // sorted partition starts with only element at index 0
        // unsorted partition starts with index 1 at the beginning and is decreased with each iteration
        // in other words, with each iteration new elem is added to sorted partition
        for (int i = 1; i < array.length; i++) {
            int elem = array[i];
            int elemIndex = i;
            // iterate through sorted partition and find a place for unsorted elem
            for (int j = i - 1; j >= 0; j--) {
                // if previous elem is larger
                if (array[j] > elem) {
                    // then move it to the right
                    array[j + 1] = array[j];
                    // save index of moved element, where we potentially will place unsorted elem
                    elemIndex = j;
                } else break;
            }
            array[elemIndex] = elem;
        }
    }
}
