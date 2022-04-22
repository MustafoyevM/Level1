package FirstSection;

import java.util.Scanner;

public class SecondBig_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int temp=0;
        int []ar=new int[5];
        ar[0]= sc.nextInt();
        for (int i = 1; i <5 ; i++) {
            ar[i]= sc.nextInt();
            if(ar[i-1]>ar[i]){temp=ar[i];ar[i]=ar[i-1]; ar[i-1]=temp;}
        }
        System.out.println(ar[4]);
        for (int i = 1; i < 4; i++) {
            if(ar[0]<ar[i])ar[0]=ar[i];
        }
        System.out.println(ar[0]);

    }
}
