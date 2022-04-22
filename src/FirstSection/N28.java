package FirstSection;

import java.util.Locale;
import java.util.Scanner;

public class N28 {
    public static int hexatodecimal(String s){
        String a="0123456789ABCDEF";
        char[]c=s.toCharArray();
        int decamel=0,index;
        for (int i = 0; i <s.length() ; i++) {
            index=a.indexOf(c[i]);
            decamel=16*decamel+index;
        }
        return decamel;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toUpperCase();
        System.out.println(hexatodecimal(s));
    }
}
