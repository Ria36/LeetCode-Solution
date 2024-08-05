/* https://leetcode.com/problems/kth-distinct-string-in-an-array/?envType=daily-question&envId=2024-08-05 */
/* 2053. Kth Distinct String in an Array */

class KthDistinctStringInAnArray {
    public String kthDistinct(String[] arr, int k) {
         Map<String, Integer> count = new HashMap<>();
    for (final String a : arr)
      count.merge(a, 1, Integer::sum);
    for (final String a : arr)
      if (count.get(a) == 1 && --k == 0)
        return a;
    return "";
    }
}
