/* https://leetcode.com/problems/make-two-arrays-equal-by-reversing-subarrays/?envType=daily-question&envId=2024-08-03 */
/* 1460. Make Two Arrays Equal by Reversing Subarrays */

class MakeTwoArraysEqualByReversingSubarrays {
  public boolean canBeEqual(int[] target, int[] arr) {
    return Arrays.stream(arr)
        .boxed()
        .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()))
        .equals(Arrays.stream(target).boxed().collect(
            Collectors.groupingBy(Integer::intValue, Collectors.counting())));
  }
}
