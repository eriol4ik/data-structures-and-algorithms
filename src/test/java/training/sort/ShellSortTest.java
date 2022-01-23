package training.sort;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import training.utils.TestUtils;

import static org.assertj.core.api.Assertions.assertThat;

public class ShellSortTest {

    @MethodSource("training.sort.TestData#sort")
    @ParameterizedTest
    void randomNumbers(int[] array, int[] sortedArray) {
        ShellSort.sort(array);

        assertThat(array).containsExactly(sortedArray);
    }

    @Test
    void hugeArray() {
        int[] array = TestUtils.generateIntArray(25_000);

        long timeMillis = System.currentTimeMillis();

        ShellSort.sort(array);

        timeMillis = System.currentTimeMillis() - timeMillis;
        System.out.printf("Sort execution time: %s%n", timeMillis);

    }
}
