package FirstSection;

import java.util.Scanner;

public class N65 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt();
        System.out.println(a-(a/b)*b);
    }
}
