package FirstSection;
import static java.lang.Math.*;



public class N157ChecktoprimeAndCommonFactor {
    public static void main(String[] args) {
        boolean [][]A=new boolean[3][3];

        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j]=prime_cell(i,j)==1;
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int prime_cell(int i,int j){
        if(i==0 || j==0){
            return 1;
        }
        if(i<j){
            int t=i;
            j=i;
            i=t;
        }
        if(i%j==0)return j;
        else{
            prime_cell(j,i%j);
        }
        return j;
    }
}
