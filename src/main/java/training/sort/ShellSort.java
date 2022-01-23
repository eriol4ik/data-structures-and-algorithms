package training.sort;

public class ShellSort {

    // the idea is the same as Insertion sort, but now we search the correct position among elements with the shift
    // on gap value, each iteration stays shifting on one element
    public static void sort(int[] array) {
        // adding new iteration: preliminary work with the elements with larger gap,
        // the last iteration becomes Insertion sort: gap = 1, but with mostly sorted array - less iterations
        for (int gap = array.length; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) { // shifting each iteration on the same value - one
                int elem = array[i];
                int index = i;
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (array[j] > elem) {
                        array[j + gap] = array[j];
                        index = j;
                    } else break;
                }
                array[index] = elem;
            }
        }
    }
}
