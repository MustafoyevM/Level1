package FirstSection;

import java.util.Arrays;
import java.util.Scanner;

public class N101 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ctr1=0,ctr2=0;
        int n=sc.nextInt();
        int[]arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < n; i++) {
            if(arr[i]==10){
                ctr1++;
            }else if(arr[i]==20)ctr2++;

        }
        System.out.println(ctr1>ctr2);
    }
}
