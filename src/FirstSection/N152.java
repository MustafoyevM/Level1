package FirstSection;

import java.util.Scanner;

public class N152 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
        System.out.println(a==b && b==c && c==d);
    }
}
