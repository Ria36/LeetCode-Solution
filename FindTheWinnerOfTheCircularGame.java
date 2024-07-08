/* https://leetcode.com/problems/find-the-winner-of-the-circular-game/submissions/1313913638/?envType=daily-question&envId=2024-07-08 */
/* 1823. Find the Winner of the Circular Game */

class FindTheWinnerOfTheCircularGame {
    public int findTheWinner(int n, int k) {
    boolean[] friends = new boolean[n];
    int friendCount = n;
    int fp = n;
    while (friendCount > 1) {
      for (int i = 0; i < k; ++i, ++fp)
        while (friends[fp % n]) // The friend is not there.
          ++fp;                
      friends[(fp - 1) % n] = true;
      --friendCount;
    }
    for (fp = 0; friends[fp]; ++fp)
      ;
    return fp + 1;
    }
}

