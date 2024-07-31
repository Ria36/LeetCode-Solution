/* https://leetcode.com/problems/filling-bookcase-shelves/?envType=daily-question&envId=2024-07-31 */
/* 1105. Filling Bookcase Shelves */

class FillingBookCaseShelves {
  public int minHeightShelves(int[][] books, int shelfWidth) {
    final int n = books.length;
    int[] dp = new int[n + 1];
    Arrays.fill(dp, Integer.MAX_VALUE);
    dp[0] = 0;
    for (int i = 0; i < books.length; ++i) {
      int sumThickness = 0;
      int maxHeight = 0;
      for (int j = i; j >= 0; --j) {
        final int thickness = books[j][0];
        final int height = books[j][1];
        sumThickness += thickness;
        if (sumThickness > shelfWidth)
          break;
        maxHeight = Math.max(maxHeight, height);
        dp[i + 1] = Math.min(dp[i + 1], dp[j] + maxHeight);
      }
    }
    return dp[n];
  }
}
