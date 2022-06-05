package FirstSection;

import java.util.Scanner;

public class N169ReverseSentenceWRW {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String value=sc.nextLine();
        System.out.println(value);
      //  value=reverseSentense(value);

        System.out.println(Solution2(value));
    }
    /*
    todo solution 1
    public static String reverseSentense(String a){
        String[] words=a.split(" ");
        String result="";
        for (int i = words.length-1; i >=0 ; i--) {
            result+=words[i]+" ";
        }
        result.trim();
        return result;
    }*/
    public static String Solution2(String s){
        StringBuilder strb=new StringBuilder();
        String []words=s.split(" ");
        for (int i = words.length-1; i >=0 ; i--) {
            strb.append(words[i]);
            if(i!=0){
                strb.append(" ");
            }
        }
        return strb.toString();
    }

}
