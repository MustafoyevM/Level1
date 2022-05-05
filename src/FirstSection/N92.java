package FirstSection;

import java.util.Scanner;

public class N92 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),oddn=0,evenn=0;

        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            if(arr[i]%2==0)evenn++;
            else oddn++;
        }
        System.out.println("Number of even elements:"+evenn);
        System.out.println("Number of odd elements:"+oddn);
    }
}
