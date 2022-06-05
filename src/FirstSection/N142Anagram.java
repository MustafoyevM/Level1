package FirstSection;

import java.util.Scanner;

public class N142Anagram {
    public static boolean Anagram(String s,String s2){
        char[]c=s.toCharArray();
        String x="";
        for (int i = s.length()-1; i>=0; i--) {
            x+=""+c[i];
        }
        return x.equals(s2);

    }

public static boolean AnagarmOtherMethod(String str1,String str2){
        if(str1==null || str2==null)return false;
        else if(str1.length()!=str2.length())return false;
        else if(str1.length()==0 && str2.length()==0)return true;
    int[] count = new int[256];
    for (int i = 0; i < str1.length(); i++) {
        count[str1.charAt(i)]++;
        count[str2.charAt(i)]--;
    }
    for (int num : count) {
        if (num != 0) {
            return false;
        }
    }
    return true;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s2=sc.next();
        System.out.println(Anagram(s,s2));
        System.out.println(AnagarmOtherMethod(s,s2));
    }
}
