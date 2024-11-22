package com.jwetherell.algorithms.sorts.test;
import com.jwetherell.algorithms.sorts.QuickSort;
import org.junit.jupiter.api.Test;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;



public class QuickSortTest {

    @Test
    public void testQuickSort() {
        // Test with regular input
        int[] input = {9, 7, 5, 11, 12, 2, 14, 3};
        int[] expected = {2, 3, 5, 7, 9, 11, 12, 14};
        assertArrayEquals(expected, QuickSort.QuickSort(input));

        // Test with already sorted input
        int[] sorted = {1, 2, 3, 4, 5};
        assertArrayEquals(sorted, QuickSort.QuickSort(sorted));

        // Test with reverse order
        int[] reverse = {10, 9, 8, 7, 6};
        int[] reverseExpected = {6, 7, 8, 9, 10};
        assertArrayEquals(reverseExpected, QuickSort.QuickSort(reverse));

        // Test with duplicates
        int[] duplicates = {4, 2, 4, 3, 1};
        int[] duplicatesExpected = {1, 2, 3, 4, 4};
        assertArrayEquals(duplicatesExpected, QuickSort.QuickSort(duplicates));

        // Test with empty input
        int[] empty = {};
        assertArrayEquals(empty, QuickSort.QuickSort(empty));
    }
}
