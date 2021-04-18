package 剑指offer.Test04;

import java.util.concurrent.ArrayBlockingQueue;

/**在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。



 示例:

 现有矩阵 matrix 如下：

 [
 [1,   4,  7, 11, 15],
 [2,   5,  8, 12, 19],
 [3,   6,  9, 16, 22],
 [10, 13, 14, 17, 24],
 [18, 21, 23, 26, 30]
 ]

 给定 target = 5，返回 true。

 给定 target = 20，返回 false。
*/
public class Test {
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
       for (int i=0;i<matrix.length;i++)//i表示行数
       {
           for (int j=matrix[i].length-1;j>=0;j--)
           {
               if (target>matrix[i][j]) break;
               else if (target==matrix[i][j]) return true;
           }
       }
        return false;
    }

    public static void main(String[] args) {
        int [][] a={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(findNumberIn2DArray(a,16));
        //ArrayBlockingQueue 队列
    }
}
