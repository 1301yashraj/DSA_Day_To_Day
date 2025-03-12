package Graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Conversion {
    // 1. Edge List is Given we will convert it into other 2 formats Matrix and Adj
    // list
    public static void main(String[] args) {
        List<int[]> edgeList = new ArrayList<>();
        edgeList.add(new int[] { 0, 1 });
        edgeList.add(new int[] { 0, 2 });
        edgeList.add(new int[] { 1, 3 });
        edgeList.add(new int[] { 2, 3 });
        edgeList.add(new int[] { 3, 4 });

        int max = 0;
        for (int[] connection : edgeList) {
            int max1 = Math.max(connection[0], connection[1]);
            max = Math.max(max1, max);
        }

        // creating a matrix
        matrixConversion(edgeList, max + 1);

        // creating a adj LIst
        listConversion(edgeList, max + 1);
    }

    private static void matrixConversion(List<int[]> edgeList, int size) {
        System.out.println("EdgeList to Matrix Conversion");
        Graph graph = new Graph(size, true);
        for (int[] connection : edgeList) {
            graph.addEdge(connection[0], connection[1]);
        }
        graph.printGraph();

        matTO2(graph);

    }

    private static void listConversion(List<int[]> edgeList, int size) {
        System.out.println("Edge list to adjcency List COnversion");
        Graph graph = new Graph(size, false);
        for (int[] connection : edgeList) {
            graph.addEdge(connection[0], connection[1]);
        }
        graph.printGraph();

        listTO2(graph);
    }

    private static void matTO2(Graph graph) {
        // mat to adj LIst
        System.out.println("Matrix to Adjacency List Conversion");
        Graph gel = new Graph(graph.getSize(), false);

        int[][] matrix = graph.getMatrix();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                int val = matrix[i][j];
                if (val == 1) {
                    gel.addEdge(i, j);
                }
            }
        }
        gel.printGraph();

        // mat to edg list conversion
        System.out.println("Matrix to Edge List Conversion");
        Graph el = new Graph(graph.getSize(), null);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                int val = matrix[i][j];
                if (val == 1) {
                    el.addEdge(i, j);
                }
            }
        }
        el.printGraph();
    }

    private static void listTO2(Graph graph) {
        // list to mat
        System.out.println("Adj List to Matrix");
        int i = 0;
        Graph matGraph = new Graph(graph.getAdjList().size(), true);
        for (List<Integer> col : graph.getAdjList()) {
            for (int val : col)
                matGraph.addEdge(i, val);
            i++;
        }
        matGraph.printGraph();

        System.out.println("List to Edge List");
        // list to edge
        i = 0;
        Set<String> uniqueEdges = new HashSet<>();
        Graph edgeGraph = new Graph(graph.getAdjList().size(), null);
        for (List<Integer> col : graph.getAdjList()) {
            for (int val : col) {
                int max = Math.max(val, i);
                int min = Math.min(val, i);
                String edge = min + "-" + max;
                if (!uniqueEdges.contains(edge)) {
                    edgeGraph.addEdge(min, max);
                    uniqueEdges.add(edge);
                }
            }
            i++;
        }
        edgeGraph.printGraph();
    }
}
