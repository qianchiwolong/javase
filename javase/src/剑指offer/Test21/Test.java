package 剑指offer.Test21;
/**
 *输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，
 * 所有偶数位于数组的后半部分。
 *
 *
 *
 * 示例：
 *
 * 输入：nums = [1,2,3,4]
 * 输出：[1,3,2,4]
 * 注：[3,1,2,4] 也是正确的答案之一。
 *
 *
 *
 * 提示：
 *
 *     1 <= nums.length <= 50000
 *     1 <= nums[i] <= 10000
 *
 * */
public class Test {
    public int[] exchange(int[] nums) {
/*
     int[] res=new int[nums.length];
     int index=0;
     int first=0;
     int last=res.length-1;
     while (first<last)
     {
         if (nums[index]%2==0){
             res[last]=nums[index];
             index++;
             last--;
         }else {
             res[first]=nums[index];
             index++;
             first++;
         }

     }
     return res;
*/
        int first = 0, last = nums.length - 1, tmp;
        while(first < last) {
            while(first < last && (nums[first] %2) == 1) first++;
            while(first < last && (nums[last] %2) == 0) last--;
            tmp = nums[first];
            nums[first] = nums[last];
            nums[last] = tmp;
        }
        return nums;

    }
}
