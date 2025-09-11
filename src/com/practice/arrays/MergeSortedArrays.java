package com.practice.arrays;

public class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int z = m + n - 1;
        m--; n--;
        while(n >= 0) {
            if(m >= 0 && nums1[m] > nums2[n]) {
                nums1[z] = nums1[m];
                m--;
            }else {
                nums1[z] = nums2[n];
                n--;
            }
            z--;
        }
    }
}
