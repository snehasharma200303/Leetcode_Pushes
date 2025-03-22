import java.util.*;

class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        for (int[] e : edges) { graph.get(e[0]).add(e[1]); graph.get(e[1]).add(e[0]); }
        
        boolean[] visited = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                Set<Integer> nodes = new HashSet<>();
                dfs(i, graph, visited, nodes);
                if (isComplete(graph, nodes)) count++;
            }
        }
        return count;
    }

    private void dfs(int node, List<List<Integer>> graph, boolean[] visited, Set<Integer> nodes) {
        visited[node] = true;
        nodes.add(node);
        for (int neighbor : graph.get(node)) 
            if (!visited[neighbor]) dfs(neighbor, graph, visited, nodes);
    }

    private boolean isComplete(List<List<Integer>> graph, Set<Integer> nodes) {
        int size = nodes.size();
        for (int node : nodes) 
            if (graph.get(node).size() != size - 1) return false;
        return true;
    }
}
