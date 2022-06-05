package FirstSection;

import java.util.Scanner;

public class N166IntegerToString {
    public static String IntegerToString(int a){
        if(a==0){
            return "0";
        }
        StringBuilder sb=new StringBuilder();
        boolean is_negative=false;
        if(a<0){
            a=-1*a;
            is_negative=true;
        }
        while(a>0){
            sb.append(a%10);
            a/=10;
        }
        if(is_negative){
            sb.append('-');
        }
        sb.reverse();
        return sb.toString();
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print(IntegerToString(a));

    }
}
