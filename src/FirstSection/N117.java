package FirstSection;

import java.util.Scanner;

public class N117
{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println(square_root(a));
        System.out.println(Math.sqrt(a));
        String test = Integer.toBinaryString(a);
        boolean b;
        for (int i = test.length()-2; i >=0 ; i++) {
            if(test.charAt(i)==0)b=true;
            else b=false;
        }
        boolean b3 = ((a & a - 1) == 0) && ((test.length() - 1) % 2 == 0);
        System.out.println(b3);

    }
    public static int square_root(int n) {
        if (n == 0 || n == 1) return n;
        int a = 0;
        int b = n;
        while (a <= b) {
            int mid = (a + b) >> 1;
            if (n / mid < mid) {
                b = mid - 1;
            } else {
                if (n / (mid - 1) <= mid) {
                    return mid;
                }
                a = mid + 1;
            }

        }return b;
    }

}

