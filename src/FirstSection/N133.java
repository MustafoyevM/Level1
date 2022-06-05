package FirstSection;

public class N133 {
    public static int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int[][] temp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    temp[i][j] = grid[i][j];
                    continue;
                }
                // Compute temp
                int from_up = (i == 0|| (i==m-1&& j!=0)) ? Integer.MAX_VALUE : temp[i - 1][j];
                int from_left = j == 0 ? Integer.MAX_VALUE : temp[i][j - 1];
                temp[i][j] = Math.min(from_up, from_left) + grid[i][j];
            }
        }
        return temp[m - 1][n - 1];
    }
    public static int sum(int [][] a){
        int m=a.length;
        int n=a[0].length,j=1,i=0,sum=0;
        while(i<m){
            sum+=a[i][0];i++;
        }
        while(j<n){
            sum+=a[m-1][j];j++;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][]a={{1,2,3},
                {4,5,6},
                {7,54,9}};
        System.out.println(sum(a));
        System.out.println(minPathSum(a));
    }
}
