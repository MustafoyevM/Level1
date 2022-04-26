package FirstSection;

import java.util.Scanner;

public class N54 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        boolean g=((a%10==b%10) || (b%10==c%10) || c%10==a%10);
        System.out.println(g);
    }
}
