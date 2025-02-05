/* https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/description/?envType=daily-question&envId=2025-02-05 */
/* 1790. Check if One String Swap Can Make Strings Equal */

class Solution {
  public boolean areAlmostEqual(String s1, String s2) {
    List<Integer> diffIndices = new ArrayList<>();

    for (int i = 0; i < s1.length(); ++i)
      if (s1.charAt(i) != s2.charAt(i))
        diffIndices.add(i);

    return diffIndices.isEmpty() ||
        (diffIndices.size() == 2 &&
         s1.charAt(diffIndices.get(0)) == s2.charAt(diffIndices.get(1)) &&
         s1.charAt(diffIndices.get(1)) == s2.charAt(diffIndices.get(0)));
  }
}
