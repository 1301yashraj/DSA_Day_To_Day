package Graphs;

import java.util.List;

public class CycleDetection {
    public static void main(String[] args) {
        Graph graph = new Graph(4, false);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0); // comment it you will get not cyclic
        graph.addEdge(2, 3);
        graph.printGraph();

        int node = 2; // value
        Integer parent = null;
        boolean[] visited = new boolean[graph.getSize()];
        boolean cycle = isCyclic(node, parent, graph.getAdjList(), visited);
        String res = cycle ? " " : " not ";
        System.out.println("This graph is" + res + "Cyclic");
    }

    public static boolean isCyclic(int node, Integer parent, List<List<Integer>> ls, boolean[] visited) {
        visited[node] = true;

        List<Integer> nodes = ls.get(node);
        for (int newnode : nodes) {
            if (!visited[newnode])
                return isCyclic(newnode, node, ls, visited);
            else {
                if (newnode != parent) {
                    return true;
                }
            }
        }

        return false;
    }

}