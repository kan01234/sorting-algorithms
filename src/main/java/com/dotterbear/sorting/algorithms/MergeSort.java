package com.dotterbear.sorting.algorithms;

public class MergeSort implements Sort {

    @Override
    public int[] sort(int[] nums) {
        sort(nums, 0, nums.length - 1);
        return nums;
    }

    public void sort(int[] nums, int start, int end) {
        if (start >= end)
            return;
        int mid = (start + end) / 2;
        sort(nums, start, mid);
        sort(nums, mid + 1, end);
        merge(nums, start, mid, end);
    }

    public void merge(int[] nums, int start, int mid, int end) {
        int leftLength = mid - start + 1;
        int rightLength = end - mid;
        int[] leftNums = new int[leftLength];
        int[] rightNums = new int[rightLength];
        for (int i = 0; i < leftLength; i++)
            leftNums[i] = nums[start + i];
        for (int i = 0; i < rightLength; i++)
            rightNums[i] = nums[mid + i + 1];
        int leftPointer = 0;
        int rightPointer = 0;
        int numsPointer = start;
        while (leftPointer < leftLength && rightPointer < rightLength) {
            if (leftNums[leftPointer] < rightNums[rightPointer])
                nums[numsPointer++] = leftNums[leftPointer++];
            else
                nums[numsPointer++] = rightNums[rightPointer++];
        }
        while (leftPointer < leftLength)
            nums[numsPointer++] = leftNums[leftPointer++];
        while (rightPointer < rightLength)
            nums[numsPointer++] = rightNums[rightPointer++];
    }
}