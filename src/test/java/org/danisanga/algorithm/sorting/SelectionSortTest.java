package org.danisanga.algorithm.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SelectionSortTest {
    int[] arrayTest = { 5, 3, 4, 1, 2 };
    int[] sortedArray = { 1, 2, 3, 4, 5 };

    @Test
    void performSelectionSort_shouldReturnSortedArray() {
        final int[] expectedResult = SelectionSort.performSelectionSort(arrayTest);

        Assertions.assertArrayEquals(expectedResult, sortedArray);
    }
}
