/* https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/?envType=daily-question&envId=2024-06-23 */
/* 1438. Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit */

class LongestContinousSubarrayWithAbsoluteDiff {
    public int longestSubarray(int[] nums, int limit) {
        TreeMap<Integer, Integer> frequencyMap = new TreeMap<>();
        int maxLength = 0; 
        int left = 0; 
        for (int right = 0; right < nums.length; ++right) {
            frequencyMap.put(nums[right], frequencyMap.getOrDefault(nums[right], 0) + 1);
            while (frequencyMap.lastKey() - frequencyMap.firstKey() > limit) {
                frequencyMap.put(nums[left], frequencyMap.get(nums[left]) - 1);
                if (frequencyMap.get(nums[left]) == 0) {
                    frequencyMap.remove(nums[left]);
                }
                ++left;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
