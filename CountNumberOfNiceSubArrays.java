/* https://leetcode.com/problems/count-number-of-nice-subarrays/?envType=daily-question&envId=2024-06-22 */
/* 1248. Count Number of Nice Subarrays */

class CountNumberOfNiceSubArrays {
    public int numberOfSubarrays(int[] nums, int k) {
    return numberOfSubarraysAtMost(nums, k) - numberOfSubarraysAtMost(nums, k - 1);
  }
  private int numberOfSubarraysAtMost(int[] nums, int k) {
    int ans = 0;
    for (int l = 0, r = 0; r <= nums.length;)
      if (k >= 0) {
        ans += r - l;
        if (r == nums.length)
          break;
        if (nums[r] % 2 == 1)
          --k;
        ++r;
      } else {
        if (nums[l] % 2 == 1)
          ++k;
        ++l;
      }
    return ans;
    }
}



