package training.sort;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class TestData {

    static Stream<Arguments> sort() {
        return Stream.of(
                Arguments.of(new int[]{1, -5, 4, 0, 2, -10, 9, 7, Integer.MAX_VALUE, 11, -17}, new int[]{-17, -10, -5, 0, 1, 2, 4, 7, 9, 11, Integer.MAX_VALUE}),
                Arguments.of(new int[]{22, 13, 7, 4, 2, -1, -15, -27, Integer.MIN_VALUE}, new int[]{Integer.MIN_VALUE, -27, -15, -1, 2, 4, 7, 13, 22}),
                Arguments.of(new int[]{-10, 10, -10, 10, 10, -10, 0, 0, -10, 10}, new int[]{-10, -10, -10, -10, 0, 0, 10, 10, 10, 10}),
                Arguments.of(new int[]{10, -10}, new int[]{-10, 10}),
                Arguments.of(new int[]{Integer.MAX_VALUE}, new int[]{Integer.MAX_VALUE})
        );
    }
}
