package FirstSection;

import java.io.File;

public class N45 {
    public static void main(String[] args) {
        System.out.println("/home/student/abs.txt ->"+ new File("abs.txt").length()+" bytes");
        System.out.println("/home/student/test.txt -> "+ new File("test.txt").length()+" bytes");
    }
}
