/* https://leetcode.com/problems/count-the-number-of-fair-pairs/?envType=daily-question&envId=2024-11-13 */
/* 2563. Count the Number of Fair Pairs */

class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
    return countLess(nums, upper) - countLess(nums, lower - 1);
  }

  private long countLess(int[] nums, int sum) {
    long res = 0;
    for (int i = 0, j = nums.length - 1; i < j; ++i) {
      while (i < j && nums[i] + nums[j] > sum)
        --j;
      res += j - i;
    }
    return res;      
    }
}