package FirstSection;

import java.util.Scanner;

public class N73 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        boolean b=a[0]==10||a[a.length-1]==10;
        System.out.println(b);
    }
}
