/* https://leetcode.com/problems/average-waiting-time/submissions/1315279562/?envType=daily-question&envId=2024-07-09 */
/* 1701. Average Waiting Time */

class AverageWaitingTime {
    public double averageWaitingTime(int[][] customers) {
    double wait = 0;
    double curr = 0;
    for (int[] c : customers) {
      curr = Math.max(curr, 1.0 * c[0]) + c[1];
      wait += curr - c[0];
    }
    return 1.0 * wait / customers.length;
    }
}

