/* https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-ii/?envType=daily-question&envId=2024-08-06 */
/* 3016. Minimum Number of Pushes to Type Word II */

class MinimumNumberOfPushesToTypeWordII {
  public int minimumPushes(String word) {
    int ans = 0;
    int[] count = new int[26];
    for (final char c : word.toCharArray())
      ++count[c - 'a'];
    Arrays.sort(count);
    for (int i = 0; i < 26; ++i)
      ans += count[26 - i - 1] * (i / 8 + 1);
    return ans;
  }
}
