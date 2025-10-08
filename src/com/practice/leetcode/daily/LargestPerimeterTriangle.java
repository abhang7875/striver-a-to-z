package com.practice.leetcode.daily;

public class LargestPerimeterTriangle {
    public int largestPerimeter(int[] nums) {
        int n = nums.length;
        swap(nums, n - 1);
        swap(nums, n - 2);

        for (int i = n - 1; i > 1; i--) {
            swap(nums, i - 2);
            if(nums[i] < nums[i-1] + nums[i-2]) return nums[i] + nums[i-1] + nums[i-2];
        }
        return 0;
    }

    private void swap(int [] nums, int index) {
        int maxIndex = 0;
        for(int i = 0; i <= index; i++) {
            if(nums[i] > nums[maxIndex]) maxIndex = i;
        }
        if(maxIndex != index) {
            int temp = nums[index];
            nums[index] = nums[maxIndex];
            nums[maxIndex] = temp;
        }
    }
}
