package com.dotterbear.sorting.algorithms;

public class QuickSort implements Sort {

    @Override
    public int[] sort(int[] nums) {
        return sort(nums, 0, nums.length - 1);
    }

    public int[] sort(int[] nums, int start, int end) {
        if (start >= end)
            return nums;
        int i = start - 1;
        int pivot = end;
        for (int j = start; j < end; j++) {
            if (nums[j] <= nums[pivot]) {
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i + 1, pivot);
        sort(nums, start, i);
        sort(nums, i + 2, pivot);
        return nums;
    }

    public void swap(int[] nums, int i, int j) {
        if (i < 0 || j < 0)
            return;
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}