package org.danisanga.algorithm.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BubbleSortTest {
    int[] arrayTest = { 5, 3, 4, 1, 2 };
    int[] sortedArray = { 1, 2, 3, 4, 5 };

    @Test
    void performBubbleSort_shouldReturnSortedArray() {
        final int[] expectedResult = BubbleSort.performBubbleSort(arrayTest);

        Assertions.assertArrayEquals(expectedResult, sortedArray);
    }
}
