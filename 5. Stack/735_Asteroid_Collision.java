'''
Description
LeetCode solution to 735. Asteroid Collision

Website Link: https://leetcode.com/problems/asteroid-collision/description/

@author: JW
'''


class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int ast: asteroids) {
            // Check if incoming asteroid is in opposite direction (ast < 0)
            while (stack.size() > 0 && ast < 0 && stack.lastElement() > 0) {
                // Ast < 0 and Top element in stack > 0
                // If added together and smaller than 0 -> Size of incoming ast is bigger
                // If bigger than 0 -> Top element asteroid in stack is bigger
                // If 0 -> Same size
                int diff = stack.lastElement() + ast;
                if (diff > 0) {
                    // Incoming asteroid is destroyed
                    ast = 0;
                } else if (diff < 0) {
                    // Top element of stack is destroyed
                    stack.pop();
                } else {
                    stack.pop();
                    // Break out of loop 
                    ast = 0;
                }
            }

            // If incoming asteroid is not destroyed OR same direction/ Not colliding with any asteroids
            // Push it onto stack
            if (ast != 0) {
                stack.push(ast);
            }
        }

        int[] res = new int[stack.size()];
        int count = 0;
        for (int i : stack) {
            res[count] = i;
            count++;
        }

        return res;
    }
}