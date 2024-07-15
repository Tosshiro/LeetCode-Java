'''
Description
LeetCode solution to 946. Validate Stack Sequences

Website Link: https://leetcode.com/problems/validate-stack-sequences/description/

@author: JW
'''

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int p1 = 0;
        
        // Pushing all elements in pushed array
        for (int n : pushed) {
            stack.push(n);
            // To pop -> Stack must not be empty and p1 must be smaller than popped array length
            // Keep popping until last element != popped[p1]
            while (p1 < popped.length && stack.size() > 0 && stack.lastElement() == popped[p1]) {
                stack.pop();
                p1++;
            }
        }

        if (stack.size() == 0)  return true;
        else    return false;
    }
}