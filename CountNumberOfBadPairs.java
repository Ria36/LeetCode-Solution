/* https://leetcode.com/problems/count-number-of-bad-pairs/?envType=daily-question&envId=2025-02-09 */
/* 2364. Count Number of Bad Pairs */

class CountNumberOfBadPairs {
  public long countBadPairs(int[] nums) {
    long ans = 0;
    Map<Integer, Long> count = new HashMap<>();
    for (int i = 0; i < nums.length; ++i) {   
      ans += i - count.getOrDefault(nums[i] - i, 0L);
      count.merge(nums[i] - i, 1L, Long::sum);
    }
    return ans;
  }
}
