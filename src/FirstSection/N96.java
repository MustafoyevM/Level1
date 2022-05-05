package FirstSection;

import java.util.Arrays;
import java.util.Scanner;

public class N96 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextInt();

        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < n; i++) {
            if(a[i]==10)a[i]=20;
        }
        System.out.println(Arrays.toString(a));
    }
}
