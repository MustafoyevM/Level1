package FirstSection;

import javafx.scene.layout.BackgroundImage;

public class BinaryTreeN125
{
    Node root;
    BinaryTreeN125()
    {
        root=null;
    }
    void print_Preorder(Node node)
    {
          if(node==null)return;
        System.out.print(node.key+" ");
        print_Preorder(node.left);
        print_Preorder(node.right);
    }
    void print_Preorder()
    {
        print_Preorder(root);
    }

    public static void main(String[] args)  {
        BinaryTreeN125 tree=new BinaryTreeN125();
        tree.root=new Node(55);
        tree.root.left=new Node(21);
        tree.root.right=new Node(80);
        tree.root.left.left=new Node(9);
        tree.root.left.right=new Node(29);
        tree.root.right.left=new Node(76);
        tree.root.right.right=new Node(91);
        System.out.println("Preorder traversal of binary tree is: ");
        tree.print_Preorder();



    }
}
class Node{
        int key;
        Node right,left;

    public Node(int key) {
        this.key = key;
        right = null;
        left =  null;
    }
}