/* https://leetcode.com/problems/three-consecutive-odds/?envType=daily-question&envId=2024-07-01 */
/* 1550. Three Consecutive Odds */

class ThreeConsecutiveOdds {
    public boolean threeConsecutiveOdds(int[] arr) {
    int count = 0;
    for (final int a : arr) {
      count = a % 2 == 1 ? count + 1 : 0;
      if (count == 3)
        return true;
    }
    return false;
    }
}
