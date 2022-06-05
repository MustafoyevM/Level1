package FirstSection;

public class N130BinaryTree {
    Node4 root;

    public int maxDepth(Node4 node){
        if (node==null)return 0;
//        int left_depth=maxDepth(node.left);
        int right_depth=maxDepth(node.right);
        int g=right_depth;//Math.max(left_depth,right_depth);
        return g=g+1;
    }

    public static void main(String[] args) {
        N130BinaryTree tree=new N130BinaryTree();
        tree.root=new Node4(55);
        tree.root.left=new Node4(21);
        tree.root.right=new Node4(80);
        tree.root.left.left=new Node4(9);
        tree.root.left.right=new Node4(29);
        tree.root.right.left=new Node4(76);
        tree.root.right.right=new Node4(91);
        tree.root.left.left.left=new Node4(100);
        System.out.println("The Maximum depth of the binary tree is: "+tree.maxDepth(tree.root));
    }
}
class Node4{
    int key;
    Node4 left,right;
    public Node4(int item)
    {
        key=item;
        right=null;
        left=null;
    }
}
