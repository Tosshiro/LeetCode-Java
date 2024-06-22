'''
Description
LeetCode solution to 2108. Find First Palindromic String in the Array

Website Link: https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/

@author: Jw
'''

class Solution {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            int left = 0;
            int right = word.length() - 1;
            // Comparing left and right pointer letters to check if word is palindromic 
            while (left < right) {
                if (word.charAt(left) != word.charAt(right))    break;
                left++;
                right--;
            }

            // If left pointer is greater than right pointer, it means word is palindromic
            if (left >= right) {
                return word;
            }
        }

        // If none of the words are palindromic
        return "";
    }
}