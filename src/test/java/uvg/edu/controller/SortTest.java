package uvg.edu.controller;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test class for Sort.
 * Authors:
 */
class SortTest {
    private Sort<Integer> sort;

    /**
     * Sets up the test environment before each test.
     */
    @BeforeEach
    void setUp() {
        IComparator<Integer> comparator = Integer::compare;
        sort = new Sort<>(comparator);
    }

    /**
     * Tests the insertion sort algorithm.
     */
    @Test
    void testInsertionSort() {
        Integer[] array = {5, 3, 8, 4, 2};
        Integer[] expected = {2, 3, 4, 5, 8};
        sort.insertionSort(array);
        assertArrayEquals(expected, array);
    }

    /**
     * Tests the merge sort algorithm.
     */
    @Test
    void testMergeSort() {
        Integer[] array = {9, 7, 5, 3, 1};
        Integer[] expected = {1, 3, 5, 7, 9};
        sort.mergeSort(array);
        assertArrayEquals(expected, array);
    }

    /**
     * Tests the quick sort algorithm.
     */
    @Test
    void testQuickSort() {
        Integer[] array = {10, 15, 5, 3, 7};
        Integer[] expected = {3, 5, 7, 10, 15};
        sort.quickSort(array);
        assertArrayEquals(expected, array);
    }

    /**
     * Tests the radix sort algorithm.
     */
    @Test
    void testRadixSort() {
        int[] array = {170, 45, 75, 90, 802, 24, 2, 66};
        int[] expected = {2, 24, 45, 66, 75, 90, 170, 802};
        sort.radixSort(array);
        assertArrayEquals(expected, array);
    }

    /**
     * Tests the bucket sort algorithm.
     */
    @Test
    void testBucketSort() {
        float[] array = {0.42f, 0.32f, 0.23f, 0.52f, 0.25f, 0.47f, 0.51f};
        float[] expected = {0.23f, 0.25f, 0.32f, 0.42f, 0.47f, 0.51f, 0.52f};
        sort.bucketSort(array);
        assertArrayEquals(expected, array);
    }

    /**
     * Tests the shell sort algorithm.
     */
    @Test
    void testShellSort() {
        Integer[] array = {19, 8, 7, 3, 5};
        Integer[] expected = {3, 5, 7, 8, 19};
        sort.shellSort(array);
        assertArrayEquals(expected, array);
    }
}