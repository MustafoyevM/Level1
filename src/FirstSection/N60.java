package FirstSection;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class N60 {
    public static void main(String[] args) {
        //todo Solution 1
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
        String []word=line.split("[ ]+");
        System.out.println("Penultimate word: "+word[word.length-2]);



        //todo Solution 2
//        String a= sc.nextLine(),s;
//        int i=0,count=0;
//        Scanner in=new Scanner(a);
//        String []arr=new String[100];
//        while(in.hasNext()){
//            arr[i++]= in.next();
//            count++;
//        }
//        System.out.println(arr[count-2]);
    }
}
