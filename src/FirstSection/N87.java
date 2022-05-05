package FirstSection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class N87 {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        try
        {
            int sum=0;
            String a= br.readLine();
            char[] c=a.toCharArray();
            for (int i = 0; i <a.length() ; i++) {
                sum+=c[i]-'0';
            }
            System.out.println("Orginal Number "+a);


            //todo
            print_number(sum);
        }
        catch(Exception e){
            e.printStackTrace();

        }
    }

    public  static void print_number(int n){
    int x,y,z;
    String []s={"zero","one","two","three","four","five","six","seven","eight","nine"};
        System.out.println("Sum of the digits of the said number:"+ n);
        if(n<10) System.out.println(s[n]);
        else if(n<100){
            x=n/10;
            y=n-10*x;// y=n%10
            System.out.println("In English: "+s[x]+" "+s[y]);
        }
        else{
            x=n/100;
            y=n/10-10*x;
            z=n%10;
            System.out.println("IN English : "+s[x]+" "+s[y]+" "+s[y]);
        }


    }
}
