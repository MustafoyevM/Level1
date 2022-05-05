package FirstSection;

import java.util.Scanner;

public class N77 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt(),n2=sc.nextInt();
        int []ar1=new int[n1],ar2=new int[n2];
        int ar3[]=new int[2];
        for (int i = 0; i < n1; i++) {
            ar1[i]=sc.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            ar2[i]= sc.nextInt();
        }
        ar3[0]=ar1[0];ar3[1]=ar2[ar2.length-1];
        System.out.printf("[%d,%d]",ar3[0],ar3[1]);
    }
}
