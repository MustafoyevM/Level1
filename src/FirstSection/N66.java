package FirstSection;

public class N66 {
    public static void main(String[] args) {
        int prime = 5, i, count = 2,sum=5;                // 2 3
        boolean f = true;
        System.out.print("2 3 ");
        while (count !=100) {


            for ( i = 3; i < prime; i += 2) {
                if (prime % i == 0) {
                    f = false;
                    break;
                }
                else
                    f=true;
            }
            if (f) {
                System.out.print(prime + " ");
                sum+=prime;
                count++;
            }
            prime += 2;
        }
        System.out.println(count);
        System.out.println(sum);
    }
}
