/* 494. Target Sum */
/* https://leetcode.com/problems/target-sum/description/?envType=daily-question&envId=2024-12-26 */

class Solution {
  public int findTargetSumWays(int[] nums, int target) {
    final int sum = Arrays.stream(nums).sum();
    if (sum < Math.abs(target) || (sum + target) % 2 == 1)
      return 0;
    return knapsack(nums, (sum + target) / 2);
  }

  private int knapsack(int[] nums, int target) {
    int[] dp = new int[target + 1];
    dp[0] = 1;

    for (int num : nums) {
      for (int j = target; j >= num; --j) {
        dp[j] += dp[j - num];
      }
    }
    return dp[target];
  }
}
