package FirstSection;

import java.util.Scanner;

public class N38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int letter=0,number=0,space=0,other=0;
        char[]c=s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetter(c[i]))letter++;
            else if(Character.isSpaceChar(c[i]))space++;
            else if(Character.isDigit(c[i]))number++;
            else other++;
        }
        System.out.printf("letter_number=%d numbers=%d  space_number=%d other_chracter=%d",letter,number,space,other);
    }
}
