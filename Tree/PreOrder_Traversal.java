public class PreOrder_Traversal {

    public static void main(String[] args){
        int[] ar  = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root =  CreateBinary.createTree(ar);
        traverse(root);
    }

    // not displaying leaf with -1 so o/p will be displayed
    // as {1,2,4,5,3,6}
    public static void traverse(Node n){
        if(n==null){
            return ;
         }
        //print data
        System.out.print(" "+n.data);
        //go left
        traverse(n.left);
        //go right
        traverse(n.right);
    }

}


/*
 * Preorder traversal
 *  print
 *  left
 *  right


 * Inorder traversal
 *   left
 *   print
 *   right

 * Post Order traversal
 * left
 * right
 * data
 */