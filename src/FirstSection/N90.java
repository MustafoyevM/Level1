package FirstSection;

public class N90 {
    public static void main(String[] args) {
        // gets the value of specified environment variable "PATH"
        System.out.println("\n Environment variable Path");
        System.out.println(System.getenv("PATH"));
        // gets the value of the specifies environment variable "TEMP"
        System.out.println("\n Environment variable TEMP");
        System.out.println(System.getenv("TEMP"));
        // gets the value of specifies environment variable "USERNAME"
        System.out.println("\n Environment variable USERNAME");
        System.out.println(System.getenv("USERNAME"));
    }
}
