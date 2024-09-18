/* https://leetcode.com/problems/largest-number/?envType=daily-question&envId=2024-09-18 */
/* 179. Largest Number */

class LargestNumber {
  public String largestNumber(int[] nums) {
    final String s = Arrays.stream(nums)
                         .mapToObj(String::valueOf)
                         .sorted((a, b) -> (b + a).compareTo(a + b))
                         .collect(Collectors.joining(""));
    return s.startsWith("00") ? "0" : s;
  }
}
