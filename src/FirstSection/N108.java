package FirstSection;

import java.util.Scanner;

public class N108 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),sum=0;
        String s=""+a;
        for (int i = 0; i < s.length(); i++) {
            if(a>0){
                sum+=a%10;
                a/=10;
            }
        }
        System.out.println(sum);
    }
}
