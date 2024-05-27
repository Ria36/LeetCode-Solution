/* https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/?envType=daily-question&envId=2024-05-27 */
/* 1608. Special Array With X Elements Greater Than or Equal X */

class SpecialArrayWithXElementsGreaterThanOrEqualX {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]>=nums.length)
        return nums.length;
        for (int i = 1; i < nums.length; ++i) {
      final int count = nums.length - i;
      if (nums[i - 1] < count && nums[i] >= count)
        return count;
    }

    return -1;
    }
}
