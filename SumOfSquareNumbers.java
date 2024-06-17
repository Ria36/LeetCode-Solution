/* https://leetcode.com/problems/sum-of-square-numbers/submissions/1291538779/?envType=daily-question&envId=2024-06-17 */
/* 633. Sum of Square Numbers */

class SumOfSquareNumbers {
    public boolean judgeSquareSum(int c) {
        long smallest = 0;
        long largest = (long) Math.sqrt(c);
        while (smallest <= largest) {
            long sumOfSquares = smallest * smallest + largest * largest;
            if (sumOfSquares == c) {
                return true;
            }
            if (sumOfSquares < c) {
                ++smallest;
            } else {
                --largest;
            }
        }
        return false;
    }
}
