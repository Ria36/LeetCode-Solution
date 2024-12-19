/* https://leetcode.com/problems/max-chunks-to-make-sorted/?envType=daily-question&envId=2024-12-19 */
/* 769. Max Chunks To Make Sorted */

class MaxChunksToMakeSorted {
  public int maxChunksToSorted(int[] arr) {
    int ans = 0;
    int mx = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; ++i) {
      mx = Math.max(mx, arr[i]);
      if (mx == i)
        ++ans;
    }
    return ans;
  }
}
