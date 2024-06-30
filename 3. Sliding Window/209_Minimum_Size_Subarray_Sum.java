'''
Description
LeetCode solution to 209. Minimum Size Subarray Sum

Website Link: https://leetcode.com/problems/minimum-size-subarray-sum/description/

@author: JW
'''

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int total = 0;
        int answer = 999999;

        for (int right = 0; right < nums.length; right++) {
            total += nums[right];
            
            // If window total is greater than target, keep removing left element until total is smaller than target
            if (total >= target) {
                while (true) {
                    if (total - nums[left] >= target) {
                        total -= nums[left];
                        left++;
                    } else  break;
                }

                answer = Math.min(right - left + 1, answer);
            }
        }
        
        // If no substring's total is greater than target
        if (answer == 999999) {
            answer = 0;
        }
        return answer;
    }
}