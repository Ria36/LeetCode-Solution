/* https://leetcode.com/problems/separate-black-and-white-balls/?envType=daily-question&envId=2024-10-15 */

class Solution {
  public long minimumSteps(String s) {
    long ans = 0;
    int ones = 0;
    for (final char c : s.toCharArray())
      if (c == '1')
        ++ones;
      else 
        ans += ones;
    return ans;
  }
}
