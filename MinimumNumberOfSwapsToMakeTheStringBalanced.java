/* https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/?envType=daily-question&envId=2024-10-08 */
/* 1963. Minimum Number of Swaps to Make the String Balanced */

class Solution {
    public int minSwaps(String s) {
        int unmatched = 0;
    for (final char c : s.toCharArray())
      if (c == '[')
        ++unmatched;
      else if (unmatched > 0) 
        --unmatched;
    return (unmatched + 1) / 2;
    }
}
