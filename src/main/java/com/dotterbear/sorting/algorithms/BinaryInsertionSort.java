package com.dotterbear.sorting.algorithms;

public class BinaryInsertionSort implements Sort {

    @Override
    public int[] sort(int[] nums) {
        binaryInsertionSort(nums, nums.length);
        return nums;
    }

    public void binaryInsertionSort(int[] nums, int length) {
        for (int i = 1; i < length; i++) {
            int j = i - 1;
            int cur = nums[i];
            int loc = binarySearch(nums, cur, 0, j);            
            while (j >= loc) {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = cur;
        }
    }

    public int binarySearch(int nums[], int item, int low, int high) {
        if (high <= low)
            return (item > nums[low])? (low + 1): low;
        int mid = (low + high)/2;
        if(item == nums[mid])
            return mid+1;
        if(item > nums[mid])
            return binarySearch(nums, item, mid+1, high);
        return binarySearch(nums, item, low, mid-1);
    }
    
}
