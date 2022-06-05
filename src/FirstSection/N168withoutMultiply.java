package FirstSection;

import java.util.Scanner;

public class N168withoutMultiply {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt();
        int c=a;b--;
        while(b>0){
            a+=c;
            b--;
        }
        System.out.println(a);
    }
}
