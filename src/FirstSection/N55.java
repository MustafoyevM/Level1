package FirstSection;

import java.util.Scanner;

public class N55 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int seconds=sc.nextInt(),sec,min,hours;
        sec=seconds%60;
        seconds=seconds/60;
        min=seconds%60;
        hours=(seconds/60)%24;
        System.out.println(hours+":"+min+":"+sec);
    }
}
