# Data Structure and Algorithms

---

Data Structures (DS) define how data is stored in memory (RAM), while Algorithms (A) define how we process that data efficiently. The choice of data structures impacts how quickly and efficiently we can access, modify, and manage data, while algorithms determine the best way to process that data to solve problems optimally.

Each data structure has trade-offs, and selecting the right one depends on the specific needs of an application. Common structures like arrays, stacks, queues, linked lists, graphs, and trees are widely used because they provide efficient ways to manage data.

Algorithms, on the other hand, are problem-solving techniques. Some are simple and can be implemented easily, while others are complex and require optimization. They help us solve problems like searching, sorting, pathfinding, and optimization in the most efficient way possible.\*\*

- **Data Structures focus on space efficiency (memory optimization).**
- **Algorithms focus on time efficiency (performance optimization).**

Data structures are often predefined by programming languages, but algorithms are designed and optimized by developers based on the problem at hand. When we talk about **DSA (Data Structures and Algorithms)**, we're referring to the combination of both—choosing the right data structures and designing the most efficient algorithms to build scalable, high-performance applications.

Mastering DSA is crucial because it enables us to write code that is not just correct, but also **fast, efficient, and scalable**—which is essential for real-world applications, from databases to AI systems.

---

# Recurrsion

## 1. **Basic Recursion (5-7 problems)**

- Printing numbers (1 to N, N to 1) ✅
- Printing a name N times ✅
- Sum of first N numbers ✅
- Factorial of N ✅
- Fibonacci series ✅
- Reverse an array using recursion ✅
- Check if a string is a palindrome using recursion✅
- Power function (Calculate a^b recursively) ✅
- GCD using recursion ✅
- Sum of digits of a number ✅
- Binary search using recursion ✅

## 2. **Backtracking & Subset Problems (8-10 problems)**

- Print all subsequences of an array ✅
- Generate all subsets of a string ✅
- Print all permutations of a string/array ✅
- N-Queens problem
- Rat in a Maze
- Sudoku Solver

---

### **Level 1: Subsets and Combinations** (Basic Backtracking)

1. Generate All Subsequences of an Array ✅
2. Generate All Subsets of an Array (Power Set)
   1 and 2 are one and the same All the combinations form a power set.
3. Generate All Permutations of an Array ✅
   easier apporach is to use a spearate consumed boolean array so that we can go on with the loop easily.
   - 3.2 Generate unique permutations ✅
4. Generate All Combinations of k elements from n elements ✅ (AllCombinations.java)

   4.2 ALL Unique Combinations ✅ (AllUniqueKCombinatins.java)

   - If a number appears more than once in the array, we should only generate combinations where its first occurrence is chosen before its later occurrences.
   - If we are using a duplicate number before using its first occurrence, it means that we are forming a combination that should have already been formed when we used its first occurrence.
   - By enforcing this rule, we avoid duplicate combinations.

   **Its like say if you are using the second occurance for the first time you have already made the desired sequnce.**

5. Combination Sum I (TargetSum.java)>> what we have done is kind of step counting but in this we can
   using similar elements multiple time we can DO IT **LATER** EASY 💥
6. Combination Sum II (Unique Subsequences with Duplicates Allowed Once) >> UniqueSum.java ✅

---

### **Level 2: Strings and Arrangements** (Intermediate Backtracking)

7. String Permutations (All possible arrangements of a string's characters) ✅
8. Generate Valid Parentheses (n pairs of `()` in all valid orders) ✅
   **(Ques 8. Good Question >> Trust the process >> make branches on paper than implement its logic)**
9. Word Search (Find a word in a 2D grid, moving in 4 directions) ✅
10. Palindrome Partitioning (Break a string into palindromic substrings)

---

### **Level 3: Sudoku and Graph-Based Backtracking** (Advanced Backtracking)

11. Solve Sudoku (Fill a 9x9 Sudoku board using constraints)
12. N-Queens Problem (Place N queens on an NxN board with no attacks)
13. Rat in a Maze (Find paths in a grid avoiding obstacles) ✅
14. Word Break (Check if a string can be segmented using a dictionary)
15. Knight’s Tour (Find a path where a knight visits all chessboard squares exactly once)

---

### **Level 4: Constraint-Based & Hard Backtracking Problems**

16. M-Coloring Problem (Color a graph with M colors so no adjacent nodes have the same color)
17. Hamiltonian Path and Cycle (Find a path visiting all nodes exactly once in a graph)
18. Subset Sum Problem (Check if a subset with a given sum exists)
19. Kth Permutation Sequence (Find the Kth permutation of numbers 1 to N without generating all permutations)
20. Word Ladder (Transform a word into another by changing one letter at a time, using a dictionary)

## 3. **Divide & Conquer (5-7 problems)**

- Merge Sort
- Quick Sort
- Binary Search using Recursion
- Exponentiation (Power of a number)

## 4. **Recursion on Data Structures (5-7 problems)**

- Reverse a Linked List
- Check if a Linked List is Palindrome
- Height of a Binary Tree
- Inorder, Preorder, Postorder Traversal

## 5. **Dynamic Programming with Recursion (10 problems)**

Dynamic Programming is an optimization technique used to solve by breaking them into subproblems and storing the results of redundant calculations.
**Ways to solve a DP problem**

###### Top-Down Approach (Memoization)

Solves the original problem by recursively solving subproblems and storing results.

Steps:

1. Solve the problem recursively.
2. Store the result of each subproblem.
3. Use stored results when needed instead of recalculating.

---

###### Bottom-Up Approach (Tabulation)

Solves the smallest subproblems first and builds up the solution iteratively.

Steps:

1. Create an array (dp[]) to store results.
2. Start from the base case.
3. Fill the table iteratively instead of using recursion.

---

- Fibonacci (Memoization) ✅
- Climbing Stairs (Ways to reach N) ✅
- Subset Sum Problem ✅ 📌(Hard and confusing)
- Coin Change Problem
- Longest Common Subsequence (LCS)

###### Types of DP Problems

**A. 1D DP Problems**
Problems where we optimize a single value.

- Fibonacci ✅
- Climbing Stairs ✅
- House Robber
- Coin Change

**B. 2D DP Problems**
DP problems that use two variables (index, remaining weight, etc.).

- Knapsack Problem (choosing items with a weight constraint)
- Longest Common Subsequence (LCS)
- Matrix Chain Multiplication

**C. DP on Graphs**
DP can be used in shortest path problems.

- Dijkstra’s Algorithm
- Bellman-Ford Algorithm

**D. DP on Trees**
DP can be used for tree-based problems where subtree results are reused.

- Binary Tree Maximum Path Sum
- Counting Paths in a Tree

---

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
- Detect Cycle in **Directed Graph (DFS & Kahn’s Algorithm)**
- **Bipartite Graph Check (Graph Coloring BFS/DFS)**
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
