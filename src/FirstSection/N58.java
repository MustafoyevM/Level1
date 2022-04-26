package FirstSection;

import java.util.Scanner;

public class N58 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine(),s;
        Scanner insc=new Scanner(a);
        while (insc.hasNext()){
            s= insc.next();
            System.out.print((""+s.charAt(0)).toUpperCase()+s.substring(1,s.length())+" ");
        }
    }
}
