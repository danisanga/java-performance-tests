package org.danisanga.algorithm.searching;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

    private BinarySearch() {
        throw new IllegalStateException("Utility class");
    }

    public static int performBinarySearchIteratively(final int[] sortedArray, final int elementToFind, int fromIndex, int toIndex) {
        int low = fromIndex;
        int high = toIndex - 1;

        int index = -1;

        while (low <= high) {
            int mid = low  + ((high - low) / 2);
            if (sortedArray[mid] < elementToFind) {
                low = mid + 1;
            } else if (sortedArray[mid] > elementToFind) {
                high = mid - 1;
            } else if (sortedArray[mid] == elementToFind) {
                index = mid;
                break;
            }
        }
        return index;
    }

    public static int performBinarySearchRecursively(final int[] sortedArray, final int elementToFind, int fromIndex, int toIndex) {
        int mid = fromIndex  + ((toIndex - fromIndex) / 2);

        if (toIndex < fromIndex) {
            return -1;
        }

        if (elementToFind == sortedArray[mid]) {
            return mid;
        } else if (elementToFind < sortedArray[mid]) {
            return performBinarySearchRecursively(sortedArray, elementToFind, fromIndex, mid - 1);
        } else {
            return performBinarySearchRecursively(sortedArray, elementToFind, mid + 1, toIndex);
        }
    }

    public static int performBinarySearchWithArraysFunction(final int[] sortedArray, final int elementToFind) {
        return Arrays.binarySearch(sortedArray, elementToFind);
    }

    public static int performBinarySearchWithCollectionsFunction(final List<Integer> sortedArray, final int elementToFind) {
        return Collections.binarySearch(sortedArray, elementToFind);
    }

}
