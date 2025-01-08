import java.util.*;

public class FindPathInGraph {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        boolean[] seen = new boolean[n];

        for (int[] edge: edges) {
            int a = edge[0];
            int b = edge[1];
            graph.computeIfAbsent(a, val -> new ArrayList<>()).add(b);
            graph.computeIfAbsent(b, val -> new ArrayList<>()).add(a);
        }

        return dfs(graph, seen, source, destination);
    }

    private boolean dfs(Map<Integer, List<Integer>> graph, boolean[] seen, int current, int destination) {
        if (current == destination) {
            return true;
        }

        if (!seen[current]) {
            seen[current] = true;
            for (Integer option: graph.get(current)) {
                if(dfs(graph, seen, option, destination)) return true;
            }
        }

        return false;
    }
}   