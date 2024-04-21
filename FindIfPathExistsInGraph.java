/* https://leetcode.com/problems/find-if-path-exists-in-graph/?envType=daily-question&envId=2024-04-21 */
/* 1971. Find if Path Exists in Graph */

class UnionFind {
  public UnionFind(int n) {
    id = new int[n];
    rank = new int[n];
    for (int i = 0; i < n; ++i)
      id[i] = i;
  }

  public void unionByRank(int u, int v) {
    final int i = find(u);
    final int j = find(v);
    if (i == j)
      return;
    if (rank[i] < rank[j]) {
      id[i] = j;
    } else if (rank[i] > rank[j]) {
      id[j] = i;
    } else {
      id[i] = j;
      ++rank[j];
    }
  }

  public int find(int u) {
    return id[u] == u ? u : (id[u] = find(id[u]));
  }

  private int[] id;
  private int[] rank;
}
class FindIfPathExistsInGraph {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
    UnionFind uf = new UnionFind(n);

    for (int[] edge : edges) {
      final int u = edge[0];
      final int v = edge[1];
      uf.unionByRank(u, v);
    }

    return uf.find(source) == uf.find(destination);
    }
}
