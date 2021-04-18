package 剑指offer.Test13;
/**
 * 地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，
 * 它每次可以向左、右、上、下移动一格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。
 * 例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？
 * 示例 1：
 * 输入：m = 2, n = 3, k = 1
 * 输出：3
 * 示例 2：
 * 输入：m = 3, n = 1, k = 0
 * 输出：1
 *
       1 <= n,m <= 100
       0 <= k <= 20
 */
public class Test {

    public static int movingCount(int m, int n, int k) {
        int [][] borad=new int[n][m];
        int count=0;
//
//        for (int i=0;i<borad.length;i++)
//            for (int j=0;j<borad[i].length;j++)
//            {
//                if (sum(i)+sum(j)>k) borad[i][j]=1;
//            }



      dfs(borad,0,0,k);

        for (int i=0;i<borad.length;i++)
            for (int j=0;j<borad[i].length;j++)
            {
                if (borad[i][j]==1) count++ ;
            }
          return count;
    }
    static void dfs(int[][] board, int i, int j,int k)
    {
        if (i<0||i>board.length-1||j<0||j>board[i].length-1||board[i][j]==1||(sum(i)+sum(j))>k)
            return;
        if ((sum(i)+sum(j))<=k)
        {
            board[i][j]=1;

        }
        dfs(board,i-1,j,k);
        dfs(board,i+1,j,k);
        dfs(board,i,j-1,k);
        dfs(board,i,j+1,k);

    }
    static void dfs1(int[][] board, int i, int j,int k)
    {
        if (i<0||i>board.length||j<0||j>board[i].length||board[i][j]==1||(sum(i)+sum(j))>k)
            return;
        if ((sum(i)+sum(j))<=k)
        {
            board[i][j]=1;

        }
        dfs(board,i-1,j,k);
        dfs(board,i+1,j,k);
        dfs(board,i,j-1,k);
        dfs(board,i,j+1,k);

    }
    public static int sum(int n)
    {
        int sum = 0;
        while (n >= 10) {
            sum += n % 10;
            n /= 10;
        }
        sum += n;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(movingCount(16,8,4));
    }
}
