package FirstSection;
import static java.lang.Math.*;
public class N156GreaterCommonDivisor {
    public static void main(String[] args) {
        System.out.println(GreaterCommonDivisor(125463, 9658));
    }
    public static int GreaterCommonDivisor(int a, int b){
        int k=0;
        if(a%b==0){
            k=b;
            return b;
        }
        else{
            k=GreaterCommonDivisor(max(b,abs(a-b)),min(b,abs(a-b)));
        }
        return k;
    }
}
