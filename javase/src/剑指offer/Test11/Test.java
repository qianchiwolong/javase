package 剑指offer.Test11;

import java.util.Arrays;

/**把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。

 示例 1：

 输入：[3,4,5,1,2]
 输出：1

 示例 2：

 输入：[2,2,2,0,1]
 输出：0
 */
public class Test {
    public static int minArray(int[] numbers) {
        //方法一
       // Arrays.sort(numbers);
       // return numbers[0];
        //方法二
        int res=Integer.MAX_VALUE;
        for (int i=0;i<numbers.length;i++)
        {
            if (numbers[i]<res) res=numbers[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int []a={2,2,2,0,1};
        System.out.println(minArray(a));

    }
}
