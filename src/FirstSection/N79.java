package FirstSection;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class N79 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[3],temp=0;
        for (int i = 1; i < 3; i++) {
            temp=a[0];
            a[i-1]=a[i];

        }a[a.length-1]=temp;
        System.out.println(Arrays.toString(a));
    }
}
