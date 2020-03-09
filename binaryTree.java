class Node{
    Node left;
    int data;
    Node right;
}

class Tree{
    public Node root;

    public void setRoot(Node node){
        this.root = node;
    }

    public Node getRoot(){
        return root;
    }

    public Node createNode(Node left, int data, Node right){
        Node node = new Node();
        node.data = data;
        node.left = left;
        node.right = right;

        return node;
    }

}