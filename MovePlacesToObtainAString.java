/* https://leetcode.com/problems/move-pieces-to-obtain-a-string/?envType=daily-question&envId=2024-12-05 */
/* 2337. Move Pieces to Obtain a String */

class Solution {
  public boolean canChange(String start, String target) {
    final int n = start.length();
    int i = 0; 
    int j = 0; 

    while (i <= n && j <= n) {
      while (i < n && start.charAt(i) == '_')
        ++i;
      while (j < n && target.charAt(j) == '_')
        ++j;
      if (i == n || j == n)
        return i == n && j == n;
      if (start.charAt(i) != target.charAt(j))
        return false;
      if (start.charAt(i) == 'R' && i > j)
        return false;
      if (start.charAt(i) == 'L' && i < j)
        return false;
      ++i;
      ++j;
    }
    return true;
  }
}
