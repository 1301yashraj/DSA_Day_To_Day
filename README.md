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

- Fibonacci
- Climbing Stairs
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
