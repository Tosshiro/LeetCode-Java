'''
Description
LeetCode solution to 605. Can Place Flowers

Website Link: https://leetcode.com/problems/find-pivot-index/description/

@author: Jw
'''

class Solution {
    public int pivotIndex(int[] nums) {
        int rightTotal = 0;
        int leftTotal = 0;
        // Adding sum of all numbers in list
        for (int num : nums) {
            rightTotal += num;
        } 

        rightTotal -= nums[0];
        // If pivot index is at 0
        if (rightTotal == 0)    return 0;
        for (int i = 1; i < nums.length; i++) {
            rightTotal -= nums[i];
            leftTotal += nums[i - 1];
            // Compare left sum and right sum, if same reture pivot index
            if (leftTotal == rightTotal)    return i;
        }
        
        // If no pivot index
        return -1;
    }
}