/* https://leetcode.com/problems/find-valid-matrix-given-row-and-column-sums/?envType=daily-question&envId=2024-07-20 */
/* 1605. Find Valid Matrix Given Row and Column Sums */

class FindValidMatrixGivenRowAndColumnSums {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
    final int m = rowSum.length;
    final int n = colSum.length;
    int[][] ans = new int[m][n];

    for (int i = 0; i < m; ++i)
      for (int j = 0; j < n; ++j) {
        ans[i][j] = Math.min(rowSum[i], colSum[j]);
        rowSum[i] -= ans[i][j];
        colSum[j] -= ans[i][j];
      }
    return ans;
    }
}
