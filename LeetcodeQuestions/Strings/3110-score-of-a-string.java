
/**
 * 3110. Score of a String
 * https://leetcode.com/problems/score-of-a-string/
 *
 * Problem:
 * The score of a string is the sum of absolute differences between ASCII values
 * of adjacent characters.
 */

class Solution {

    public int scoreOfString(String s) {
        int res = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            res += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return res;
    }
}
