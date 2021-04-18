package 剑指offer.test61;

/**
 * @Author 陈豪
 * @Date 2021/4/11 20:56
 * @Version 1.0
 */

public class Test {
    public boolean isStraight(int[] nums) {
        int index=0;
        boolean res=false;
        ShellSort(nums);
        for (int i = 0; i <nums.length-1 ; i++) {
            if (nums[i]==0) index++;
            else if (nums[i]==nums[i+1]) return false;
        }
        return nums[4]-nums[index]<5;
    }
    public static int[] ShellSort(int [] arr) {
        for (int gap = arr.length / 2; gap >0; gap = gap / 2)
            for (int i = gap; i < arr.length; i++)
                for (int j = i - gap; j >= 0; j = j - gap)
                {
                    if (arr[j]>arr[j+gap]){
                        int temp=arr[j];
                        arr[j]=arr[j+gap];
                        arr[j+gap]=temp;
                    }
                }
        return arr;
    }

}
