/* https://leetcode.com/problems/maximum-xor-for-each-query/?envType=daily-question&envId=2024-11-08 */
/* 1829. Maximum XOR for Each Query */

class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
    final int n = nums.length;
    final int mx = (1 << maximumBit) - 1;
    int[] ans = new int[n];
    int xors = 0;
    for (int i = 0; i < n; ++i) {
      xors ^= nums[i];
      ans[n - 1 - i] = xors ^ mx;
    }
    return ans;
      
    }
}
