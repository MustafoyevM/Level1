package FirstSection;

import java.util.Locale;
import java.util.Scanner;

public class N59 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine(),s;
        Scanner insc=new Scanner(a);
        while(insc.hasNext()){
            s=insc.next();
            System.out.print((""+s.charAt(0)).toLowerCase()+s.substring(1,s.length())+" ");
        }
    }
}
