'''
Description
LeetCode solution to 1929. Concatenation of Array

Website Link: https://leetcode.com/problems/concatenation-of-array/description/

@author: Jw
'''

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] newNums = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            newNums[i] = nums[i];
            newNums[i + nums.length] = nums[i];
        }

        return newNums;
    }
}