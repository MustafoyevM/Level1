package FirstSection;

public class N129
{
    public static void main(String[] args) {
        int []ar={10,20,10,20,30,40,40,30,50};
        System.out.println(SingleNumber(ar));
    }
    public static int SingleNumber(int[]ar){
        if(ar==null || ar.length==0)return -1;
        int result=0;
        for (int i = 0; i < ar.length; i++) {
            result^=ar[i];
        }
        return result;
    }
}
