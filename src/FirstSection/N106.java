package FirstSection;
import java.util.Arrays;
import java.util.Scanner;

public class N106
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int j=0,temp=arr[0];
        while(j<n-1){
            arr[j]=arr[++j];
        }arr[n-1]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
