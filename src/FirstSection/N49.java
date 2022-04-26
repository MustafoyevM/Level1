package FirstSection;

import java.util.Scanner;

public class N49 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean b=n%2==0;
        if(b) System.out.println(1);
        else System.out.println(0);
    }
}
