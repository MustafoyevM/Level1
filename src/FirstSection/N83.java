package FirstSection;

import java.util.Arrays;
import java.util.Scanner;

public class N83 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]ar=new int[4],ar2=new int[4];
        for (int i = 0; i <4 ; i++) {
            ar[i]=sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            ar2[i]=sc.nextInt();
            ar2[i]=ar[i]*ar2[i];

        }
        System.out.println(Arrays.toString(ar2));

    }
}
