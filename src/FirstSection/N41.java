package FirstSection;

import java.util.Scanner;

public class N41 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String  a=sc.next();
        char[] c=a.toCharArray();
        for (char d:c) {
            System.out.println((int)d);
        }
    }
}
