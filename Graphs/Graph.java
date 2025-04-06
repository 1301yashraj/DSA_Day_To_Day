package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* USe useMatrix to differentiate b/w graph implementations,
 *  true => Matrix Implementation
 *  false => Adjacency List Implementation
 *  null => Edge list implementation
 */
public class Graph {
    private int[][] matrix; // Adjacency Matrix
    private List<List<Integer>> adjList; // Adjacency List
    private List<int[]> edgeList;
    private int size; // Number of nodes
    private Boolean useMatrix; // Mode flag

    public Graph(int size, Boolean useMatrix) {
        this.size = size;
        this.useMatrix = useMatrix;
        if (useMatrix == null) {
            edgeList = new ArrayList<int[]>();
        } else if (useMatrix) {
            matrix = new int[size][size];
        } else {
            adjList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                adjList.add(new ArrayList<>());
            }
        }
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public List<List<Integer>> getAdjList() {
        return adjList;
    }

    public int getSize() {
        return size;
    }

    public void addEdge(int v1, int v2) {
        if (useMatrix == null) {
            edgeList.add(new int[] { v1, v2 });
        } else if (useMatrix) {
            matrix[v1][v2] = 1;
            matrix[v2][v1] = 1;
        } else {
            adjList.get(v1).add(v2);
            adjList.get(v2).add(v1);
        }
    }

    public void removeEdge(int u, int v) {
        if (useMatrix == null) {
            edgeList.removeIf(edge -> (edge[0] == u && edge[1] == v) || (edge[0] == v && edge[1] == u));
        } else if (useMatrix) {
            matrix[u][v] = 0;
            matrix[v][u] = 0;
        } else {
            adjList.get(u).remove(Integer.valueOf(v));
            adjList.get(v).remove(Integer.valueOf(u));
        }
    }

    public void printGraph() {
        if (useMatrix == null) {
            // System.out.println("Edge List");
            for (int[] col : edgeList) {
                System.out.println(Arrays.toString(col));
            }
        } else if (useMatrix) {
            // System.out.println("Adjacency Matrix");
            for (int[] row : matrix) {
                System.out.println(Arrays.toString(row));
            }
        } else {
            int i = 0;
            // System.out.println("Adjacency List");
            for (List<Integer> row : adjList) {
                ;
                System.out.println(i++ + " -> " + row);
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        Graph g1 = new Graph(5, true); // Adjacency Matrix
        g1.addEdge(0, 1);
        g1.addEdge(0, 4);
        g1.addEdge(1, 2);
        g1.addEdge(1, 3);
        g1.addEdge(1, 4);
        g1.printGraph();

        System.out.println("\nSwitching to Adjacency List...\n");

        Graph g2 = new Graph(5, false); // Adjacency List
        g2.addEdge(0, 1);
        g2.addEdge(0, 4);
        g2.addEdge(1, 2);
        g2.addEdge(1, 3);
        g2.addEdge(1, 4);
        g2.printGraph();

        System.out.println("\nSwitching to Edge List\n");
        Graph g3 = new Graph(5, null); // Adjacency List
        g3.addEdge(0, 1);
        g3.addEdge(0, 4);
        g3.addEdge(1, 2);
        g3.addEdge(1, 3);
        g3.addEdge(1, 4);
        g3.printGraph();
    }
}
