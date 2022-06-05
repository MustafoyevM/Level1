package FirstSection;

import java.util.Locale;
import java.util.Scanner;

public class findFirstUniqueCharacter {
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.print(findUniqueCH(a));

    }
    public static char findUniqueCH(String s){
        int []n=new int[256];
        char r=' ';
        char []a=s.toCharArray();
        for (char c:a) {
           n[c-'a']++;
        }
        for (char c:a) {
            if(n[c-'a']==1){
                r=c;
                return c;
            }
        }
        return r;
    }
}
