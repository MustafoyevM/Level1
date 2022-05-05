package FirstSection;

import java.util.Scanner;

public class N63 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        System.out.println(result(a,b));
    }
    public static int result(int a,int b){

        if(a==b)
            return 0;
        if(a%6==b%6)return (a<b)?a:b;
        return (a>b)?a:b;
    }
}
