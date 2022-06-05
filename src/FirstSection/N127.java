package FirstSection;

public class N127 {
    Node3 root;
    public N127(){
        root=null;
    }
    public static void main(String[] args) {


        N127 tree=new N127();
        tree.root=new Node3(55);
        tree.root.left=new Node3(21);
        tree.root.right=new Node3(80);
        tree.root.left.left=new Node3(9);
        tree.root.left.right=new Node3(29);
        tree.root.right.left=new Node3(76);
        tree.root.right.right=new Node3(91);

        tree.print_postorder();
    }
    void print_postorder(Node3 node)
    {
        if(node==null)return;
        print_postorder(node.left);
        print_postorder(node.right);
        System.out.println(node.key+" ");
    }
    void print_postorder(){
        print_postorder(root);
    }

}

class Node3{
    int key ;
    Node3 right,left;
    public Node3()
    {

    }
    public Node3(int item){
        key=item;
        right=null;
        left=null;
    }
}
