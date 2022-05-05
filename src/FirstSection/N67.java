package FirstSection;

import java.util.Scanner;

public class N67 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println(a.substring(0,a.indexOf(" "))+" Tutorial"+a.substring(a.indexOf(" ")));
    }
}
