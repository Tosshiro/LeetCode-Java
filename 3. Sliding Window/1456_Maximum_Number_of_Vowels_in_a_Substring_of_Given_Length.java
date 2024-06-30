'''
Description
LeetCode solution to 1456. Maximum Number of Vowels in a Substring of Given Length

Website Link: https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/

@author: JW
'''

class Solution {
    public int maxVowels(String s, int k) {
        int left = 0;
        int counter = 0;
        int answer = 0;
        ArrayList vowels = new ArrayList<>();

        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        for (int right = 0; right < s.length(); right++) {
            // Check if window is always within length k
            if (right - left >= k) {
                // If removing a vowel from window
                if (vowels.contains(s.charAt(left))) {
                    counter--;
                }
                left++;
            }
            // If vowel is added into window
            if (vowels.contains(s.charAt(right))) {
                counter++;
            }

            answer = Math.max(answer, counter);
        }

        return answer;
    }
}