/* https://leetcode.com/problems/check-if-n-and-its-double-exist/submissions/1467635124/?envType=daily-question&envId=2024-12-01 */
/* 1346. Check If N and Its Double Exist */

class Solution {
  public boolean checkIfExist(int[] arr) {
    Set<Integer> seen = new HashSet<>();
    for (final int a : arr) {
      if (seen.contains(a * 2) || a % 2 == 0 && seen.contains(a / 2))
        return true;
      seen.add(a);
    }
    return false;
  }
}
