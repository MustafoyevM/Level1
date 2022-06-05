package FirstSection;

import java.util.Scanner;

public class N134 {
    public static int climptoUp(int n){
        int []s_case=new int[n+1];
        if(n<=1)return 1;
        s_case[0]=1;
        s_case[1]=1;
        for (int i = 2; i <=n; i++) {
            s_case[i]=s_case[i-2]+s_case[i-1];

        }
        return s_case[n];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("different climb to top ways:"+climptoUp(n));
    }
}
