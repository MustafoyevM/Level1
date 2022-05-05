package FirstSection;

import java.util.Arrays;
import java.util.Scanner;

public class NH95 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s[]=new String[n];
        for (int i = 0; i <n ; i++) {
            s[i]=String.valueOf(i);
            System.out.println(Arrays.toString(s));
        }
    }
}
