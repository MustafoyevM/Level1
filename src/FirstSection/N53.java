package FirstSection;

import java.util.Scanner;

public class N53 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        boolean g=(a<=b && b<c);
        System.out.println(g);
    }
}
