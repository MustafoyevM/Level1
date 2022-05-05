package FirstSection;

import java.util.Scanner;

public class N102 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean b=false;
        int n=sc.nextInt();
        int[]arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b=(arr[i]==10||arr[i]==30);
        }
        System.out.println(b);
    }
}
