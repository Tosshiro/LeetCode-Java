'''
Description
LeetCode solution to 219. Contains Duplicate II

Website Link: https://leetcode.com/problems/contains-duplicate-ii/description/

@author: JW
'''

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Sliding window, O(n) Time Complexity
        HashSet<Integer> window = new HashSet<>();
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            // Check whether window is within limit k
            if (right - left > k) {
                window.remove(nums[left]);
                left++;
            }
            // Check whether element being added to window is a duplicate
            if (window.contains(nums[right]))   return true;
            window.add(nums[right]);
        }

        return false;
    }
}