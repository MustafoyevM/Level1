package FirstSection;

public class N170ConsecutiveSequence {
    public static int Consequence(int [] array){
        if(array==null)
            throw new IllegalArgumentException("NUll array");
        int result=0,start=0,end=0;
        boolean flag=false;
        for (int i = 1; i < array.length; i++) {
            if(array[i-1]<array[i]) end=i;
            else start=i-1;
            if(end-start>result){
                flag=true;
                result=end-start;
            }

        }
        if(flag)return result+1
                ;

        else return result;
    }

    public static void main(String[] args) {
        int []array={1,1,2,3,3,4,5,2,4,5,6,7,8};
        int result=Consequence(array);
        System.out.println(result);
    }
}
