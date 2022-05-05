package FirstSection;

import java.util.Scanner;

public class N107 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        boolean b=false;
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 1; i < n-1; i++) {
            if(arr[i]-arr[i-1]==arr[i+1]-arr[i]) b=true;
        }
        System.out.println(b);
    }
}
