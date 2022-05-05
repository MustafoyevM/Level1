package FirstSection;

import java.util.Arrays;
import java.util.Scanner;

public class N113
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),n2=sc.nextInt();
        int []ar=new int[n],arr=new int[n2],ary=new int[n+n2];
        for (int i = 0; i < n; i++) {
            ar[i]=sc.nextInt();
            ary[i]=ar[i];
        }
        System.out.println(Arrays.toString(ar));
        for (int i = 0; i < n2; i++) {
            arr[i]=sc.nextInt();
            ary[i+n]=arr[i];
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(ary));
        int temp=ary[0];
        for (int i = 0; i <n+n2 ; i++) {
            for (int j = i+1; j <n+n2 ; j++) {
                if(ary[i]>ary[j]){
                    temp=ary[i];
                    ary[i]=ary[j];
                    ary[j]=temp;
                }

            }
        }System.out.println(Arrays.toString(ary));

    }
}
