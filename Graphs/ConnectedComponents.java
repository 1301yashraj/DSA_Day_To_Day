package Graphs;

import java.util.List;

public class ConnectedComponents {
    // there are 2 almost similar kind of things , one is this connected components
    // and other is no. of islands , in this we use a adjacency List reperesentation
    // , but in number of island every cell is a node connected up, down, left,
    // right but remeber its different from a matrix reprenstation of a graph
    public static void main(String[] args) {
        Graph graph = new Graph(6, false);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 5);
        // graph.addEdge(4, 2); //connecting link
        graph.printGraph();

        boolean[] visited = new boolean[6];
        System.out.println("Connected nodes are -----");
        findClusters(graph.getAdjList(), visited);
    }

    static int count = 0;

    private static void findClusters(List<List<Integer>> adjList, boolean[] visited) {
        for (int node = 0; node < adjList.size(); node++) {
            // from this node cover all the connected nodes if not visited
            if (!visited[node]) {
                // perform DSF to go to all the connected nodes
                StringBuilder chain = new StringBuilder();
                dsf(adjList, visited, node, chain);
                System.out.println(chain.deleteCharAt(chain.length() - 1).toString());
                count++;
            }
        }
        System.out.println("Connected components are " + count + " in number");
    }

    private static void dsf(List<List<Integer>> adjList, boolean[] visited, int node,
            StringBuilder ans) {
        if (visited[node]) {
            return;
        }
        visited[node] = true;
        ans.append(node).append("-");
        for (int nodeN : adjList.get(node)) {
            // mark this node as visited
            dsf(adjList, visited, nodeN, ans);
        }
    }
}
