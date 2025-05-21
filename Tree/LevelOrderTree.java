public class LevelOrderTree {
    /*
     * Given Level Order
     * In order : Left : Root : Right
     * Preorder : root : left: Right
     * Make a Tree out of it
     * Given a tree which is traversed level ordered, now based on the tranversal
     * stored in the array create a tree out of it
     * Baically an array based level order representation is to be converted to
     * Object representation
     *
     * GIven an array we can only make a unique tree based on traversal array only
     * if we have to make a complete tree
     */

    public static void main(String[] args) {
        Integer[] treeList = { 1, 2, 3, 4, 5, 6, 7 };
        Node root = makeLevelOrderNode(0, treeList);
        LevelOrder_traversal.traverse(root);
        System.out.println("----------------------------------------------------");
        Node rootIn = makeInOrderNode(new Integer[] { 4, 2, 5, 1, 6, 3, 7 });
        LevelOrder_traversal.traverse(rootIn);
        System.out.println("----------------------------------------------------");
        Node rootPre = makePreOrderNode(new Integer[] { 1, 2, 4, 5, 3, 6, 7 });
        LevelOrder_traversal.traverse(rootPre);

    }

    // only works when tree is perfect i.e., full and complete
    public static Node makeLevelOrderNode(int i, Integer[] treeList) {
        if (i >= treeList.length || treeList[i] == null)
            return null;
        Node node = new Node(treeList[i]);
        node.left = makeLevelOrderNode(2 * i + 1, treeList);
        node.right = makeLevelOrderNode(2 * i + 2, treeList);
        return node;
    }

    private static Node makeInOrderNode(Integer[] treeList) {
        index = 0;
        // make a empty structure based on the length
        Node root = makeEmptyTree(treeList.length, 0);
        // fill the tree given its in order traversal
        fillInOrder(root, treeList);
        return root;
    }

    private static Node makePreOrderNode(Integer[] treeList) {
        index = 0;
        // make a empty structure based on the length
        Node root = makeEmptyTree(treeList.length, 0);
        // fill the tree given its in order traversal
        fillPreOrder(root, treeList);
        return root;
    }

    private static Node makeEmptyTree(int size, int i) {
        if (i >= size)
            return null;
        Node root = new Node(0);
        root.left = makeEmptyTree(size, 2 * i + 1);
        root.right = makeEmptyTree(size, 2 * i + 2);
        return root;
    }

    static int index = 0;

    private static void fillInOrder(Node node, Integer[] treeList) {
        if (node == null || index >= treeList.length)
            return;

        fillInOrder(node.left, treeList);
        node.data = treeList[index++]; // root (assign data here)
        fillInOrder(node.right, treeList);

    }

    private static void fillPreOrder(Node node, Integer[] treeList) {
        if (node == null || index >= treeList.length)
            return;

        node.data = treeList[index++]; // root (assign data here)
        fillPreOrder(node.left, treeList);
        fillPreOrder(node.right, treeList);
    }
    // similarly for post order we will add data at the last
    // all of these methods will work only when tree is perfect.

}
