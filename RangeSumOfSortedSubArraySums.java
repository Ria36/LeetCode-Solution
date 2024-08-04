/* https://leetcode.com/problems/range-sum-of-sorted-subarray-sums/?envType=daily-question&envId=2024-08-04 */
/* 1508. Range Sum of Sorted Subarray Sums */

class RangeSumOfSortedSubArraySums {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int totalSubarrays = n * (n + 1) / 2;
        int[] subarraySums = new int[totalSubarrays];
        int index = 0;
        for (int i = 0; i < n; ++i) {
            int currentSum = 0; 
            for (int j = i; j < n; ++j) {
                currentSum += nums[j]; 
                subarraySums[index++] = currentSum; 
            }
        }
        Arrays.sort(subarraySums);   
        int result = 0;
        final int mod = (int) 1e9 + 7; 
        for (int i = left - 1; i < right; ++i) {
            result = (result + subarraySums[i]) % mod;
        }     
        return result; 
    }
}
