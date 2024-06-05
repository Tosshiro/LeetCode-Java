'''
Description
LeetCode solution to 169. Majority Element

Website Link: https://leetcode.com/problems/majority-element/description/

@author: Jw
'''

class Solution {
    public int majorityElement(int[] nums) {
        int fifty_percent = nums.length / 2;
        HashMap<Integer,Integer> counter = new HashMap<>();
        // Key = values in the list, Value = Number of appearance of the element in the list
        for(int num :nums)
        {
            if(counter.containsKey(num)){
                counter.put(num,counter.get(num)+1);
            }
            else{
                counter.put(num,1);
            }
        }

        int ans = 0;
        // Looping through hashmap to see which element appears more the [n/2] times
        for(int key:counter.keySet())
        {
            if(counter.get(key) > fifty_percent)
            {
                ans=key;
            }
        }
        return ans;
    }
}
