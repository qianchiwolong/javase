package 力扣.test28;

/**
 * @Author 陈豪
 * @Date 2021/4/20 9:41
 * @Version 1.0
 */

public class Test {

    /*
    // KMP 算法
    // ss: 原串(string)  pp: 匹配串(pattern)
    public int strStr(String ss, String pp) {
        if (pp.isEmpty()) return 0;

        // 分别读取原串和匹配串的长度
        int n = ss.length(), m = pp.length();
        // 原串和匹配串前面都加空格，使其下标从 1 开始
        ss = " " + ss;
        pp = " " + pp;

        char[] s = ss.toCharArray();
        char[] p = pp.toCharArray();

        // 构建 next 数组，数组长度为匹配串的长度（next 数组是和匹配串相关的）
        int[] next = new int[m + 1];
        // 构造过程 i = 2，j = 0 开始，i 小于等于匹配串长度 【构造 i 从 2 开始】
        for (int i = 2, j = 0; i <= m; i++) {
            // 匹配不成功的话，j = next(j)
            while (j > 0 && p[i] != p[j + 1]) j = next[j];
            // 匹配成功的话，先让 j++
            if (p[i] == p[j + 1]) j++;
            // 更新 next[i]，结束本次循环，i++
            next[i] = j;
        }

        // 匹配过程，i = 1，j = 0 开始，i 小于等于原串长度 【匹配 i 从 1 开始】
        for (int i = 1, j = 0; i <= n; i++) {
            // 匹配不成功 j = next(j)
            while (j > 0 && s[i] != p[j + 1]) j = next[j];
            // 匹配成功的话，先让 j++，结束本次循环后 i++
            if (s[i] == p[j + 1]) j++;
            // 整一段匹配成功，直接返回下标
            if (j == m) return i - m;
        }

        return -1;
    }
*/
    public static int strStr(String haystack, String needle) {
       /* if (needle.isEmpty()) return 0;
        int res=-1;
        for (int i = 0; i <haystack.length() ; i++) {
            if (haystack.charAt(i)==needle.charAt(0)){
                String sub=haystack.substring(i,i+needle.length());
                if (sub.equals(needle)){
                    res=i;
                    break;
                }
            }
        }
        return res;*/

       if (needle.isEmpty()) return 0;
       int m=haystack.length(),n=needle.length();
       haystack=" "+haystack;
       needle=" "+needle;
       int[] next=new int[m+1];
        for (int i = 2,j=0; i <=m ; i++) {
            while (j>0&&haystack.charAt(i)!=haystack.charAt(j+1)) j=next[j];
            if (haystack.charAt(i)==haystack.charAt(j+1)) j++;
            next[i]=j;
        }

        for (int i = 1, j = 0; i <= n; i++) {
            while (j > 0 && needle.charAt(i) != haystack.charAt(j+1)) j = next[j];
            if (needle.charAt(i) == haystack.charAt(j+1)) j++;
            if (j == m) return i - m;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("",""));
    }
}
