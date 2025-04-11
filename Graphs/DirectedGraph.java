package Graphs;

import java.util.ArrayList;
import java.util.List;

public class DirectedGraph {
    private List<List<Integer>> adjList = new ArrayList();

    public void addEdge(int u, int v) {
        while (u > adjList.size() - 1) {
            adjList.add(new ArrayList<>());
        }
        adjList.get(u).add(v);
    }

    public List<List<Integer>> getAdjList() {
        return adjList;
    }

    public void print() {
        int i = 0;
        // System.out.println("Adjacency List");
        for (List<Integer> row : adjList) {
            System.out.println(i++ + " -> " + row);
        }
    }

}
