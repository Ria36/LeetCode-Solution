/* https://leetcode.com/problems/domino-and-tromino-tiling/description/?envType=daily-question&envId=2025-05-05 */
/* 790. Domino and Tromino Tiling */


class Solution {
    public int numTilings(int n) {
        if (n <= 2) {
            return n;
        }
        long[] dp = new long[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        long mod = 1000000007;
        for (int i = 3; i <= n; i++) {
            dp[i] = (2 * dp[i - 1] % mod + dp[i - 3] % mod) % mod;
        }
        return (int) dp[n];
    }
}
