package com.dotterbear.sorting.algorithms;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class SortTest {

    @Test
    public void quickSortTest() {
        Sort quickSort = new QuickSort();
        int[] nums = new int[] { 5, 9, 6, 2, 1, 4 };
        int[] sorted = quickSort.sort(nums.clone());
        Arrays.sort(nums);
        System.out.println(Arrays.toString(sorted));
        assertArrayEquals(nums, sorted);
    }

    @Test
    public void mergeSortTest() {
        Sort mergeSort = new MergeSort();
        int[] nums = new int[] { 5, 9, 6, 2, 1, 4 };
        int[] sorted = mergeSort.sort(nums.clone());
        Arrays.sort(nums);
        System.out.println(Arrays.toString(sorted));
        assertArrayEquals(nums, sorted);
    }

    @Test
    public void heapSortTest() {
        Sort heapSort = new HeapSort();
        int[] nums = new int[] { 5, 9, 6, 2, 1, 4 };
        int[] sorted = heapSort.sort(nums.clone());
        Arrays.sort(nums);
        System.out.println(Arrays.toString(sorted));
        assertArrayEquals(nums, sorted);
    }

    @Test
    public void insertionSortTest() {
        Sort sort = new InsertionSort();
        int[] nums = new int[] { 5, 9, 6, 2, 1, 4 };
        int[] sorted = sort.sort(nums.clone());
        Arrays.sort(nums);
        System.out.println(Arrays.toString(sorted));
        assertArrayEquals(nums, sorted);
    }

    @Test
    public void BinaryInsertionSortTest() {
        Sort sort = new BinaryInsertionSort();
        int[] nums = new int[] { 5, 9, 6, 2, 1, 4 };
        int[] sorted = sort.sort(nums.clone());
        Arrays.sort(nums);
        System.out.println(Arrays.toString(sorted));
        // assertArrayEquals(nums, sorted);
    }

    @Test
    public void TimSortTest() {
        Sort sort = new TimSort();
        int[] nums = new int[] { 5, 9, 6, 2, 1, 4 };
        int[] sorted = sort.sort(nums.clone());
        Arrays.sort(nums);
        System.out.println(Arrays.toString(sorted));
        assertArrayEquals(nums, sorted);
    }

}