/* https://leetcode.com/problems/subarray-product-less-than-k/submissions/1215299620/?envType=daily-question&envId=2024-03-27 */
/* 713. Subarray Product Less Than K */

class SubArrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
    if (k <= 1)
      return 0;

    int ans = 0;
    int prod = 1;

    for (int l = 0, r = 0; r < nums.length; ++r) {
      prod *= nums[r];
      while (prod >= k)
        prod /= nums[l++];
      ans += r - l + 1;
    }

    return ans;
    }
}
