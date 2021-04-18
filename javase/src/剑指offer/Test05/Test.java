package 剑指offer.Test05;
/**请实现一个函数，把字符串 s 中的每个空格替换成"%20"。



 示例 1：

 输入：s = "We are happy."
 输出："We%20are%20happy."

 */
public class Test {
    public String replaceSpace(String s) {
      //return s.replaceAll(" ","%20");
        //创建一个足够大的数组（最多是原来的3倍）然后添加，最后截取并返回；
        int length = s.length();
        char[] array = new char[length * 3];
        int size = 0;
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                array[size++] = '%';
                array[size++] = '2';
                array[size++] = '0';
            } else {
                array[size++] = c;
            }
        }
        String newStr = new String(array, 0, size);//*****记住此构造方法
        return newStr;

    }
}
