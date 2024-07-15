'''
Description
LeetCode solution to 2390. Removing Stars From a String

Website Link: https://leetcode.com/problems/removing-stars-from-a-string/description/

@author: JW
'''

class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        
        // Iterate through string 
        // If '*' -> Pop from stack
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                if (stack.size() > 0) {
                    stack.pop();
                }
            } else {
                stack.push(s.charAt(i));
            }
        }

        // Combining remaining characters in the stack to form a string
        String result = stack.stream()
             .map(String::valueOf)
             .collect(Collectors.joining(""));
        
        return result;
    }
}