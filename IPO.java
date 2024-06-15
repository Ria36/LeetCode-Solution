/* https://leetcode.com/problems/ipo/submissions/1289113779/?envType=daily-question&envId=2024-06-15 */
/* 502. IPO */

class T {
  public int pro;
  public int cap;
  public T(int pro, int cap) {
    this.pro = pro;
    this.cap = cap;
  }
}
class IPO {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
    Queue<T> minHeap = new PriorityQueue<>((a, b) -> a.cap - b.cap);
    Queue<T> maxHeap = new PriorityQueue<>((a, b) -> b.pro - a.pro);

    for (int i = 0; i < capital.length; ++i)
      minHeap.offer(new T(profits[i], capital[i]));

    while (k-- > 0) {
      while (!minHeap.isEmpty() && minHeap.peek().cap <= w)
        maxHeap.offer(minHeap.poll());
      if (maxHeap.isEmpty())
        break;
      w += maxHeap.poll().pro;
    }

    return w;
    }
}
