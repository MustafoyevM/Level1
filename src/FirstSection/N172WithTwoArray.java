package FirstSection;

import java.util.Arrays;

public class N172WithTwoArray {
    public static int[] SmallerElements(int[]n1,int []n2){
        int length=n2.length;
        int ar[]=new int[length];

        for (int i = 0; i <length ; i++) {
            for (int j = 0; j <n1.length ; j++) {
                if(n2[i]>n1[j]){
                    ar[i]++;
                }
            }
        }
        return ar;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8};
        int[] b={1,4,8};
        System.out.println(Arrays.toString(SmallerElements(a,b)));
    }
}
