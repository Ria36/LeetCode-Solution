/* https://leetcode.com/problems/minimum-number-of-k-consecutive-bit-flips/?envType=daily-question&envId=2024-06-24 */
/* 995. Minimum Number of K Consecutive Bit Flips */

class OfKConsecutiveBitFlips {
    public int minKBitFlips(int[] nums, int k) {
        int result = 0;
        int flippedTime = 0;
        for(int i =0; i<nums.length;++i){
        if (i >= k && nums[i - k] == 2)
        --flippedTime;
        if (flippedTime % 2 == nums[i]) {
        if (i + k > nums.length)
          return -1;
        ++result;
        ++flippedTime;
        nums[i] = 2;
        }
    }
    return result;
    }
}
