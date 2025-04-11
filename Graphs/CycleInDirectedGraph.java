package Graphs;

public class CycleInDirectedGraph {
    public static void main(String[] args) {
        var n = 4;
        int[][] edges = {
                { 0, 1 },
                { 1, 2 },
                { 2, 3 },
                { 3, 1 } // <- this edge creates a cycle: 1 → 2 → 3 → 1
        };

        DirectedGraph graph = convertToDirected(edges);
        graph.print();

        

    }

    public static DirectedGraph convertToDirected(int[][] edges) {
        DirectedGraph graph = new DirectedGraph();
        for (int[] connection : edges) {
            graph.addEdge(connection[0], connection[1]);
        }
        return graph;
    }
}
