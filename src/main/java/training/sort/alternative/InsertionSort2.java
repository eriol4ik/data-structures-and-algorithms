package training.sort.alternative;

public class InsertionSort2 {

    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int elem = array[i];
            int elemIndex = i;
            while (elemIndex >= 1 && array[elemIndex - 1] > elem) {
                array[elemIndex] = array[elemIndex - 1];
                elemIndex--;
            }
            array[elemIndex] = elem;
        }
    }
}
