/* https://leetcode.com/problems/rotating-the-box/?envType=daily-question&envId=2024-11-23 */
/* 1861. Rotating the Box */

class Solution {
  public char[][] rotateTheBox(char[][] box) {
    final int m = box.length;
    final int n = box[0].length;
    char[][] ans = new char[n][m];
    Arrays.stream(ans).forEach(A -> Arrays.fill(A, '.'));
    for (int i = 0; i < m; ++i)
      for (int j = n - 1, k = n - 1; j >= 0; --j)
        if (box[i][j] != '.') {
          if (box[i][j] == '*')
            k = j;
          ans[k--][m - i - 1] = box[i][j];
        }
    return ans;
  }
}
