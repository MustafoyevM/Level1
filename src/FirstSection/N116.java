package FirstSection;

public class N116 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if(i%15==0) System.out.println("multiply of 3 and 5   i="+i+" fizz buzz");
            else if(i%3==0) System.out.println("multiply of 3    i="+i+" fizz");
            else if(i%5==0) System.out.println("multiply of 5   i="+i+" buzz");
        }
    }
}
