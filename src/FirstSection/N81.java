package FirstSection;

import java.util.Scanner;

public class N81 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []a=new int[3];
        for (int i = 0; i < 3; i++) {
            a[i]= sc.nextInt();
        }
        int temp =a[0];
        a[0]=a[a.length-1];
        a[a.length-1]=temp;
    }
}
