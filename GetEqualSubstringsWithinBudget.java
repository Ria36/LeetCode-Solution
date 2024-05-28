/* https://leetcode.com/problems/get-equal-substrings-within-budget/?envType=daily-question&envId=2024-05-28 */
/* 1208. Get Equal Substrings Within Budget */

class GetEqualSubstringsWithinBudget {
    public int equalSubstring(String s, String t, int maxCost) {
    int j = 0;
    for (int i = 0; i < s.length(); ++i) {
      maxCost -= Math.abs(s.charAt(i) - t.charAt(i));
      if (maxCost < 0)
        maxCost += Math.abs(s.charAt(j) - t.charAt(j++));
    }

    return s.length() - j;
    }
}
