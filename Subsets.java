/* https://leetcode.com/problems/subsets/submissions/1264113579/?envType=daily-question&envId=2024-05-21 */
/* 78. Subsets */

class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    dfs(nums, 0, new ArrayList<>(), ans);
    return ans;
  }

  private void dfs(int[] nums, int s, List<Integer> path, List<List<Integer>> ans) {
    ans.add(new ArrayList<>(path));

    for (int i = s; i < nums.length; ++i) {
      path.add(nums[i]);
      dfs(nums, i + 1, path, ans);
      path.remove(path.size() - 1);
    }
    }
}
