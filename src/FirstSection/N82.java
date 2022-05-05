package FirstSection;

import java.util.Scanner;
import static java.lang.Math.*;
public class N82
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []ar=new int[5];
        for (int i = 0; i <5 ; i++) {
            ar[i]=sc.nextInt();
        }
        System.out.println(max(ar[0],max(ar[ar.length/2],ar[ar.length-1])));
    }
}
