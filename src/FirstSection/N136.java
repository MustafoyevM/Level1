package FirstSection;

public class N136 {
    public static int unique_paths(int m, int n){
        if(m<=0 || n<=0)return 0;
        int [][]grid=new int[m][n];
        for (int i = m-1; i >=0; i--) {
            for (int j = n-1; j >=0; j--) {
                grid[i][j]=get_paths(grid,i,j);

            }
        }
        return grid[0][0];
    }
    public static int get_paths(int[][]grid,int i,int j){
        if(i>=grid.length-1 || j>=grid[0].length-1)return 1;
        System.out.printf("grid[%d][%d]=%d",i,j+1,grid[i][j+1]);
        System.out.printf("\n   grid[%d][%d]=%d   \n",i+1,j,grid[i+1][j]);
        return grid[i][j+1]+grid[i+1][j];
    }
    public static void main(String []args){
        int m=3;
        int n=3;
        System.out.println(unique_paths(m,n));

    }

}
