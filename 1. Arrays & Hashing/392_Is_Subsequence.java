'''
Description
LeetCode solution to 392. Is Subsequence

Website Link: https://leetcode.com/problems/is-subsequence/

@author: Jw
'''

class Solution {
    public boolean isSubsequence(String s, String t) {
        // Pointer for String s
        int pointer = 0;

        for (int i = 0; i < t.length(); i++) {
            // If pointer is out of index of string s
            if (pointer > s.length() - 1)   break;

            char c = t.charAt(i);
            char d = s.charAt(pointer);
            if (c == d)     pointer++;
        }

        return pointer == s.length();
    }
}