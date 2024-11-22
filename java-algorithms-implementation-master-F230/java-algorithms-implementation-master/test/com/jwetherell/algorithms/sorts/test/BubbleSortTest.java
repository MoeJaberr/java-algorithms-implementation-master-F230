package com.jwetherell.algorithms.sorts.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;
import com.jwetherell.algorithms.sorts.BubbleSort;



public class BubbleSortTest {

    @Test
    public void testBubbleSort() {
        // Test with regular input
        int[] input = {5, 3, 8, 6, 2};
        int[] expected = {2, 3, 5, 6, 8};
        assertArrayEquals(expected, BubbleSort.BubbleSort(input));

        // Test with already sorted input
        int[] sorted = {1, 2, 3, 4, 5};
        assertArrayEquals(sorted, BubbleSort.BubbleSort(sorted));

        // Test with reverse order
        int[] reverse = {5, 4, 3, 2, 1};
        int[] reverseExpected = {1, 2, 3, 4, 5};
        assertArrayEquals(reverseExpected, BubbleSort.BubbleSort(reverse));

        // Test with empty input
        int[] empty = {};
        assertArrayEquals(empty, BubbleSort.BubbleSort(empty));

        // Test with single element
        int[] single = {7};
        assertArrayEquals(single, BubbleSort.BubbleSort(single));
    }
}
