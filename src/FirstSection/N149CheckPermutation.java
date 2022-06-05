package FirstSection;

import java.util.Scanner;

public class N149CheckPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.next();
        System.out.print(stringPermutation(a,b));
    }
    public static boolean stringPermutation(String a,String b){
        int [] list=new int[500];
        for (int i = 0; i < a.length(); i++) {
            list[(int)a.charAt(i)]+=1;
        }
        for (int i = 0; i < b.length(); i++) {
            list[(int)a.charAt(i)]-=1;
        }
        for (int i = 0; i <list.length ; i++) {
            if(list[i]!=0)return false;
        }
        return true;
    }
}