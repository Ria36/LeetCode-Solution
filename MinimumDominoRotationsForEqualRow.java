/* 1007. Minimum Domino Rotations For Equal Row */
/* https://leetcode.com/problems/minimum-domino-rotations-for-equal-row/description/?envType=daily-question&envId=2025-05-03 */

class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        for (int target = 1; target <= 6; target++) {
            int rotations = check(tops, bottoms, target);
            if (rotations != -1)
                return rotations;
        }
        return -1;
    }

    private int check(int[] tops, int[] bottoms, int target) {
        int rotationsTop = 0;
        int rotationsBottom = 0;

        for (int i = 0; i < tops.length; i++) {
            if (tops[i] != target && bottoms[i] != target)
                return -1;

            if (tops[i] != target)
                rotationsTop++;

            if (bottoms[i] != target)
                rotationsBottom++;
        }

        return Math.min(rotationsTop, rotationsBottom);
    }
}
