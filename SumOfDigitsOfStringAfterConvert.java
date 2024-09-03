/* https://leetcode.com/problems/sum-of-digits-of-string-after-convert/?envType=daily-question&envId=2024-09-03 */
/* 1945. Sum of Digits of String After Convert */

class SumOfDigitsOfStringAfterConvert {
  public int getLucky(String s, int k) {
    int ans = convert(s);
    for (int i = 1; i < k; ++i)
      ans = getDigitSum(ans);
    return ans;
  }

  private int convert(final String s) {
    int sum = 0;
    for (final char c : s.toCharArray()) {
      final int val = c - 'a' + 1;
      sum += val < 10 ? val : (val % 10 + val / 10);
    }
    return sum;
  }

  private int getDigitSum(int num) {
    int digitSum = 0;
    while (num > 0) {
      digitSum += num % 10;
      num /= 10;
    }
    return digitSum;
  }
}
