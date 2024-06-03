'''
Description
LeetCode solution to 1299. Replace Elements with Greatest Element on Right Side

Website Link: https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/description/

@author: Jw
'''

class Solution {
    public int[] replaceElements(int[] arr) {
        int greatestNum = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = greatestNum;
            greatestNum = Math.max(greatestNum, temp);
        }
        return arr;
    }
}