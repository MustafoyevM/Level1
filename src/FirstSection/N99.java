package FirstSection;

import java.util.Scanner;

public class N99 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        boolean test=false;
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            if(arr[i]!=arr[i+1])test=true;
            else {
                test=false;break;
            }
        }
        System.out.println(test);
    }
}
