/* 1637. Widest Vertical Area Between Two Points Containing No Points */

class WidestVertical {
    public int maxWidthOfVerticalArea(int[][] points) {
    int ans = 0;
    int[] xs = new int[points.length];

    for (int i = 0; i < points.length; ++i)
      xs[i] = points[i][0];

    Arrays.sort(xs);

    for (int i = 1; i < xs.length; ++i)
      ans = Math.max(ans, xs[i] - xs[i - 1]);

    return ans;
    }
}
