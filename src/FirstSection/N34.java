package FirstSection;

import java.util.Scanner;
import static java.lang.Math.*;

public class N34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n=sc.nextInt();
        double area=n*a*a/(4*tan(PI/n));
        System.out.println(area);
    }
}
