'''
Description
LeetCode solution to 948. Bag of Tokens

Website Link: https://leetcode.com/problems/bag-of-tokens/description/

@author: JW
'''

import java.util.Arrays;

class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        // Two pointer and sorting
        Arrays.sort(tokens);
        int left = 0;
        int right = tokens.length - 1;
        int score = 0;
        int temp = 0;
        while (left <= right) {
            // If power is smaller than smallest token
            if (power < tokens[left]) {
                // If score = 0, cannot increase power and return score
                if (temp == 0)  return score;
                else {
                    // Keep using score to increase power until its greater than smallest token
                    // Break either when score = 0 or when power > smallest token
                    while (temp != 0) {
                        if (power >= tokens[left])  break;
                        temp--;
                        power += tokens[right];
                        right--;
                    }
                }
            
            // If power is greater than smallest token, shift left pointer to next smallest token
            } else {
                power -= tokens[left];
                temp++;
                // Update score
                score = Math.max(temp, score);
                left++;
            }
        }
        return score;
    }
}