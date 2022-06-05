package FirstSection;

public class N128 {


    public static void main(String[] args) {
        int [] a={10,2,38,23,38,23,21};
        System.out.println(solve(a));
    }
    public static int solve(int[] ar)
    {
        int median=0;
        if(ar.length%2==0){
            median=(ar[ar.length/2]+ar[ar.length/2-1])/2;
        }
        else median=ar[ar.length/2];
        return median;
    }
}
