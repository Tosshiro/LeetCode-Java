'''
Description
LeetCode solution to 904. Fruit Into Baskets

Website Link: https://leetcode.com/problems/fruit-into-baskets/description/

@author: JW
'''

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int totalFruit(int[] fruits) {
        // Map to store the frequency of each type of fruit in the current window
        Map<Integer, Integer> count = new HashMap<>();
        int maxFruits = 0;
        int left = 0;

        // Iterate through each fruit in the array
        for (int right = 0; right < fruits.length; right++) {
            // Add the current fruit to the count map
            count.put(fruits[right], count.getOrDefault(fruits[right], 0) + 1);

            // Check if we have more than two types of fruits in the current window
            while (count.size() > 2) {
                // Remove one fruit from the left end of the window
                count.put(fruits[left], count.get(fruits[left]) - 1);
                if (count.get(fruits[left]) == 0) {
                    count.remove(fruits[left]);
                }
                left++;
            }

            // Update the maximum number of fruits we can collect
            // right - left + 1 = window size
            maxFruits = Math.max(maxFruits, right - left + 1);
        }

        return maxFruits;
    }
}