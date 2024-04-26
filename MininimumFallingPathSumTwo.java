/* https://leetcode.com/problems/minimum-falling-path-sum-ii/?envType=daily-question&envId=2024-04-26 */
/* 1289. Minimum Falling Path Sum II */

class MininimumFallingPathSumTwo {
    public int minFallingPathSum(int[][] grid) {
        int firstMin = 0; 
        int secondMin = 0;
        int firstMinPos = -1; 
        final int INF = Integer.MAX_VALUE; 
        for (int[] row : grid) {
            int curFirstMin = INF; 
            int curSecondMin = INF; 
            int curFirstMinPos = -1; 
            for (int j = 0; j < row.length; ++j) {
                int sum = (j != firstMinPos ? firstMin : secondMin) + row[j];
                if (sum < curFirstMin) {
                    curSecondMin = curFirstMin; 
                    curFirstMin = sum;         
                    curFirstMinPos = j;      
                } else if (sum < curSecondMin) { 
                    curSecondMin = sum;
                }
            }
            firstMin = curFirstMin;
            secondMin = curSecondMin;
            firstMinPos = curFirstMinPos;
        }
        return firstMin;
    }
}
