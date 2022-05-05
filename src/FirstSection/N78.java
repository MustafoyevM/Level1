package FirstSection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class N78 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[2];
        System.out.println("Orginal array: "+ Arrays.toString(ar));
        if(ar[0]==4 || ar[0]==7) System.out.println("True");
        else System.out.println(ar[1]==4 || ar[1]==7);
    }
}
