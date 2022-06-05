package FirstSection;

import sun.reflect.generics.tree.Tree;

import javax.transaction.TransactionRequiredException;

public class N150BinarytreeSubtreeAnotherBT {

    public static void main(String[]argsd){
        TreeN t=new TreeN(1);
        TreeN t2=new TreeN(2);
        TreeN t3=new TreeN(3);
        t.left=t2;
        t.right=t3;

        TreeN n=new TreeN(1);
        TreeN n1=new TreeN(2);
        TreeN n2=new TreeN(3);
        n.left=n1;
        n.right=n2;
        System.out.print(Sub_tree(t,n));
    }

    public static boolean Sub_tree(TreeN t1,TreeN t2){
        if(t2==null)return true;
        if(t1==null)return false;
        if(is_Same(t1,t2))return true;
        if((is_Same(t1.left,t2))|| is_Same(t1.right,t2))return true;
        return false;
    }

    public static boolean is_Same(TreeN tree1,TreeN tree2){
        if (tree1==null || tree2==null){
            return tree1==tree2;
        }else if(tree1.value!=tree2.value)return false;
        else{
            return (is_Same(tree1.left,tree2.left) && is_Same(tree1.right,tree2.right));
        }
    }
}
class TreeN{
    TreeN right,left;
    int value;
    public TreeN(){

    }
    public TreeN(int a){
        value=a;
        right=left=null;
    }
}
