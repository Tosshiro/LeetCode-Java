'''
Description
LeetCode solution to 1768. Merge Strings Alternately

Website Link: https://leetcode.com/problems/merge-strings-alternately/description/

@author: Jw
'''

class Solution {
    public String mergeAlternately(String word1, String word2) {
        // Two pointer
        String output = "";
        int p1 = 0;
        int p2 = 0;
        // Adding char from each string alternately until we add all elements of one string
        while (p1 < word1.length() && p2 < word2.length()) {
            output = output + "" + word1.charAt(p1) + "" + word2.charAt(p2);
            p1++;
            p2++;
        }

        // Check if need to add any remaining elements from word1
        while (p1 != word1.length()) {
            output = output + "" + word1.charAt(p1);
            p1++;
        }

        // Check if need to add any remaining elements from word2
        while (p2 != word2.length()) {
            output = output + "" + word2.charAt(p2);
            p2++;
        }

        return output;
    }
}