public class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return "Node { Data : " + this.data + "\n" +
                "      left Child : " + this.left + "\n" +
                "      Right Child : " + this.right + "\n"
                + "}";
    }
}
