package FirstSection;

import java.util.Scanner;

public class N105 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        boolean a=(arr[0]==arr[arr.length-2] && arr[1]==arr[arr.length-1]);
        System.out.println(a);
    }
}
