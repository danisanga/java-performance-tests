package org.danisanga.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LinearSearchTest {
    int[] arrayTest = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };

    @Test
    void performLinearSearch_shouldReturnExpectedIndex() {
        final int expectedIndex = LinearSearch.performLinearSearch(arrayTest, 23);

        Assertions.assertEquals(5, expectedIndex);
    }

    @Test
    void performLinearSearch_whenArrayNotContainsElement_shouldReturnNegativeIndex() {
        final int expectedIndex = LinearSearch.performLinearSearch(arrayTest, 9999);

        Assertions.assertEquals(-1, expectedIndex);
    }
}
