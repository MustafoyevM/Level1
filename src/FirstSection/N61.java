package FirstSection;

import java.util.Scanner;

public class N61 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        char[] chars=a.toCharArray();
        for (int i = a.length()-1; i >=0 ; i--) {
            System.out.print(chars[i]);
        }
    }
}
