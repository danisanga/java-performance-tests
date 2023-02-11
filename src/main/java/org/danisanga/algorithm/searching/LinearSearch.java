package org.danisanga.algorithm.searching;

public class LinearSearch {

    private LinearSearch() {
        throw new IllegalStateException("Utility class");
    }

    public static int performLinearSearch(final int[] array, final int elementToFind) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToFind) {
                return i;
            }
        }
        return -1;
    }
}
