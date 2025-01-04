/* https://leetcode.com/problems/unique-length-3-palindromic-subsequences/submissions/1497291340/?envType=daily-question&envId=2025-01-04 */
/* 1930. Unique Length-3 Palindromic Subsequences */

class UniqueLength3PalindromicSubsequences {
  public int countPalindromicSubsequence(String s) {
    int ans = 0;
    int[] first = new int[26];
    int[] last = new int[26];

    Arrays.fill(first, s.length());

    for (int i = 0; i < s.length(); ++i) {
      final int index = s.charAt(i) - 'a';
      first[index] = Math.min(first[index], i);
      last[index] = i;
    }

    for (int i = 0; i < 26; ++i)
      if (first[i] < last[i])
        ans += s.substring(first[i] + 1, last[i]).chars().distinct().count();

    return ans;
  }
}
