/* https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/?envType=daily-question&envId=2024-05-02 */
/* 2441. Largest Positive Integer That Exists With Its Negative */

class LargestPositiveIntegerExists {
    public int findMaxK(int[] nums) {
    int ans = -1;
    Set<Integer> seen = new HashSet<>();

    for (final int num : nums)
      if (seen.contains(-num))
        ans = Math.max(ans, Math.abs(num));
      else
        seen.add(num);

    return ans;
    }
}
