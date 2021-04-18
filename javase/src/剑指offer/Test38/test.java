package 剑指offer.Test38;
/**输入一个字符串，打印出该字符串中字符的所有排列。



 你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。



 示例:

 输入：s = "abc"
 输出：["abc","acb","bac","bca","cab","cba"]

*/
public class test {
    public String[] permutation(String s) {
      String[] res=new String[fun(s.length())];
      char[] chars=s.toCharArray();
      int indexs=0;
      while (indexs<res.length){
          int first=0;
          char[] chars1=new char[s.length()];

      }
       return res;
    }
   static int fun(int n)
    {
        if(n==1||n==0){
            return 1;
        }
        else{
            return n*fun(n-1);
        }
    }

    public static void main(String[] args) {

    }
}
