package com.dotterbear.sorting.algorithms;

public class Timsort implements Sort {

    private static final  int RUN = 3;

    private static BinaryInsertionSort binaryInsertionSort = new BinaryInsertionSort();

    private static MergeSort mergeSort = new MergeSort();

    @Override
    public int[] sort(int[] nums) {
        timsort(nums);
        return nums;
    }

    public void timsort(int[] nums) {
        // build run
        for (int i = 0; i < nums.length; i += RUN) {
            binaryInsertionSort.binaryInsertionSort(nums, i, Math.min(i + RUN, nums.length));
        }
        // merge run
        for (int size = RUN; size < nums.length; size = 2 * size) {
            for (int left = 0; left < nums.length; left += 2 * size) { 
                int mid = left + size - 1; 
                int right = Math.min((left + 2 * size - 1), (nums.length - 1)); 
                mergeSort.merge(nums, left, mid, right); 
            } 
        } 
    }
}