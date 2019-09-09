package com.dotterbear.sorting.algorithms;

public class HeapSort implements Sort {

    @Override
    public int[] sort(int[] nums) {
        return heapSort(nums);
    }

    public int[] heapSort(int[] nums) {
        int m = nums.length / 2;
        for (int i = m; i >= 0; i--)
            maxHeap(nums, nums.length, i);
        for (int i = nums.length - 1; i >= 1; i--) {
            swap(nums, 0, i);
            maxHeap(nums, i, 0);
        }
        return nums;
    }

    private void maxHeap(int[] nums, int heapSize, int index) {
        int left = index * 2 + 1;
        int right = index * 2 + 2;
        int max = index;
        if (left < heapSize && nums[left] > nums[index])
            max = left;
        if (right < heapSize && nums[right] > nums[max])
            max = right;
        if (index != max) {
            swap(nums, index, max);
            maxHeap(nums, heapSize, max);
        }
    }

    public void swap(int[] nums, int i, int j) {
        if (i < 0 || j < 0)
            return;
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

}