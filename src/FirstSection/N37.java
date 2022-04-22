package FirstSection;

import java.util.Scanner;

public class N37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[]c=s.toCharArray();
        for (int i = s.length()-1; i >=0; i--) {
            System.out.print(c[i]);
        }
    }
}

