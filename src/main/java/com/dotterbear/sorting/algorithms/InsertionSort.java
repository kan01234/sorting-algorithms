package com.dotterbear.sorting.algorithms;

public class InsertionSort implements Sort {

    @Override
    public int[] sort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int j = i - 1;
            int cur = nums[i];
            while (j >= 0 && nums[j] > cur) { 
                nums[j + 1] = nums[j]; 
                j--; 
            } 
            nums[j + 1] = cur; 
        }
        return nums;
    }

}
