'''
Description
LeetCode solution to 2300. Successful Pairs of Spells and Potions

Website Link: https://leetcode.com/problems/successful-pairs-of-spells-and-potions/description/

@author: JW
'''

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {

        // Sort Potion list and create new answer list
        Arrays.sort(potions);
        int[] answer = new int[spells.length];

        for (int i = 0; i < spells.length; i++) {
            // index value has to be length of potions as if no potions * spell >= success, 
            // (potions.length - index = 0), line 26
            int index = potions.length; // Find weakest potion that just nice when multiplied with spell >= success
            // Binary search to find weakest potion
            int left = 0, right = potions.length - 1;
            while (right >= left) {
                int mid = left + (right - left) / 2;
                if (potions[mid] * (long)spells[i] >= success) {
                    right = mid - 1;
                    index = mid;
                } else {
                    left = mid + 1;
                }
            }
            // Weakest potion index onwards all satisfy (potion * spell >= success)
            answer[i] = potions.length - index;
        }

        return answer;
    }
}