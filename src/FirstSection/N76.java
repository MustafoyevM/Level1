package FirstSection;

import java.util.Scanner;

public class N76 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int []arr=new int[n1],arr2=new int[n2];
        boolean b=arr[0]==arr2[0]||arr[arr.length-1]==arr2[arr2.length-1];
        System.out.println(b);
    }
}
