package org.danisanga.algorithm.searching;

import org.danisanga.algorithm.searching.BinarySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BinarySearchTest {

    int[] arrayTest = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
    List<Integer> arrayListTest = new ArrayList<>(Arrays.asList(2, 5, 8, 12, 16, 23, 38, 56, 72, 91));

    int low = 0;
    int high = arrayTest.length;

    @Test
    void performBinarySearchIteratively_shouldReturnExpectedIndex() {
        final int expectedIndex = BinarySearch.performBinarySearchIteratively(arrayTest, 23, low, high);

        Assertions.assertEquals(5, expectedIndex);

    }

    @Test
    void performBinarySearchIteratively_whenArrayNotContainsElement_shouldReturnNegativeIndex() {
        final int expectedIndex = BinarySearch.performBinarySearchIteratively(arrayTest, 9999, low, high);

        Assertions.assertEquals(-1, expectedIndex);

    }

    @Test
    void performBinarySearchRecursively_shouldReturnExpectedIndex() {
        final int expectedIndex = BinarySearch.performBinarySearchRecursively(arrayTest, 23, low, high - 1);

        Assertions.assertEquals(5, expectedIndex);

    }

    @Test
    void performBinarySearchRecursively_whenArrayNotContainsElement_shouldReturnNegativeIndex() {
        final int expectedIndex = BinarySearch.performBinarySearchRecursively(arrayTest, 9999, low, high - 1);

        Assertions.assertEquals(-1, expectedIndex);

    }

    @Test
    void performBinarySearchWithArraysFunction_shouldReturnExpectedIndex() {
        final int expectedIndex = BinarySearch.performBinarySearchWithArraysFunction(arrayTest, 23);

        Assertions.assertEquals(5, expectedIndex);

    }

    @Test
    void performBinarySearchWithArraysFunction_whenArrayNotContainsElement_shouldReturnNegativeIndex() {
        final int expectedIndex = BinarySearch.performBinarySearchWithArraysFunction(arrayTest, 9999);

        Assertions.assertEquals(-11, expectedIndex);

    }

    @Test
    void performBinarySearchWithCollectionsFunction_shouldReturnExpectedIndex() {
        final int expectedIndex = BinarySearch.performBinarySearchWithCollectionsFunction(arrayListTest, 23);

        Assertions.assertEquals(5, expectedIndex);

    }

    @Test
    void performBinarySearchWithCollectionsFunction_whenArrayNotContainsElement_shouldReturnNegativeIndex() {
        final int expectedIndex = BinarySearch.performBinarySearchWithCollectionsFunction(arrayListTest, 9999);

        Assertions.assertEquals(-11, expectedIndex);

    }
}
