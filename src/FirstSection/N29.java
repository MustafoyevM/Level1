package FirstSection;

import java.util.Locale;
import java.util.Scanner;

public class N29
{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //todo first solution
//        String a=sc.nextLine();
//        int hexa=Integer.parseInt(a,16);
//        System.out.println(Integer.toBinaryString(hexa));
        //todo second solution
         String in=sc.nextLine();
         in=in.toUpperCase();
         int decimal=hexatoDecamel(in);
         int bin_num[]=new int[100],i=1,j;
         while(decimal!=0){
             bin_num[i++]=decimal%2;
             decimal/=2;
         }
        for ( j = i-1; j >0 ; j--) {
            System.out.print(bin_num[j]);
        }
    }
    public static int hexatoDecamel(String he){
        String g="0123456789ABCDEF";
        char[]c=he.toCharArray();
        int index,decimal = 0;
        for (int i = 0; i < he.length(); i++) {
            index=g.indexOf(c[i]);
            decimal=decimal*16+index;
        }
        return decimal;
    }
}
