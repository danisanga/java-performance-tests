package org.danisanga.algorithm.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InsertionSortTest {
    int[] arrayTest = { 5, 3, 4, 1, 2 };
    int[] sortedArray = { 1, 2, 3, 4, 5 };

    @Test
    void performInsertionSort_shouldReturnSortedArray() {
        final int[] expectedResult = InsertionSort.performInsertionSort(arrayTest);

        Assertions.assertArrayEquals(expectedResult, sortedArray);
    }
}
