package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KahnsAlgorithm {
    public static void main(String[] args) {
        DirectedGraph graph = new DirectedGraph();
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(3, 6);
        graph.addEdge(4, 5);
        graph.addEdge(6, 5);
        graph.addEdge(6, 2);// this is the cycling node
        graph.print();

        // calculating indegree for all the nodes
        int[] indergee = new int[graph.getAdjList().size()];
        getInDegree(indergee, graph);
        System.out.println("In Degree >> " + Arrays.toString(indergee));

        // using kahn and a kind of sorting
        boolean isDAG = kahnsAlgorithm(indergee, graph, graph.getAdjList().size());
        System.out.println("Is DAG? " + isDAG);
    }

    private static void getInDegree(int[] indergee, DirectedGraph graph) {
        for (int i = 0; i < indergee.length; i++) {
            List<Integer> list = graph.getAdjList().get(i);
            for (int j = 0; j < list.size(); j++) {
                indergee[list.get(j)]++;
            }
        }
    }

    private static boolean kahnsAlgorithm(int[] indegree, DirectedGraph graph, int V) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> topoSort = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            System.out.println("Queue >> " + queue);
            int node = queue.poll();
            topoSort.add(node);

            for (int neighbor : graph.getAdjList().get(node)) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }

        System.out.println("Topological Sort (if DAG): " + topoSort);
        return topoSort.size() == V; // If not all nodes were processed, there was a cycle
    }
}
