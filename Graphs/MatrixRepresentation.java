package Graphs;

public class MatrixRepresentation {
    public static void main(String[] args) {
        // creating a graph

        Graph graph = new Graph(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        System.out.println("Adjacency Matrix Representation:");
        graph.printGraph();
    }
}

class Graph {
    private int[][] adjMatrix;
    private int size;

    public Graph(int size) {
        this.adjMatrix = new int[size][size];
        this.size = size;
    }

    public void addEdge(int from, int to) {
        // now we can go from fromNode to toNode directly
        // setting both as 1 >> bidriection or undirected graph
        adjMatrix[from][to] = 1;
        adjMatrix[to][from] = 1;
    }

    public void removeEdge(int from, int to) {
        adjMatrix[from][to] = 0;
        adjMatrix[to][from] = 0;
    }

    public void printGraph() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
