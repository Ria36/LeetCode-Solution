/* https://leetcode.com/problems/longest-palindrome/description/?envType=daily-question&envId=2024-06-04 */
/* Longest Palindrome */

class LongestPalindrome {
    public int longestPalindrome(String s) {
    int ans = 0;
    int[] count = new int[128];

    for (final char c : s.toCharArray())
      ++count[c];

    for (final int freq : count)
      ans += freq % 2 == 0 ? freq : freq - 1;

    final boolean hasOddCount = Arrays.stream(count).anyMatch(freq -> freq % 2 == 1);
    return ans + (hasOddCount ? 1 : 0);
    }
}
