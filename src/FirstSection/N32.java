package FirstSection;

import java.util.Scanner;

public class N32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();

        if(a==b)
            System.out.printf("%d==%d\n",a,b);
        if(a!=b)
            System.out.printf("%d!=%d\n",a,b);
        if(a>=b)
            System.out.printf("%d>=%d\n",a,b);
        if(a<=b)
            System.out.printf("%d<=%d\n",a,b);
        if(a>b)
            System.out.printf("%d> %d\n",a,b);
        if(a<b)
            System.out.printf("%d< %d\n",a,b);

    }
}
