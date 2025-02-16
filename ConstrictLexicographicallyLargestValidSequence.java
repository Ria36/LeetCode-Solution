/* https://leetcode.com/problems/construct-the-lexicographically-largest-valid-sequence/submissions/1545254608/?envType=daily-question&envId=2025-02-16 */
/* 1718. Construct the Lexicographically Largest Valid Sequence */

class ConstrictLexicographicallyLargestValidSequence {
  public int[] constructDistancedSequence(int n) {
    int[] ans = new int[2 * n - 1];
    dfs(n, 0, 0, ans);
    return ans;
  }

  private boolean dfs(int n, int i, int mask, int[] ans) {
    if (i == ans.length)
      return true;
    if (ans[i] > 0)
      return dfs(n, i + 1, mask, ans);

    for (int num = n; num >= 1; --num) {
      if ((mask >> num & 1) == 1)
        continue;
      if (num == 1) {
        ans[i] = num;
        if (dfs(n, i + 1, mask | 1 << num, ans))
          return true;
        ans[i] = 0;
      } else { 
        if (i + num >= ans.length || ans[i + num] > 0)
          continue;
        ans[i] = num;
        ans[i + num] = num;
        if (dfs(n, i + 1, mask | 1 << num, ans))
          return true;
        ans[i + num] = 0;
        ans[i] = 0;
      }
    }

    return false;
  }
}
