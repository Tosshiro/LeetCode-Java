'''
Description
LeetCode solution to 283. Move Zeroes

Website Link: https://leetcode.com/problems/move-zeroes/description/

@author: Jw
'''


class Solution {
    public void moveZeroes(int[] nums) {
        int p1 = 0;
        int p2 = 1;

        while (p2 != nums.length) {
            // Swap number at p1 and p2, when p1 points to 0 and p2 does not point to a 0
            if (nums[p1] == 0 && nums[p2] != 0) {
                nums[p1] = nums[p2];
                nums[p2] = 0;
                p1++;
            } 
            // Shift to next number if p1 not pointing at a 0
            else if (nums[p1] != 0)   p1++;

            // Second pointer always increment
            p2++;
        }
    }
}