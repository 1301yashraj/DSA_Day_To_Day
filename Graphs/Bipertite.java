package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Bipertite {
    /*
     * Problem:
     * You are given an undirected graph represented as an adjacency list or edge
     * list. Determine whether the graph is bipartite.
     *
     * A graph is bipartite if the set of nodes can be divided into two disjoint
     * sets such that no two nodes within the same set are connected by an edge.
     * Equivalently, the graph contains no odd-length cycles.
     */

    public static void main(String[] args) {
        int n = 10;
        int[][] edges = {
                { 0, 1 }, { 1, 2 }, { 2, 3 }, { 3, 0 }, // Cycle of length 4 (even) - bipartite component
                { 4, 5 }, { 5, 6 }, { 6, 4 }, // Cycle of length 3 (odd) - non-bipartite component
                { 7, 8 }, // Disconnected edge (single connection)
                { 8, 9 }, { 9, 7 }, // Cycle of length 3 (odd) in another component
                { 2, 5 } // Connection between two components (cross edge)
        };

        Graph graph = new Graph(n, false);
        for (int[] edge : edges) {
            graph.addEdge(edge[0], edge[1]);
        }
        graph.printGraph();

        boolean ans = isGraphBipertite(graph.getAdjList());
        System.out.println("Is Bipertite " + ans);

        List<List<Integer>> allCycles = new ArrayList<>();
        Set<Integer> recursionStack = new HashSet<>();

        boolean[] visited = new boolean[n];
        int nodeI = 0;
        for (boolean node : visited) {
            if (!node) {
                dfs(nodeI, -1, new ArrayList<>(), allCycles, visited, graph.getAdjList(), recursionStack);
            }
            nodeI++;
        }

        System.out.println(allCycles);
    }

    public static boolean isGraphBipertite(List<List<Integer>> graph) {
        int size = graph.size();
        int[] redBlack = new int[graph.size()];
        Arrays.fill(redBlack, -1);

        for (int i = 0; i < size; i++) {
            if (redBlack[i] == -1) {
                Queue<Integer> q = new LinkedList<>();
                q.offer(i);
                redBlack[i] = 0;
                while (!q.isEmpty()) {
                    int node = q.poll();
                    for (Integer neighbor : graph.get(node)) {
                        if (redBlack[neighbor] == -1) {
                            redBlack[neighbor] = 1 - redBlack[node];
                            q.offer(neighbor);
                        } else if (redBlack[neighbor] == redBlack[node]) {
                            return false;
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.toString(redBlack));
        return true;
    }

    public static void dfs(int node, int parent, List<Integer> path, List<List<Integer>> allCycles,
            boolean[] visited, List<List<Integer>> graph, Set<Integer> stack) {
        visited[node] = true;
        path.add(node);
        stack.add(node);

        for (Integer neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, node, path, allCycles, visited, graph, stack);
            } else if (stack.contains(neighbor) && neighbor != parent) {
                List<Integer> cycle = extractCycle(path, neighbor);
                if (cycle.size() > 2 && cycle.get(0).equals(cycle.get(cycle.size() - 1))) {
                    allCycles.add(cycle);
                }
            }
        }

        stack.remove(node);
        path.remove(path.size() - 1); // backtrack

    }

    public static List<Integer> extractCycle(List<Integer> path, int targetNode) {
        List<Integer> cycle = new ArrayList<>();

        // Traverse path from the back until we hit the targetNode
        for (int i = path.size() - 1; i >= 0; i--) {
            cycle.add(path.get(i));
            if (path.get(i) == targetNode)
                break;
        }

        // Optional: Reverse to make the cycle start from targetNode
        Collections.reverse(cycle);
        System.out.println(cycle);
        return cycle;
    }

}
