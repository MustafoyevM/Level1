package FirstSection;

public class N155RowToColumn {
    public static void main(String[] args) {
        int [][]a={{10,20,30},{40,50,60}};
        int [][]b=new int[3][2];
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j < 3; j++) {
                b[j][i]=a[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

    }
}
