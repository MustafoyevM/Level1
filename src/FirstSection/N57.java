package FirstSection;

import java.util.Scanner;

public class N57 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=1,a=sc.nextInt();
        for (int i = 2; i <=a ; i++) {
            if(a%i==0 && a!=i*i  && a!=i)count+=2;
            else if(i*i==a || a==i) count++;

        }
        System.out.println(count);
    }
}
