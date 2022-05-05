package FirstSection;

import java.util.Scanner;

import static java.lang.Math.log;

public class N110 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 8; i++) {

            // todo solution 1
            int a = sc.nextInt();
            boolean b = (log(a) / log(4) == (int) (log(a) / log(4)));
            System.out.println(b);
            // todo solution 2
            boolean b3 = false;
            String test = Integer.toBinaryString(a);
            b3 = ((a & a - 1) == 0) && ((test.length() - 1) % 2 == 0);
            System.out.println(b3);
        }
    }
}
