'''
Description
LeetCode solution to 605. Can Place Flowers

Website Link: https://leetcode.com/problems/can-place-flowers/description/

@author: Jw
'''

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // Check base case
        if (n == 0) {
            return true;
        }

        // Loop through and check whether able to place a flower at flowerbed[i]
        for (int i = 0; i < flowerbed.length; i++) {
            // Checks whether flowerbed[i] is first or last element also
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length - 1 || flowerbed[i+1] == 0)) {
                flowerbed[i] = 1;
                n--;
                if (n == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}