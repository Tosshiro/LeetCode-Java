'''
Description
LeetCode solution to 1011. Capacity To Ship Packages Within D Days

Website Link: https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/

@author: JW
'''

class Solution {
    // Helper method to find out how many days required if using "mid" capacity, and whether is <= days
    public boolean canShip(int mid, int[] weights, int days) { 
        int ships = 1, currCap = mid;
        for (int weight : weights) {
            if (currCap - weight < 0) {
                ships += 1;
                currCap = mid;
            }
            currCap -= weight;
        }
        return ships <= days;
    }

    public int shipWithinDays(int[] weights, int days) {
        // Lowest bound is the largest weight N (N number of days), 
        // Highest bound is sum of all weights (1 day)
        int lower = 0, upper = 0;
        for (int weight : weights) {
            if (weight > lower) lower = weight;
            upper += weight;
        }
        int res = upper;

        // Binary search between lower and upper bound to find least weight capacity
        while (upper >= lower) {
            int mid = lower + (upper - lower) / 2;
            if (canShip(mid, weights, days)) {
                res = Math.min(res, mid);
                upper = mid - 1;
            } else {
                lower = mid + 1;
            }
        }

        return res;
    }
}