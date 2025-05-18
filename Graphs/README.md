# Graphs

A collection of `nodes(vertices)` connected to one another through `edges(lines b/w vertices ie. Connections).`
Unlike a tree which is hirerchical , a graph can for cycles and multiple connections between nodes.

### Key Terminology

1. Nodes : The very fundamental unit of graph usually a data point about which we are talking.
2. Edges : Connections b/w the data points.</br>
   <pre> The connection can be (uni-directional, bi-directional) , (weighted, non-weighted)
   which can lead various kinds of graphs.</pre>
3. Degree : The number of edges connected to a node.
4. Path : A sequence of Nodes connecting two nodes via edges.
5. Strongly Connected Graph (Directed Graphs) – Every node is reachable from every other node following the direction of edges.
6. Sparse vs. Dense Graphs – A sparse graph has very few edges compared to the number of nodes, while a dense graph has many edges.

---

## Ways of Representing a graph

**1. Adjacency Matrix :** An adjacency matrix is a 2D array (NxN) where graph[i][j] stores whether there is an edge from node i to node j.

- For undirected graph the matrix is symmetric.
- Space Complexity : O(n^2)

```css
   0  1  2  3
0  0  1  1  0
1  0  0  1  0
2  0  0  0  1
3  0  0  0  0

```

Here, graph[0][1] = 1 means there is an edge from 0 to 1.

---

**2. Adjacenecy List :** An adjacency list stores the graph as a list of lists (or hashmaps). Each node has a list of nodes it is connected to.

- More space-efficient than an adjacency matrix for sparse graphs.
- Space Complexity : O(n+E)

```css
0 → [1, 2]
1 → [2]
2 → [3]
3 → []
```

Node 0 connects to 1 and 2.

---

## **1️. Graph Representation & Traversals (Core Understanding)**

- **Understanding Graphs** – What they are and how they differ from trees ✅
- **Graph Representation and Construction** – Adjacency List vs. Adjacency Matrix ✅
- **Converting Between Representations** – Edge List → Adjacency List → Matrix ✅
- **Building Graphs from Input** – Edge list format, handling weighted/unweighted, directed/undirected
- Implement **Adjacency Matrix & List** ✅
- **DFS & BFS Traversals** ✅
- Flood Fill Algorithm ✅
- **Connected Components (DFS/BFS on an Undirected Graph)** ✅
- **Graph Input Handling (Reading from Input & Creating a Graph)**

**Problems:**

- Read and **process graph input efficiently**.
- **DFS & BFS on a Graph** (Implement and visualize traversal order) ✅
- **Find Connected Components in an Undirected Graph** ✅
- **Flood Fill Algorithm Variation** ✅
- **Finding Distances using BFS**

1. Flood Fill ✅
2. Number of Islands ✅

```
These grid-based problems (Number of Islands, Flood Fill) represent implicit graphs where:
1. Each matrix cell is a graph node
2. Adjacent cells (4-way/8-way) form implicit edges when both contain '1's
3. The value '1' indicates node existence (land), not connections between indices
4. Connections exist only between physically adjacent cells, not between arbitrary positions
5. Standard graph algorithms (DFS/BFS) apply directly to the grid structure
6. No explicit graph representation (adjacency list/matrix) is needed because:
    - Neighborhood relationships are defined by grid position
    - The matrix itself encodes both nodes and adjacency information

The key insight is that while these problems don't use formal graph data structures, they perfectly embody graph traversal concepts applied to a spatial arrangement of nodes and edges. This implicit graph approach is memory-efficient and leverages the grid's natural structure.
```

3. Max Area of Island ✅
4. Number of Enclaves ✅
5. Surrounded Regions ✅
6. Number of Closed Islands -> added in number of enclaves ✅

Currently for above questions we have used DFS it can also be done using BFS which involves a Queue.

#### Summary

    I have solved most of the Questions using DFS and recursion.
    Also got to now types of Graph implemetation (3 types) and that they can be converted to one another and is just a way to store data in a specific connection oriented way and that some things that may not look like exact graph representation
    but are still graphs all the questions we have done above are of this manner.

    - Patterns Noticed
       1. Start DFS/BFS only from unvisited nodes.
       2. When removing edge-connected land, always begin from the boundary.
       3. Marking cells (grid[i][j] = 0 or 'T') is used to track visited or removed
          land.
       4. DFS works great here because recursion handles the implicit stack for
          traversal.

    - These are graph traversal problems in disguise.
       1. Grid-based problems = Implicit Graphs
          → No need for adjacency lists/matrices — the grid is the graph.
       2. Clear distinction now between explicit graph data structures vs implicit
          spatial structures.

---

## **2️. Graph Connectivity & Cycle Detection**

- Detect Cycle in **Undirected Graph (DFS & Union-Find)** ✅
- Detect Cycle in **Directed Graph (DFS & Kahn’s Algorithm)** [Kahn’s Algorithm](./KAHN.md) ✅
- **Bipartite Graph Check (Graph Coloring BFS/DFS)** ✅
- **Connected Components using BFS/DFS**
- **Redundant Connection (Find extra edge forming a cycle)**
- **Union-Find (Disjoint Set Union - DSU) Fundamentals**
- **Topological Sorting** (For DAGs)

  **Problems:**

7. Number of Provinces
8. Redundant Connection
9. Find the Town Judge
10. Keys and Rooms
11. Is Graph Bipartite?
12. Possible Bipartition
13. Find Eventual Safe States

- **Check if a Directed Graph is a DAG**
- **Find a valid Topological Sort ordering**

#### What I read

---

##### Types of Graph

There are 2 Types of Graphs 1. Directed 2. Undirected
Than we can have 2 sub types 1. Connected and 2. Disconnected
If all the nodes of a undirected graph are connected via some node we call it a Connected Graph , if not than we have disjointed sets/ groups.
If all the nodes are connected in the direction such that we have conncetion U to V and V to U from other nodes or directly we say that is a strongly connected graph
otherwise if it is connected without any direction than it is weakly connected or again it can be disjointed.

##### Connected components of a Undirected graph and Cycles

So if from any node we can cover all of the nodes of a graph the graph is said to be connected.
If, during traversal, you visit a node that’s already visited, and it’s not the node you just came from (i.e., not your parent), then there’s a cycle.

So we can have:

1. A connected graph with no cycles → a tree
2. A connected graph with cycles → a general graph
3. A disconnected graph with multiple components, some cyclic, some not

---

## **3️. Shortest Path Algorithms (Dijkstra, BFS, Bellman-Ford, Floyd-Warshall)**

- **Single-Source Shortest Path (Dijkstra’s Algorithm)**
- **Bellman-Ford Algorithm (Handles Negative Weights)**
- **Floyd-Warshall (All-Pairs Shortest Path)**
- **Multi-Source Shortest Path (0/1 BFS & Modified Dijkstra)**
- **Graph Weight Representation (Adjacency List with Weights)**

**Problems:** 14. 01 Matrix 15. Shortest Path in Binary Matrix 16. Network Delay Time 17. Evaluate Division 18. Find the City With the Smallest Number of Neighbors at a Threshold Distance

- **Find the shortest path in an unweighted graph (BFS-based approach)**
- **Find the shortest path in a weighted graph (Dijkstra’s Algorithm)**
- **Detect negative weight cycles (Bellman-Ford Algorithm)**
- **Find shortest paths between all pairs (Floyd-Warshall Algorithm)**

---

## **4️. Topological Sorting (DAG Processing)**

- **Kahn’s Algorithm (BFS-Based Topological Sort)**
- **DFS-Based Topological Sort**
- **Cycle Detection in a Directed Graph Using Topological Sort**
- **Finding Order in a Dependency Graph**

**Problems:** 19. Course Schedule II 20. Satisfiability of Equality Equations

---

## **5️. Advanced Graph Concepts**

- **Kruskal’s Algorithm (Minimum Spanning Tree - MST)**
- **Prim’s Algorithm (Minimum Spanning Tree - MST)**
- **Bridges & Articulation Points (Tarjan’s Algorithm)**
- **Strongly Connected Components (Kosaraju’s Algorithm)**
- **Eulerian Path & Circuit**
- **Graph Coloring (Minimum Colors for Graph Coloring)**
- **Strongly Connected Components (Kosaraju’s Algorithm)**
  **Problems:**

21. Most Stones Removed with Same Row or Column
22. Time Needed to Inform All Employees
23. As Far from Land as Possible
24. Regions Cut By Slashes
25. Accounts Merge

- **Find the Minimum Spanning Tree (Prim’s Algorithm)**
- **Find the Minimum Spanning Tree (Kruskal’s Algorithm using Union-Find)**
- **Find Strongly Connected Components in a Directed Graph**
- **Find Bridges in a Graph (Critical Edges Detection)**
- **Check if a Graph is Bipartite using Graph Coloring**

---

## **6️. Real-World Graph Applications & Hard Problems**

- **Network Flow Algorithms** – Maximum Flow (Edmonds-Karp Algorithm)
- **Traveling Salesman Problem (TSP) – NP-Hard Problem**
- **Word Ladder Problem (BFS-based Transformation)**
- **Social Network & Recommendation Graphs**

**🔹 Problems to Solve:**

- **Find the maximum flow in a network**
- **Solve the Traveling Salesman Problem using DP + Bitmasking**
- **Solve variations of Word Ladder using BFS**
- **Solve a social network connection problem using Graph Traversals**

---
