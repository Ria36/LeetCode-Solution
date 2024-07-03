/* https://leetcode.com/problems/minimum-difference-between-largest-and-smallest-value-in-three-moves/?envType=daily-question&envId=2024-07-03 */
/* 1509. Minimum Difference Between Largest and Smallest Value in Three Moves */

class MinimumDifferenceBetweenLargestAndSmallestValueInThreeMoves {
    public int minDifference(int[] nums) {
    final int n = nums.length;
    if (n < 5)
      return 0;
    int ans = Integer.MAX_VALUE;
    Arrays.sort(nums);
    for (int i = 0; i <= 3; ++i)
      ans = Math.min(ans, nums[n - 4 + i] - nums[i]);
    return ans;
    }
}
