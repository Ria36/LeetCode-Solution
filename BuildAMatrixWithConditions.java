/* https://leetcode.com/problems/build-a-matrix-with-conditions/?envType=daily-question&envId=2024-07-21 */
/* 2392. Build a Matrix With Conditions */

class BuildAMatrixWithConditions {
    private int size;
    public int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
        this.size = k;
        List<Integer> rowOrder = getOrder(rowConditions);
        List<Integer> colOrder = getOrder(colConditions);
        if (rowOrder == null || colOrder == null) {
            return new int[0][0];
        }
        int[][] matrix = new int[size][size];
        int[] columnMapping = new int[size + 1];
        for (int i = 0; i < size; ++i) {
            columnMapping[colOrder.get(i)] = i;
        }
        for (int i = 0; i < size; ++i) {
            matrix[i][columnMapping[rowOrder.get(i)]] = rowOrder.get(i);
        }
        return matrix;
    }
    private List<Integer> getOrder(int[][] conditions) {
        // Graph to represent conditions
        List<Integer>[] graph = new List[size + 1];
        // Initialize lists for all vertices in the graph
        Arrays.setAll(graph, element -> new ArrayList<>());
        int[] incomingEdges = new int[size + 1];
        for (var edge : conditions) {
            int from = edge[0], to = edge[1];
            graph[from].add(to);
            ++incomingEdges[to];
        }
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= size; ++i) {
            if (incomingEdges[i] == 0) {
                queue.offer(i);
            }
        }
      
        List<Integer> order = new ArrayList<>();
        while (!queue.isEmpty()) {
            int vertex = queue.pollFirst();
            order.add(vertex);
            for (int neighbour : graph[vertex]) {
                if (--incomingEdges[neighbour] == 0) {
                    queue.offer(neighbour);
                }
            }
        }
        return order.size() == size ? order : null;
    }
}

