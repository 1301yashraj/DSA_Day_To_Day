package Graphs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import java.util.Queue;

public class Bfs_N_Dfs {
    public static void main(String[] args) {
        Graph graph = new Graph(5, false); // Adj list
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.printGraph();
        System.out.println("Breadth-First Search - cover all neighbors before going deep");
        System.out.println("--------------------------------------------------------");
        doBFS(0, graph.getAdjList());

        System.out.println("\nDepth-First Search - explore graph as deep as possible before backtracking");
        System.out.println("--------------------------------------------------------");
        doDFS(0, graph.getAdjList());
    }

    private static void doBFS(int start, List<List<Integer>> adjList) {
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : adjList.get(node)) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor); // keep to mark visited true once you have added it to queue
                    // because now its in queue and in line to be printed cant be changed so in a
                    // way you have visited it
                }
            }
        }
    }

    static int[] notVisited = new int[5];

    private static void doDFS(int start, List<List<Integer>> adjList) {
        notVisited[start] = 1; // added here so that also works for the very first node
        System.out.print(start + " ");

        for (int neighbor : adjList.get(start)) {
            if (notVisited[neighbor] == 0) {
                doDFS(neighbor, adjList);
            }
        }
    }
}
