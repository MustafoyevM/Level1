package FirstSection;

public class N146MaintainMin {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        TreeNode list=SortedArrayToBST(array);

        traverceTree(list);
    }
    public static TreeNode SortedArrayToBST(int []array){
        if(array.length==0)return null;
        return creation(array,0,array.length-1);
    }
    private static void traverceTree(TreeNode node){
        if(node!=null){
            traverceTree(node.left);
            traverceTree(node.right);
            System.out.print(node.a+" ");
        }
    }
    private static TreeNode creation(int []array,int start,int end){
        TreeNode node=new TreeNode(0);
        if(start==end-1){
            node=new TreeNode(array[start]);
            node.right=new TreeNode(array[end]);
        }
        else if(start==end){
            return new TreeNode(array[start]);
        }
        else{
            int mid=(start+end)/2;
            node.a=array[mid];node.right=creation(array,mid+1,end);
            node.left=creation(array,start,mid-1);


        }
        return node;
    }
}

class TreeNode{
   public TreeNode left,right;
    public int a=0;
    public TreeNode(){

    }
    public TreeNode(int a){
        this.a=a;
        right=left=null;
    }
}
