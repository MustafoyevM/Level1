package FirstSection;

import java.util.Arrays;
import java.util.Scanner;

public class N119 {
    public static void main(String []sa){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int target=sc.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }System.out.println(Arrays.toString(arr));
        int temp=arr[0];
        for (int i = 0; i < arr.length; i++)
            for (int j = i+1; j <arr.length ; j++)
                if(arr[i]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
        System.out.println(Arrays.toString(arr));
        System.out.println("Position of "+target+" is "+solve(arr,target));
    }
    public static int solve(int []arr,int target){
        int lower=0,upper=arr.length-1,mid=-1;
        while (lower < upper) {
            mid= (lower+upper)>>1;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target)upper=mid-1;
            else lower=mid+1;

        }
        return mid;
    }
}
