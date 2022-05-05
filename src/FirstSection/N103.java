package FirstSection;

import java.util.Arrays;
import java.util.Scanner;

public class N103 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),count=0;
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for (int i = n-1; i >=0; i--) {
            if(arr[i]==10){
                count=i+1;break;
            }
        }
        int arr2[]=new int[n-count];
        for (int i = 0; i < n-count; i++) {
            arr2[i]=arr[i+count];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
