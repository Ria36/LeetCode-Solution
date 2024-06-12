/* https://leetcode.com/problems/sort-colors/?envType=daily-question&envId=2024-06-12 */
/* 75. Sort Colors */

class SortColours {
    public void sortColors(int[] nums) {
    int l = 0;               
    int r = nums.length - 1; 

    for (int i = 0; i <= r;)
      if (nums[i] == 0)
        swap(nums, i++, l++);
      else if (nums[i] == 1)
        ++i;
      else
        swap(nums, i, r--);
  }

  private void swap(int[] nums, int i, int j) {
    final int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
    }
}
