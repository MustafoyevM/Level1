package FirstSection;

import java.util.Scanner;

public class N64 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        System.out.println(result(a,b));
    }
    public static boolean result(int a,int b)
    {
        if(25<a || b>75) return false;
        int x=a%10,y=b%10;
        a/=10;
        b/=10;
        return (a==b || x==y || a==y || b==x);
    }
}
