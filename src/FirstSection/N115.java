package FirstSection;

import java.util.Scanner;

public class N115 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int number=sc.nextInt();

        //todo solution 1
        String s=""+number;
        char[]c=s.toCharArray();
        int i=0,j=s.length()-1;
        boolean b=false;
        while(i<s.length()/2){
            if(c[i++]==c[j--]){
             b=true;
            }
            else if(c[i]!=c[j]){
                b=false;break;
            }
        }
        System.out.println(b);

        //todo solution 2
        System.out.println(is_palindrome(number));
    }
    public static int reverse_nums(int n)
    {
        int reverse=0;
        while(n!=0){
            reverse*=10;
            reverse=n%10;
            n/=10;
        }
        return reverse;
    }
    public static boolean is_palindrome(int n){
        return n==reverse_nums(n);
    }
}
