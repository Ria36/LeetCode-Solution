/* https://leetcode.com/problems/find-if-array-can-be-sorted/submissions/1444721193/?envType=daily-question&envId=2024-11-06 */
/* 3011. Find if Array Can Be Sorted */

class FindIfArrayCanBeSorted {
    public boolean canSortArray(int[] nums) {
        int prevSetBits = 0;
    int prevMax = Integer.MIN_VALUE; 
    int currMax = Integer.MIN_VALUE; 
    int currMin = Integer.MAX_VALUE; 

    for (final int num : nums) {
      final int setBits = Integer.bitCount(num);
      if (setBits != prevSetBits) {
        if (prevMax > currMin)
          return false;
        prevSetBits = setBits;
        prevMax = currMax;
        currMax = num;
        currMin = num;
      } else { 
        currMax = Math.max(currMax, num);
        currMin = Math.min(currMin, num);
      }
    }

    return prevMax <= currMin;
    }
}
