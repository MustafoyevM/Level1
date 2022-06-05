package FirstSection;


public class N126 {
    Node1 root;

    public N126() {
        root=null;
    }
    void print_inorder(Node1 node){
        if(node==null)return ;

        print_inorder(node.left);
        System.out.print(node.key+" ");
        print_inorder(node.right);



    }
    void print_inorder(){
        print_inorder(root);
    }

    public static void main(String[] args) {
        N126 tree=new N126();
        tree.root=new Node1(55);
        tree.root.left=new Node1(21);
        tree.root.right=new Node1(80);
        tree.root.left.left=new Node1(9);
        tree.root.left.right=new Node1(29);
        tree.root.right.left=new Node1(76);
        tree.root.right.right=new Node1(91);
        System.out.println();
        tree.print_inorder();
//9 21 29 55 76 80 91
    }
}
class Node1{
    int key;
    Node1 right,left;
    public Node1(){}
    public Node1 (int key){
        this.key=key;
        right=null;left=null;
    }
}