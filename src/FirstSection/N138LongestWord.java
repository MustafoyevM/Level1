package FirstSection;

import java.util.ArrayList;

public class N138LongestWord {
    public static ArrayList<String> longestWords(String[] dictionary){
        ArrayList<String > list=new ArrayList<>();

        int longest_length=0;
        int length=dictionary.length;
        for (String str :dictionary) {
            if(longest_length<str.length()){
                longest_length=length;
                list.clear();
            }
            if(longest_length==str.length()){
                list.add(str);
            }
        }
        return list;
    }

    public static String longestword(String [] words){
        if(words==null)return "not exist";
        String a="",b="";
        for (int i = 0; i < words.length; i++) {
            if(b.length()<words[i].length())b=words[i];
        }
        for (int i = 0; i < words.length; i++) {
            if(b.length()==words[i].length())a=a+" " +words[i];
        }
        return a;
    }
    public static void main(String []ar){
        String[] s={
                "cat",
                "dog",
                "red",
                "is",
                "am"
        };
        String[] s2={"cat", "flag", "green", "country", "w3resource"};
        System.out.print(longestword(s));
        System.out.println(longestWords(s));
        System.out.print(  longestWords(s2));
        System.out.println(longestword(s2));
    }
}
