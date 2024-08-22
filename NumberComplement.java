/* https://leetcode.com/problems/number-complement/?envType=daily-question&envId=2024-08-22 */
/* 476. Number Complement */

class NumberComplement {
  public int findComplement(int num) {
    for (long i = 1; i <= num; i <<= 1)
      num ^= i;
    return num;
  }
}
