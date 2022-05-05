package FirstSection;

import java.util.Arrays;
import java.util.Scanner;

public class N93 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean found1010=false,found2020=false;
        int arr[]=new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < n; i++) {
            if(arr[i-1]==10 && arr[i]==10)found1010=true;
            if(arr[i-1]==20 && arr[i]==20)found2020=true;
        }
        System.out.println(found1010!=found2020);
    }
}
