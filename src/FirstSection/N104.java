package FirstSection;

import java.util.Arrays;
import java.util.Scanner;

public class N104
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int count=0;
        for (int i = n-1; i >=0; i--) {
            if(arr[i]==10){
                count=i;
                break;
            }
        }
        int[]arr2=new int[count];
        for (int i = 0; i < count; i++) {
            arr2[i]=arr[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
