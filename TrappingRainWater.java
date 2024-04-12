/* https://leetcode.com/problems/trapping-rain-water/?envType=daily-question&envId=2024-04-12 */
/* 42. Trapping Rain Water */

class TrappingRainWater {
    public int trap(int[] height) {
        int l = 0, r = height.length - 1, sum = 0,
        leftBar = height[l], rightBar = height[r];
        
        while (l < r) {

            if (leftBar <= rightBar) {
                sum += leftBar - height[l];
                l++;
                leftBar = Math.max(leftBar, height[l]);
            } else {
                sum += rightBar - height[r];
                r--;
                rightBar = Math.max(rightBar, height[r]);
            }

        }

        return sum;
    }
}
