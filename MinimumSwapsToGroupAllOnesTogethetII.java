/* https://leetcode.com/problems/minimum-swaps-to-group-all-1s-together-ii/?envType=daily-question&envId=2024-08-02 */
/* 2134. Minimum Swaps to Group All 1's Together II */

class MinimumSwapsToGroupAllOnesTogethetII {
  public int minSwaps(int[] nums) {
    final int n = nums.length;
    final int k = (int) Arrays.stream(nums).filter(a -> a == 1).count();
    int ones = 0; 
    int maxOnes = 0; 
    for (int i = 0; i < n * 2; ++i) {
      if (i >= k && nums[(i - k) % n] == 1)
        --ones;
      if (nums[i % n] == 1)
        ++ones;
      maxOnes = Math.max(maxOnes, ones);
    }
    return k - maxOnes;
  }
}
