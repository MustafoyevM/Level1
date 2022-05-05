package FirstSection;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class N84 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        if(a.length()>=3) System.out.println(a.substring(a.length()-3)+a+a.substring(a.length()-3));
    }
}
