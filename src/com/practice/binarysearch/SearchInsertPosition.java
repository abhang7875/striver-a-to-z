package com.practice.binarysearch;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int high = nums.length - 1, low = 0;
        int mid = 0;
        while(high >= low){
            mid = low + (high - low) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return nums[mid] < target? mid + 1: mid;
    }
}
