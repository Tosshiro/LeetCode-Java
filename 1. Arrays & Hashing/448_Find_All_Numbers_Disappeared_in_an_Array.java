'''
Description
LeetCode solution to 448. Find All Numbers Disappeared in an Array

Website Link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

@author: Jw
'''

import java.util.HashSet;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        
        // Add all values of the list to a Hashset
        for (int val : nums) {
            numbers.add(val);
        }
        
        ArrayList<Integer> res = new ArrayList<>();

        // Check which number is not present in the Hashset for range[1,n]
        for (int i = 1; i <= nums.length; i++) {
            if (numbers.contains(i) == false) {
                res.add(i);
            }
        }

        return res;
    }
}