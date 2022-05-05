package FirstSection;

import java.util.Scanner;

public class N72 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        if(a.length()>=3) System.out.println(a.substring(0,3));
        else if(a.length()==1) System.out.println(a.charAt(0)+"##");
        else System.out.println("###");
    }
}
