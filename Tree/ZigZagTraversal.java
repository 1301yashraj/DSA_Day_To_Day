import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagTraversal {
    public static void main(String[] args) {
        Integer[] ar = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        Node root = LevelOrderTree.makeLevelOrderNode(0, ar);
        List<List<Integer>> zigZagArray = zigZag(root);
        System.out.println(zigZagArray);
    }

    private static List<List<Integer>> zigZag(Node n) {
        List<List<Integer>> zigzagArray = new ArrayList<>();
        boolean leftToRight = true;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(n);
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            List<Integer> levelList = new ArrayList<>();

            for (int i = 0; i < queueSize; i++) {
                Node node = queue.poll();
                levelList.add(node.data);

                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }

            if (!leftToRight)
                Collections.reverse(levelList);
            zigzagArray.add(levelList);

            leftToRight = !leftToRight; // flip direction for next level
        }
        return zigzagArray;
    }
}