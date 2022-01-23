package training.sort.alternative;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import training.sort.alternative.InsertionSort2;
import training.utils.TestUtils;

import static org.assertj.core.api.Assertions.assertThat;

public class InsertionSort2Test {

    @MethodSource("training.sort.TestData#sort")
    @ParameterizedTest
    void randomNumbers(int[] array, int[] sortedArray) {
        InsertionSort2.sort(array);

        assertThat(array).containsExactly(sortedArray);
    }

    @Test
    void hugeArray() {
        int[] array = TestUtils.generateIntArray(25_000);

        long timeMillis = System.currentTimeMillis();

        InsertionSort2.sort(array);

        timeMillis = System.currentTimeMillis() - timeMillis;
        System.out.printf("Sort execution time: %s%n", timeMillis);
    }
}
