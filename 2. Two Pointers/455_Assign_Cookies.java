'''
Description
LeetCode solution to 455. Assign Cookies

Website Link: https://leetcode.com/problems/assign-cookies/description/

@author: Jw
'''

import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // Sorting and 2 pointer
        Arrays.sort(g);
        Arrays.sort(s);
        int p1 = 0;
        int p2 = 0;
        while (p1 < g.length && p2 < s.length) {
            // Shift to next child if cookie satisfies child
            if (s[p2] >= g[p1])     p1++;
            // Shift to next cookie
            p2++;
        }
        return p1;
    }
}