package FirstSection;

import java.util.Scanner;

public class N97 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        boolean test=false;
        for (int i = 1; i < n-1; i++) {
            if(a[i-1]==a[i] || a[i]==a[i+1] || (a[i-1]==a[i+1] &&a.length>=3))test=true;
        }
        System.out.println(test);
    }
}
