package FirstSection;

import java.util.Scanner;

public class N68 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String fg=a.substring(a.length()-3);
        System.out.println(fg+fg+fg+fg);
    }
}
