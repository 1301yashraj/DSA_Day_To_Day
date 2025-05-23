## Kahns Algorithm

### Topology

The word topological comes from topology, which is a branch of mathematics that studies the structure or layout of things, ignoring their exact shape or size.
Topological often refers to the relative ordering or arrangement of items based on dependencies.

### Topological Sorting

Imagine you have a list of tasks. Some tasks depend on others (i.e., you must finish task A before task B). This can be represented as a Directed Acyclic Graph (DAG) where:

Each node is a task.

A directed edge from A → B means "A must come before B."

#### 🧩 Topological Sorting:

It’s a linear ordering of the nodes such that for every directed edge u → v, node u appears before node v in the ordering.

### Algorithm

We sort all the nodes(Topologically sort), such that the nodes fall in the direction in which they can be traversed
if its possible to do so it means there is a cycle which means its a Directed Acyclic Graph(DAG).

instead of sorting what we do if we remove the node with zero incomming edges all the time
if at last all nodes are removed it means its a DAG , if not than its not a DAG.

0->1
1->2
2->3
3->4,6
4->5
6->5,2

we remove 0 than we remove 1 and now we cant remove any thus we got its not a DAG
[Kahn's Algorithm](./KahnsAlgorithm.java)

## Bipartite Graph

Bipartiteness is a property of a graph where we can divide the graph in two sets where every edge
goes accross sets and not within set.
To acheive or check this we color the nodes red-blue-red-blue alternatively if 2 red or 2 blues are adacent to each other than we can see that its not bipertite, also its possible to not be
bipertite only when there is a cycle and that to when the cycle is of odd length ie.,
if a graph has an even-length cycle, it's bipartite(I have checked this by making a graph and alternating colors between its nodes).
