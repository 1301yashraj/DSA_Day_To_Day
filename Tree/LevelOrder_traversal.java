import java.util.*;
public class LevelOrder_traversal {
    public static void main(String[] args){
        int[] ar  = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root =  CreateBinary.createTree(ar);
        traverse(root);
    }
    public static void  traverse(Node n){
        Queue<Node> que = new LinkedList<Node>();
        que.offer(n);
        while(!que.isEmpty())
        {
            int num = que.size();
            for(int i=0; i<num; i++){
                Node node = que.poll();
            System.out.print(node.data+" ");
            if(node.left != null)
                que.offer(node.left);
            if(node.right != null)
                 que.offer(node.right);
            }
            System.out.println();
        }
    }
}
