package FirstSection;

public class N144RemoveAllOccurences {
   //
}

class MAin{
    public static int fact(int a){
        int x=0;
        if(a==1)x=1;
        else x=fact(a-1)*a;
        return x;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
