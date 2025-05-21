## 🌲 **Types of Trees**

### 1. **General Tree**

- A tree where a node can have any number of children.
- No restriction on the number of children.
- Example: File system directories (folders can have multiple subfolders/files).

### 2. **Binary Tree**

- A tree where each node can have **at most two children** — usually called the **left child**
  and **right child**.
- Commonly used because it simplifies many tree algorithms.
- Used in many problems and data structures.

### 3. **Binary Search Tree (BST)**

- A special kind of Binary Tree with an **ordering property**:
  - Left subtree contains nodes with values **less than** the parent node.
  - Right subtree contains nodes with values **greater than** the parent node.
- This ordering allows efficient searching, insertion, and deletion — generally in O(log n) time
  (if balanced).
- Useful for implementing dictionaries, sets, and priority data structures.

### 4. **Balanced Trees**

- Trees where the height is kept as small as possible to maintain efficiency.
- Example: AVL Tree, Red-Black Tree.
- Balanced trees ensure operations like insert, delete, search are O(log n).
- In an unbalanced tree, the height can become O(n), making those operations slow.

### 5. **Complete Binary Tree**

- A binary tree in which all levels are completely filled **except possibly the last level**,
  which is filled from left to right.
- Always Filled from left to right.
- Example: A heap data structure (used for priority queues) is a complete binary tree.

### 6. **Full Binary Tree**

- A binary tree where **every node has either 0 or 2 children**.
- No node has only one child.
- This structure often appears in recursive tree problems.

### 7. **Perfect Binary Tree**

- A binary tree where **all internal nodes have two children** and **all leaf nodes are at the
  same level**.
- **It’s both full and complete**.
- Perfect binary trees have exactly $2^{h+1} - 1$ nodes, where h is height.

### 8. **N-ary Tree**

- A tree where each node can have up to **N children** (N > 2).
- Generalization of binary trees.
- Example: Trie (prefix tree) is often a 26-ary tree (for English alphabets).

---

### Why Knowing These Types Matters?

- It helps you **choose the right traversal or algorithm**.
- Some problems explicitly specify the tree type (e.g., "Given a BST, find...").
- Understanding properties (like BST ordering) allows **optimizations**.
- Data structures like heaps, tries, segment trees are special cases of trees.

---
