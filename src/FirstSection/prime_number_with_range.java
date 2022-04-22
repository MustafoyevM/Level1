package FirstSection;

import java.util.Scanner;

public class prime_number_with_range {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int range=sc.nextInt();boolean b=true;
        int i=3;
        System.out.print(2+" ");
        for (   ; i <= range; i+=2) {
            for (int j = 2; j < i; j++) {
                if(i%j==0){b=false ;break;}
                else b=true;
            }
            if(b) System.out.print(i+" ");
        }
    }
}
