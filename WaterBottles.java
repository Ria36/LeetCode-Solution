/* https://leetcode.com/problems/water-bottles/?envType=daily-question&envId=2024-07-07 */
/* 1518. Water Bottles */

class WaterBottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drunk = numBottles;
        int emptyBottles = numBottles;
        while (emptyBottles >= numExchange) {
            int exchangedBottles = emptyBottles / numExchange;
            drunk += exchangedBottles;
            int unUsedEmptyBottles = emptyBottles % numExchange;
            emptyBottles = exchangedBottles + unUsedEmptyBottles;
        }
        return drunk;
    }
}
