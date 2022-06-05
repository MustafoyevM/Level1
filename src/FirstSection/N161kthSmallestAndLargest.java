package FirstSection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class N161kthSmallestAndLargest {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        Integer arr[]=new Integer[]{1,4,17,7,25,3,100};
        Arrays.sort(arr);
        System.out.print(arr[k-1]);
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(arr[k-1]);
    }
}
