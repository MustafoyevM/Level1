package FirstSection;

public class N91 {
    public static void main(String[] args) {
        long starttime=System.nanoTime();
        //Display the first 10natural number
        System.out.println("The first 10 natuarl number are :");
        int i;
        for ( i = 0; i < 10; i++) {
            System.out.println(i);
        }
        long estimateTime=System.nanoTime()-starttime;
        System.out.println("Estimate time (in nanoseconds) to get the first 10 natural numbers :"+estimateTime+"ns");
    }
}
