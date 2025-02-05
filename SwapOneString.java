/* https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/description/?envType=daily-question&envId=2025-02-05 */
/* 1790. Check if One String Swap Can Make Strings Equal */

class Solution {
  public boolean areAlmostEqual(String s1, String s2) {
    int first = -1, second = -1, count = 0;
    
    for (int i = 0; i < s1.length(); ++i) {
      if (s1.charAt(i) != s2.charAt(i)) {
        if (++count > 2) return false;
        if (first == -1) first = i;
        else second = i;
      }
    }
    
    return count == 0 || (count == 2 && 
           s1.charAt(first) == s2.charAt(second) && 
           s1.charAt(second) == s2.charAt(first));
  }
}

