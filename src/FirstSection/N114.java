package FirstSection;

import java.util.Scanner;

public class N114 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int offset=sc.nextInt();
        char[]c=str.toCharArray();
        offset-=1;
        for (int i = 0; i < str.length(); i++) {
            if(offset>=str.length())offset=0;
            c[i]=str.charAt(offset++);
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.print(c[i]);
        }
    }
}
