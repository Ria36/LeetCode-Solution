/* https://leetcode.com/problems/minimum-bit-flips-to-convert-number/submissions/1386808430/?envType=daily-question&envId=2024-09-11 */
/* 2220. Minimum Bit Flips to Convert Number */

class MinimumBitFlipsToConvertNumber {
  public int minBitFlips(int start, int goal) {
    return Integer.bitCount(start ^ goal);
  }
}

