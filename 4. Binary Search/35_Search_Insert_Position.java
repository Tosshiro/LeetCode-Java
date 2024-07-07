'''
Description
LeetCode solution to 35. Search Insert Position

Website Link: https://leetcode.com/problems/search-insert-position/description/

@author: JW
'''

class Solution {
    public int searchInsert(int[] nums, int target) {
        int right = nums.length;
        int left = 0;
        int middle = right + left / 2;
        while (right > left) {
            if (target == nums[middle]) {
                return middle;
            } else if (target < nums[middle]) {
                right = middle - 1;
                middle = right + left / 2;
            } else {
                left = middle + 1;
                middle = right + left / 2;
            }
        }

        return middle;
    }
}