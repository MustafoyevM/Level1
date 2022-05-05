package FirstSection;

import java.math.BigInteger;
import java.util.Scanner;

public class N112
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),factorial=1,count=0;
        while(a!=0){
            count+=a/5;
            a/=5;
        }
        System.out.println(count);
    }
}
