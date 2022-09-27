class CreateBinary{
   
     static int  index = -1;
     public static Node createTree(int[] nodeElments){
       index++;
       if(nodeElments[index]==-1)
                        return null;

       Node child = new Node(nodeElments[index]);
       //left
       child.left = createTree(nodeElments);
       //right
       child.right = createTree(nodeElments);
       return child;
     }

     public static void main(String[] args){
        int[] ar  = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = createTree(ar);
        System.out.println(root);
         System.out.println(root.left.left.data); // 4
         System.err.println(root.left.right.data);//5
     }

}