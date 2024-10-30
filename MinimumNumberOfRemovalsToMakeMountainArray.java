/* https://leetcode.com/problems/minimum-number-of-removals-to-make-mountain-array/?envType=daily-question&envId=2024-10-30 */
/* 1671. Minimum Number of Removals to Make Mountain Array */

class Solution {
  public int minimumMountainRemovals(int[] nums) {
    int[] l = lengthOfLIS(nums);
    int[] r = reversed(lengthOfLIS(reversed(nums)));
    int maxMountainSeq = 0;

    for (int i = 0; i < nums.length; ++i)
      if (l[i] > 1 && r[i] > 1)
        maxMountainSeq = Math.max(maxMountainSeq, l[i] + r[i] - 1);

    return nums.length - maxMountainSeq;
  }
  private int[] lengthOfLIS(int[] nums) {
    List<Integer> tails = new ArrayList<>();
    int[] dp = new int[nums.length];
    for (int i = 0; i < nums.length; ++i) {
      final int num = nums[i];
      if (tails.isEmpty() || num > tails.get(tails.size() - 1))
        tails.add(num);
      else
        tails.set(firstGreaterEqual(tails, num), num);
      dp[i] = tails.size();
    }
    return dp;
  }
  private int firstGreaterEqual(List<Integer> A, int target) {
    final int i = Collections.binarySearch(A, target);
    return i < 0 ? -i - 1 : i;
  }
  private int[] reversed(int[] nums) {
    int[] A = nums.clone();
    int l = 0;
    int r = nums.length - 1;
    while (l < r)
      swap(A, l++, r--);
    return A;
  }
  private void swap(int[] A, int i, int j) {
    final int temp = A[i];
    A[i] = A[j];
    A[j] = temp;
  }
}
