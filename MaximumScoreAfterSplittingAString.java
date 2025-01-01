/* https://leetcode.com/problems/maximum-score-after-splitting-a-string/?envType=daily-question&envId=2025-01-01 */
/* 
1422. Maximum Score After Splitting a String
*/

class MaximumScoreAfterSplittingAString {
    public int maxScore(String s) {
        int zeros = 0;
        int ones = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                ones++;
            }
        }
        int maxScore = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            if (c == '0') {
                zeros++;
            } else {
                ones--;
            }
            int currentScore = zeros + ones;
            maxScore = Math.max(maxScore, currentScore);
        }
        return maxScore;
    }
}
