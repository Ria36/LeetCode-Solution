/* https://leetcode.com/problems/find-center-of-star-graph/?envType=daily-question&envId=2024-06-27 */

/* 1791. Find Center of Star Graph */

class FindCenterOfStartGraph {
    public int findCenter(int[][] edges) {
    return edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1] //
        ? edges[0][0]
        : edges[0][1];
    }
}
