/* https://leetcode.com/problems/the-number-of-the-smallest-unoccupied-chair/description/?envType=daily-question&envId=2024-10-11 */
/* 1942. The Number of the Smallest Unoccupied Chair */

class TheNumberOfTheSmallestUnoccupiedChair {
  public int smallestChair(int[][] times, int targetFriend) {
    int nextUnsatChair = 0;
    PriorityQueue<Integer> emptyChairs = new PriorityQueue<>();
    PriorityQueue<Pair<Integer, Integer>> occupied =
        new PriorityQueue<>(Comparator.comparing(Pair::getKey));
    for (int i = 0; i < times.length; ++i) {
      int[] time = times[i];
      time = Arrays.copyOf(time, time.length + 1);
      time[time.length - 1] = i;
      times[i] = time;
    }
    Arrays.sort(times, (a, b) -> Integer.compare(a[0], b[0]));
    for (int[] time : times) {
      final int arrival = time[0];
      final int leaving = time[1];
      final int i = time[2];
      while (!occupied.isEmpty() && occupied.peek().getKey() <= arrival)
        emptyChairs.add(occupied.poll().getValue());
      if (i == targetFriend)
        return emptyChairs.isEmpty() ? nextUnsatChair : emptyChairs.peek();
      if (emptyChairs.isEmpty())
        occupied.add(new Pair<>(leaving, nextUnsatChair++));
      else
        occupied.add(new Pair<>(leaving, emptyChairs.poll()));
    }
    throw new IllegalArgumentException();
  }
}
