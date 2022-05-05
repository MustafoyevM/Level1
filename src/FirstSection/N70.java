package FirstSection;

import java.util.Scanner;

public class N70 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine(),b=sc.nextLine();
        if(a.length()> b.length()) System.out.println(b+a+b);
        else System.out.println(a+b+a);
    }
}
