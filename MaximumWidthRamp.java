/* https://leetcode.com/problems/maximum-width-ramp/?envType=daily-question&envId=2024-10-10 */
/* 962. Maximum Width Ramp */

class MaximumWidthRamp {
  public int maxWidthRamp(int[] nums) {
    int ans = 0;
    Deque<Integer> stack = new ArrayDeque<>();
    for (int i = 0; i < nums.length; ++i)
      if (stack.isEmpty() || nums[i] < nums[stack.peek()])
        stack.push(i);
    for (int i = nums.length - 1; i > ans; --i)
      while (!stack.isEmpty() && nums[i] >= nums[stack.peek()])
        ans = Math.max(ans, i - stack.pop());
    return ans;
  }
}
