package training.sort.alternative;

public class ShellSort2 {

    public static void sort(int[] array) {
        for (int gap = array.length; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                int elem = array[i];
                int index = i;
                while (index >= gap && array[index - gap] > elem) {
                    array[index] = array[index - gap];
                    index -= gap;
                }
                array[index] = elem;
            }
        }
    }
}
