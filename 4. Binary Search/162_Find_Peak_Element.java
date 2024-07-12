'''
Description
LeetCode solution to 162. Find Peak Element

Website Link: https://leetcode.com/problems/find-peak-element/description/

@author: JW
'''

class Solution {
    public int findPeakElement(int[] nums) {
        // Binary search, just need to make sure we search the half with atleast one peak element
        int left = 0, right = nums.length - 1;
        while (right >= left) {
            int mid = (right + left) / 2;
            // If left or right index element is greater than mid index
            if (mid > 0 && nums[mid] < nums[mid - 1]) {
                right = mid - 1;
            } else if (mid < nums.length - 1 && nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            }
            // If neighbouring index elements are smaller than mid index element 
            else  return mid;
        }
        
        // If no peak element found
        return -1;
    }
}