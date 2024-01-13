/* 1347. Minimum Number of Steps to Make Two Strings Anagram */
/* https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/?envType=daily-question&envId=2024-01-13 */

class MinimumNumberOfStepsToMakeTwoStringsAnagra {
    public int minSteps(String s, String t) {
    int[] count = new int[26];

    for (final char c : s.toCharArray())
      ++count[c - 'a'];

    for (final char c : t.toCharArray())
      --count[c - 'a'];

    return Arrays.stream(count).map(Math::abs).sum() / 2;
    }
}
