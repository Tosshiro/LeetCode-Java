'''
Description
LeetCode solution to 540. Single Element in a Sorted Array

Website Link: https://leetcode.com/problems/single-element-in-a-sorted-array/description/

@author: JW
'''

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            // If mid index is odd, make it even
            if (mid % 2 == 1) {
                mid--;
            }
            // If not equal, means the single element must be on the left side of the array 
            // As at every even index, the next index element should be the same 
            if (nums[mid] != nums[mid + 1]) {
                right = mid;
            } 
            // If nums[mid + 1] is equals to nums[mid], this proves that there are only pairs in the left
            // left + 2 to skip the current pair mid index is on
            else {
                left = mid + 2;
            }
        }
        return nums[left];
    }
}