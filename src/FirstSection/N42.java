package FirstSection;

import java.io.Console;


public class N42 {
    public static void main(String[] args) {
        Console con;
        if((con=System.console())!=null){
            char[] pass_word=null;
            try{
                pass_word=con.readPassword("Input your password");
                System.out.println("Your password was "+new String(pass_word));
            }finally {
                if(pass_word!=null)
                {
                    java.util.Arrays.fill(pass_word,' ');
                }
            }
        }
        else {
            throw new RuntimeException("Can' no console ...      no console");
        }
    }
}
