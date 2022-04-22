package FirstSection;

import java.util.Scanner;

public class Nth_primeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),prime=5,j;
        boolean b=true;
        int number=2;
        if(n==1) System.out.println(2);
        if(n==2) System.out.println(3);
        while(number!=n && n>2) {
            for (j=3; j < prime; j += 2) {
                if (prime % j == 0) {
                    b = false;

                    break;
                } else b = true;
            }
            if (b) {
                number++;
            }
            prime += 2;
        }
        if(prime!=5)System.out.println(prime-2);
    }
}
