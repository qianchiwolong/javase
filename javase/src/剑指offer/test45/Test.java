package 剑指offer.test45;

/**
 * @Author 陈豪
 * @Date 2021/5/4 20:02
 * @Version 1.0
 */

public class Test {
    public static String minNumber(int[] nums) {
      String[] numbers=new String[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            numbers[i]=String.valueOf(nums[i]);
        }
        String[] sort = sort(numbers);
        StringBuilder res=new StringBuilder();
        for (String s : sort) {
            res.append(s);
        }
        return res.toString();
    }

    private static String[] sort(String[] numbers) {

        for (int i = 1; i <numbers.length ; i++) {
            String inster=numbers[i];
            int insterindex=i-1;
            /*Long.valueOf(inster+numbers[insterindex])<Long.valueOf(numbers[insterindex]+inster*/
            while (insterindex>=0&&(inster+numbers[insterindex]).compareTo(numbers[insterindex]+inster)<0){
                numbers[insterindex+1]=numbers[insterindex];
                insterindex--;
            }
            numbers[insterindex+1]=inster;
        }
        return numbers;

    }

    public static void main(String[] args) {
        int[] a={3,30,34,5,9};
        System.out.println(minNumber(a));
        int i = "110".compareTo("102");//此方法可以比较两字符串类型数字的大小 前大于后 返回1 小于返回-1
        System.out.println(i);
    }
}
