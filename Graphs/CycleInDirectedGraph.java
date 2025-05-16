package Graphs;

import java.util.LinkedList;
import java.util.List;

public class CycleInDirectedGraph {
    public static void main(String[] args) {
        var n = 4;
        int[][] edges = {
                { 0, 1 },
                { 1, 2 },
                { 2, 3 },
                { 3, 4 },
                { 4, 5 }, // ← acyclic component: 3 → 4 → 5
                { 3, 6 },
                { 6, 2 }
        };

        DirectedGraph graph = getDirectedGraph(edges); // gives us a Adjacency List
        graph.print();
        LinkedList<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[7];
        boolean[] path = new boolean[7];
        boolean ans = detectCycle(0, graph, queue, visited);
        boolean ans1 = betterway(0, graph, visited, path);
        System.out.println(ans + " - " + ans1);
    }

    private static boolean betterway(int startNode, DirectedGraph graph, boolean[] visited, boolean[] path) {
        visited[startNode] = true;
        path[startNode] = true;

        for (int nextNode : graph.getAdjList().get(startNode)) {
            if (path[nextNode]) {
                return true;
            } else {
                if (betterway(nextNode, graph, visited, path))
                    return true;
            }
        }
        path[startNode] = false;
        return false;
    }

    // if its ALREADY visited and is int the current queue than its a cycle
    // otherwise it is poosible that it has been already visited from some other
    // path thats not in a cycle
    private static boolean detectCycle(int node, DirectedGraph graph, LinkedList<Integer> stack,
            boolean[] visited) {
        // suppose we start at node zero
        // than we can traverse all the paths that possible until we get a cycle
        stack.push(node);
        List<Integer> pathsToTake = graph.getAdjList().get(node);
        for (int visiting : pathsToTake) {
            // if visiting is already visited and is not a parent and is part of my Queue
            // its a cycle
            if (visited[visiting] && stack.contains(visiting)) {
                return true;
            } else {

                visited[node] = true;
                if (detectCycle(visiting, graph, stack, visited)) {
                    // System.out.println("Got " + stack);
                    return true;
                }
                // System.out.println("Before " + stack);
                stack.pop();
                // System.out.println("After " + stack);
            }

        }
        return false;
    }

    public static DirectedGraph getDirectedGraph(int[][] edges) {
        DirectedGraph graph = new DirectedGraph();
        for (int[] connection : edges) {
            graph.addEdge(connection[0], connection[1]);
        }
        return graph;
    }
}
