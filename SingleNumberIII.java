/* https://leetcode.com/problems/single-number-iii/?envType=daily-question&envId=2024-05-31 */
/* 260. Single Number III */

class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
    final int xors = Arrays.stream(nums).reduce((a, b) -> a ^ b).getAsInt();
    final int lowbit = xors & -xors;
    int[] ans = new int[2];
    for (final int num : nums)
      if ((num & lowbit) > 0)
        ans[0] ^= num;
      else
        ans[1] ^= num;
    return ans;
    }
}
