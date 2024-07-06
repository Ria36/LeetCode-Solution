/* https://leetcode.com/problems/pass-the-pillow/?envType=daily-question&envId=2024-07-06 */
/* 2582. Pass the Pillow */

class Solution {
    public int passThePillow(int n, int time) {
    time %= (n - 1) * 2;
    if (time < n)
      return 1 + time;
    return n - (time - (n - 1));
    }
}
