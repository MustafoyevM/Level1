package FirstSection;

import java.util.Scanner;

public class N98 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),count=0;
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            if(arr[i]==20)count++;
        }boolean test=false;
        if(count==3){
            for (int i = 0; i < n-1; i++) {
            if(arr[i]==20 && arr[i]!=arr[i+1])test=true;
            else if(arr[i]==20 && arr[i]==arr[i+1])
            {
                test=false;break;
            }

            }
        }
        System.out.println(test);
    }
}
