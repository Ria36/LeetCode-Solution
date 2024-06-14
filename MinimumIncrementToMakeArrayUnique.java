/* https://leetcode.com/problems/minimum-increment-to-make-array-unique/?envType=daily-question&envId=2024-06-14 */
/* 945. Minimum Increment to Make Array Unique */

class MinimumIncrementToMakeArrayUnique {
    public int minIncrementForUnique(int[] nums) {
    int output = 0;
    int minAvailable = 0;
    Arrays.sort(nums);
    for (final int num : nums) {
      output += Math.max(minAvailable - num, 0);
      minAvailable = Math.max(minAvailable, num) + 1;
    }
    return output;
    }
}
