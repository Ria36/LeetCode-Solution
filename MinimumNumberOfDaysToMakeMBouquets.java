/* https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/?envType=daily-question&envId=2024-06-19 */
/* 1482. Minimum Number of Days to Make m Bouquets */

class MinimumNumberOfDaysToMakeMBouquets {
    public int minDays(int[] bloomDay, int m, int k) {
    if (bloomDay.length < (long) m * k)
      return -1;
    int l = Arrays.stream(bloomDay).min().getAsInt();
    int r = Arrays.stream(bloomDay).max().getAsInt();
    while (l < r) {
      final int mid = (l + r) / 2;
      if (getBouquetCount(bloomDay, k, mid) >= m)
        r = mid;
      else
        l = mid + 1;
    }
    return l;
  }
  private int getBouquetCount(int[] bloomDay, int k, int waitingDays) {
    int bouquetCount = 0;
    int requiredFlowers = k;
    for (final int day : bloomDay)
      if (day > waitingDays) {
        // Reset `requiredFlowers` since there was not enough adjacent flowers.
        requiredFlowers = k;
      } else if (--requiredFlowers == 0) {
        // Use k adjacent flowers to make a bouquet.
        ++bouquetCount;
        requiredFlowers = k;
      }
    return bouquetCount;
    }
}
