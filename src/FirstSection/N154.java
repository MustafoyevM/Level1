package FirstSection;

public class N154 {
    public static void main(String[] args) {
        boolean [][]ar= {{true, true, true}, {false, false, false}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if(ar[i][j]==true) System.out.print("t ");
                else System.out.print("f ");
            }
            System.out.println();
        }
    }
}
