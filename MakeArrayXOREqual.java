/* https://leetcode.com/problems/minimum-number-of-operations-to-make-array-xor-equal-to-k/submissions/1245082848/?envType=daily-question&envId=2024-04-29 */
/* 2997. Minimum Number of Operations to Make Array XOR Equal to K */


class MakeArrayXOREqual {
    public int minOperations(int[] nums, int k) {
    final int xors = Arrays.stream(nums).reduce((a, b) -> a ^ b).getAsInt();
    return Integer.bitCount(k ^ xors);
    }
}
