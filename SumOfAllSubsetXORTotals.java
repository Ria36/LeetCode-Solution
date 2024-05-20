/* https://leetcode.com/problems/sum-of-all-subset-xor-totals/description/?envType=daily-question&envId=2024-05-20 */
/* 1863. Sum of All Subset XOR Totals */

class SumOfAllSubsetXORTotals {
    public int subsetXORSum(int[] nums) {
        return Arrays.stream(nums).reduce((a, b) -> a | b).getAsInt() << nums.length - 1;
    }
}
