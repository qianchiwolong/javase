package 剑指offer.Test53;
/*
* 统计一个数字在排序数组中出现的次数。



示例 1:

输入: nums = [5,7,7,8,8,10], target = 8
输出: 2
*/
public class Test {
    public static int search(int[] nums, int target) {
      int count=0;
      int index=search(nums,target,0,nums.length-1);

      if (index!=-1){
          int first = index - 1;
          while (first>=0 && nums[first] == nums[index]) {
              count++;
              first--;
          }
          first = index + 1;
          while (first<nums.length && nums[first] == nums[index]) {
              count++;
              first++;
          }
          return count + 1;
      }
      else return 0;
    }
    public static int search(int[] nums, int target,int first,int last){
        if (first>last) return -1;

        int i=(first+last)/2;

        if (nums[i] > target) return search(nums, target, first, i-1);
        else if (nums[i] < target) return search(nums, target, i+1, last);
             else return i;

    }

    public static void main(String[] args) {
       int[] arr={1,1,2,3,5,6,7};
        System.out.println(search(arr,2));
    }
}
