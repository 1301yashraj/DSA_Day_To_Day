public class Node {
    int data;
    Node left,right;
    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    @Override
    public String  toString(){
       return "Node { Data : " +this.data + "\n"+
                      "      _____left Child : "+this.left+"\n"+
                      "      _____Right Child : "+this.right+"\n"
                      +"}";
    }
}
