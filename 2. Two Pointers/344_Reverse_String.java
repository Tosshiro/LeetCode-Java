'''
Description
LeetCode solution to 344. Reverse String

Website Link: https://leetcode.com/problems/reverse-string/description/

@author: Jw
'''
class Solution {
    public void reverseString(char[] s) {
        // Two Pointers to swap s[left] with s[right]
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}