package FirstSection;

import java.util.Scanner;

public class N111 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),
                value=1,exor,and,and1;
        and=a&b;
        exor=a^b;
        and=and<<1;
        value=and|exor;
         while((and&exor)!=0){
             and1=and;
             and=exor&and;
             exor=exor^and1;
             and=and<<1;
             if((and&exor)==0)value=and|exor;

         }
        System.out.println(value);
    }
}
