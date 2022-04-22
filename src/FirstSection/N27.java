package FirstSection;

import java.text.DecimalFormat;
import java.util.Scanner;

public class N27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        //todo first solution
//        int x=0,j=0;
//        String a=sc.nextLine();
//        char []c=a.toCharArray();
//        for (int i = a.length()-1; i >=0 ; i--) {
//            x+= (int) (Math.pow(8,i)*(c[j]-48));
//            j++;
//        }
//        System.out.println(Integer.toHexString(x));


        //todo second solution;
        String octal_num=sc.nextLine();

        int decnum=Integer.parseInt(octal_num,8);
        System.out.println(Integer.toHexString(decnum));
    }
}
