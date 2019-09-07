package com.dotterbear.sorting.algorithms;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class QuickSortTest {

    @Test
    public void sortTest() {
        Sort quickSort = new QuickSort();
        int[] nums = new int[] { 5, 9, 6, 2, 1, 4 };
        int[] sorted = quickSort.sort(nums.clone());
        Arrays.sort(nums);
        System.out.println(Arrays.toString(sorted));
        assertArrayEquals(nums, sorted);
    }

}