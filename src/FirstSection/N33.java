package FirstSection;

import java.util.Scanner;

public class N33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),sum=0;
        while(a!=0){
            sum+=a%10;
            a/=10;
        }
        System.out.println(sum);
    }
}
