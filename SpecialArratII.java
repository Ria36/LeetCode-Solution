/* https://leetcode.com/problems/special-array-ii/submissions/1474273816/?envType=daily-question&envId=2024-12-09 */
/* 3152. Special Array II */

class SpecialArratII {
  public boolean[] isArraySpecial(int[] nums, int[][] queries) {
    boolean[] ans = new boolean[queries.length];
    int[] pIds = new int[nums.length];
    int id = 0;
    pIds[0] = id;

    for (int i = 1; i < nums.length; ++i) {
      if (nums[i] % 2 == nums[i - 1] % 2)
        ++id;
      pIds[i] = id;
    }

    for (int i = 0; i < queries.length; ++i) {
      final int from = queries[i][0];
      final int to = queries[i][1];
      ans[i] = pIds[from] == pIds[to];
    }
    return ans;
  }
}

