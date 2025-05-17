## Kahns Algorithm

We sort all the nodes, such that the nodes fall in the direction in which they can be traversed
if its possible to do so it means there is a cycle which means its not a Directed Acyclic Graph(DAG).

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
