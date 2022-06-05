package FirstSection;

import java.util.Scanner;

public class N163NumberOfZeroInBS {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int binaryNumber = 0;
        String s = "";

        while (a > 0) {
            s += a % 2;
            a = a / 2;
        }

        int count = 0;
        char ch[] = s.toCharArray();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (ch[i] == '0') count++;
        }
        System.out.println(count);
    }
}
