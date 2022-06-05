package FirstSection;

public class N147NumberOfBits {
    public static int bitSwapRequired(int a,int b){
        int ctr=0;
        for(int z = a^b; z !=0 ; z>>>=1) {
            ctr+=z&1;
        }
        return ctr;
    }
    public static void main(String []args){
        System.out.println(bitSwapRequired(27,23));
    }
}
