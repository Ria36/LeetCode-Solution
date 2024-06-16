/* https://leetcode.com/problems/patching-array/submissions/1290375382/?envType=daily-question&envId=2024-06-16 */
/* 330. Patching Array */

class PatchingArray {
    public int minPatches(int[] nums, int n) {
    int ans = 0;
    int i = 0;   
    long miss = 1; 
    while (miss <= n)
      if (i < nums.length && nums[i] <= miss) {
        miss += nums[i++];
      } else {
        miss += miss;
        ++ans;
      }
    return ans;
    }
}
