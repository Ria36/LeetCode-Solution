/* https://leetcode.com/problems/xor-queries-of-a-subarray/?envType=daily-question&envId=2024-09-13 */
/* 1310. XOR Queries of a Subarray */

class XORQueriesOfASubarray {
  public int[] xorQueries(int[] arr, int[][] queries) {
    int[] ans = new int[queries.length];
    int[] xors = new int[arr.length + 1];
    for (int i = 0; i < arr.length; ++i)
      xors[i + 1] = xors[i] ^ arr[i];
    int i = 0;
    for (int[] query : queries) {
      final int left = query[0];
      final int right = query[1];
      ans[i++] = xors[left] ^ xors[right + 1];
    }
    return ans;
  }
}
