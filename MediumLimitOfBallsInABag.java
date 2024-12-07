/* https://leetcode.com/problems/minimum-limit-of-balls-in-a-bag/?envType=daily-question&envId=2024-12-07 */
/* 1760. Minimum Limit of Balls in a Bag */

class MediumLimitOfBallsInABag {
  public int minimumSize(int[] nums, int maxOperations) {
    int l = 1;
    int r = Arrays.stream(nums).max().getAsInt();

    while (l < r) {
      final int m = (l + r) / 2;
      if (numOperations(nums, m) <= maxOperations)
        r = m;
      else
        l = m + 1;
    }

    return l;
  }

  private int numOperations(int[] nums, int m) {
    int operations = 0;
    for (final int num : nums)
      operations += (num - 1) / m;
    return operations;
  }
}
