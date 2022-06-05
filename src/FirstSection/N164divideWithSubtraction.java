package FirstSection;

public class N164divideWithSubtraction {
    public static void main(String[] args) {
        System.out.println(divide(625,25));
    }
    public static float divide(int divided,int divider){
        if(divided==0)return 0;
        float result=0;
        while (divided>divider){
            divided-=divider;
            result++;
        }
        float DecimalPart=(float)divided/(float)divider;
        result+=DecimalPart;
        return result;
    }
}
