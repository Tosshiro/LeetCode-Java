'''
Description
LeetCode solution to 881. Boats to Save People

Website Link: https://leetcode.com/problems/boats-to-save-people/description/

@author: JW
'''

import java.util.Arrays;

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        // Sorting and two pointer
        Arrays.sort(people);
        int counter = 0;
        int left = 0;
        int right = people.length - 1;
        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                // Both left pointer and right pointer person can take the boat
                left++;
                right--;
            } else {
                // Right pointer person takes a boat alone and shifts to the next lighter person 
                right--;
            }
            counter++;
        }
        return counter;
    }
}