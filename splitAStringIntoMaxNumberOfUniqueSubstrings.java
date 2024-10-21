/* https://leetcode.com/problems/split-a-string-into-the-max-number-of-unique-substrings/?envType=daily-question&envId=2024-10-21 */
/* 1593. Split a String Into the Max Number of Unique Substrings */

class Solution {
  public int maxUniqueSplit(String s) {
    dfs(s, 0, new HashSet<>());
    return ans;
  }
  private int ans = 0;
  private void dfs(final String s, int start, Set<String> seen) {
    if (start == s.length()) {
      ans = Math.max(ans, seen.size());
      return;
    }
    for (int i = start + 1; i <= s.length(); ++i) {
      final String cand = s.substring(start, i);
      if (seen.contains(cand))
        continue;
      seen.add(cand);
      dfs(s, i, seen);
      seen.remove(cand);
    }
  }
}
