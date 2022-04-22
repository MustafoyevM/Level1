package FirstSection;

import java.util.Locale;
import java.util.Scanner;

public class N30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toUpperCase();
        int decimel =hexaToDecamel(s),i=1,j;
        int [] octal_num=new int[100];
        while(decimel!=0){
            octal_num[i++]=decimel%8;
            decimel/=8;
        }
        for ( j = i-1; j >0 ; j--) {
            //todo
            System.out.print(octal_num[j]);
        }


    }
    public static int hexaToDecamel(String s){
        String he="0123456789ABCDEF";
        int decimel=0,index;
        char []c=s.toCharArray();
        for (int i = 0; i <s.length() ; i++) {
            index =he.indexOf(c[i]);
            decimel=decimel*16+index;
        }
        return decimel;
    }
}
