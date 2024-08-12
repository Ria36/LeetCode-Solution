/* https://leetcode.com/problems/kth-largest-element-in-a-stream/?envType=daily-question&envId=2024-08-12 */
/* 703. Kth Largest Element in a Stream */

class KthLargestElementInAStream {
  public KthLargest(int k, int[] nums) {
    this.k = k;
    for (final int num : nums)
      heapify(num);
  }

  public int add(int val) {
    heapify(val);
    return minHeap.peek();
  }

  private final int k;
  private Queue<Integer> minHeap = new PriorityQueue<>();

  private void heapify(int val) {
    minHeap.offer(val);
    if (minHeap.size() > k)
      minHeap.poll();
  }
}
