/* https://leetcode.com/problems/find-score-of-an-array-after-marking-all-elements/submissions/1477730567/?envType=daily-question&envId=2024-12-13 */
/* 2593. Find Score of an Array After Marking All Elements */

class FindScoreOfArrayAfterMakingAllElements {
  public long findScore(int[] nums) {
   long ans = 0;
    PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
      @Override
      public int compare(int[] a, int[] b) {
        if (a[0] == b[0]) {
          return Integer.compare(a[1], b[1]);
        }
        return Integer.compare(a[0], b[0]);
      }
    });

    boolean[] seen = new boolean[nums.length];

    for (int i = 0; i < nums.length; i++) {
      pq.offer(new int[] {nums[i], i});
    }

    while (!pq.isEmpty()) {
      int[] current = pq.poll();
      int num = current[0];
      int index = current[1];

      if (seen[index]) {
        continue;
      }

      seen[index] = true;
      if (index > 0) {
        seen[index - 1] = true;
      }
      if (index + 1 < nums.length) {
        seen[index + 1] = true;
      }

      ans += num;
    }

    return ans;
  }
}
