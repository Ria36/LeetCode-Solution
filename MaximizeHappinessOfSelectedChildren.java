/* https://leetcode.com/problems/maximize-happiness-of-selected-children/submissions/1253600293/?envType=daily-question&envId=2024-05-09 */
/* 3075. Maximize Happiness of Selected Children */

class MaximizeHappinessOfSelectedChildren {
    public long maximumHappinessSum(int[] happiness, int k) {
    final int n = happiness.length;
    long ans = 0;
    int decremented = 0;
    Arrays.sort(happiness);
    for (int i = n - 1; i >= n - k; --i) {
      ans += Math.max(0, happiness[i] - decremented);
      ++decremented;
    }
    return ans;
    }
}
