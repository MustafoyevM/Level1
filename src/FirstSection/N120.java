package FirstSection;

import java.util.Scanner;

public class N120
{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int m=sc.nextInt(),n=sc.nextInt();
        System.out.println("Enter your target");
        int target=sc.nextInt();
        int [][]arr=new int[m][n];
        System.out.println("Eneter in ascending order only");
        for (int i = 0; i <m ; i++)
            for (int j = 0; j < n; j++) {
                arr[i][j]=sc.nextInt();
            }
        System.out.println(solve(arr,target));
    }
    public static boolean  solve(int [][] arr,int target){
        int m= arr.length, n=arr[0].length,lower=0,  higher=m*n-1;
        while (lower < higher) {
            int mid=(lower+higher)>>1;
            if(arr[mid/n][mid%n]==target){
                return true;
            }int val=arr[mid/n][mid&n];
            if(val>target)higher=mid-1;
            else lower=mid+1;
        }
        return false;
    }
}
