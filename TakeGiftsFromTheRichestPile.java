/* https://leetcode.com/problems/take-gifts-from-the-richest-pile/submissions/1476997278/?envType=daily-question&envId=2024-12-12 */
/* 2558. Take Gifts From the Richest Pile */

class TakeGiftsFromTheRichestPile {
  public long pickGifts(int[] gifts, int k) {
    long ans = 0;
    Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    for (final int gift : gifts)
      maxHeap.offer(gift);
    for (int i = 0; i < k; ++i) {
      final int squaredMax = (int) Math.sqrt(maxHeap.poll());
      maxHeap.offer(squaredMax);
    }
    while (!maxHeap.isEmpty())
      ans += maxHeap.poll();
    return ans;
  }
}
