/* https://leetcode.com/problems/relative-sort-array/?envType=daily-question&envId=2024-06-11 */
/* 1122. Relative Sort Array */

class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
    int[] ans = new int[arr1.length];
    int[] count = new int[1001];
    int i = 0;

    for (int a : arr1)
      ++count[a];

    for (int a : arr2)
      while (count[a]-- > 0)
        ans[i++] = a;

    for (int num = 0; num < 1001; ++num)
      while (count[num]-- > 0)
        ans[i++] = num;

    return ans;
    }
}
