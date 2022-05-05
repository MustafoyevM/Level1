package FirstSection;
import static java.lang.Math.*;
import java.util.Scanner;

public class N109 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

//        int l=0,c=a,j=0;
//        while(l++<a){
//            for (int i = 0; i < l; i++) {
//                if(c<=0)break;
//                System.out.print("$");c--;
//
//            }j++;if(c<=0)break;
//            System.out.println();
//        }
//        System.out.println(j);

        //todo Solution 2
        //for n-number
        double d=(-1+Math.sqrt(1+8*a))/2;

        if(d==(int)d) System.out.println(d);
        else System.out.println((int)d+1);
        System.out.println();//2a=(1+n-number)*n->>n^2+n-2a=0 ->>
        // 1+8a
    }
}
