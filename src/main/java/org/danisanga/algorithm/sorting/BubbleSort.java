package org.danisanga.algorithm.sorting;

public class BubbleSort {
    private BubbleSort() {
        throw new IllegalStateException("Utility class");
    }

    public static int[] performBubbleSort(int[] array) {
        int size = array.length;
        // Loop over each element of the array to access them
        for (int i = 0; i < size - 1; i++) {
            // Compare the elements of the array with a loop
            for (int j = 0; j < size - i - 1; j++) {
                // Compare two adjacent elements in the array
                if (array[j] > array[j + 1]) {
                    // Swap if the elements aren't in the right order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
