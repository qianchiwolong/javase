package 力扣.Test05;

import HashMapTreeMap.HashMapTest;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public String longestPalindrome(String s) {

     /* for (int i=0;i<chars.length;i++) {
          if (check(chars)) return String.valueOf(chars);
          else {
              char[] chars1 = new char[chars.length - 1];
              System.arraycopy(chars, ++i, chars1, 0, chars.length - i++);
              if (check(chars1)) return String.valueOf(chars1);
          }
      }
      return null;*/
     /*   int len = s.length();
        if (len < 2) {
            return s;
        }

        int maxLen = 1;
        String res = s.substring(0, 1);

        // 枚举所有长度大于等于 2 的子串
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (j - i + 1 > maxLen && check(s, i, j)) {
                    maxLen = j - i + 1;
                    res = s.substring(i, j + 1);
                }
            }
        }
        return res;*/
        int len = s.length();
        if (len < 2) {
            return s;
        }

        int maxLen = 1;
        String res = s.substring(0, 1);

        // 枚举所有长度大于等于 2 的子串
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (j - i + 1 > maxLen && check(s, i, j)) {
                    maxLen = j - i + 1;
                    res = s.substring(i, j + 1);
                }
            }
        }
        return res;
    }
    public static boolean check(String s,int first,int last)
    {


     /*   if(first>=last) return true;
        else {
            if (chars[first]==chars[last])
            {first++;
            last--;
            check(chars,first,last);
            }else return false;
        }
        return false;*/
     char[] chars=s.toCharArray();
     if (first<last){
        while (first<last)
         {
             if(chars[first]==chars[last]){first++;last--;}
             else return false;
         }
        return true;
     }
     else return false;
    }

    public static void main(String[] args) {
      //  System.out.println(check("wds",0,2));
       Test t=new Test();
      String s=t.longestPalindrome("asdfabasdasdwadwdeawqewadeqawedrfewdfadwefrefdwdadwwwasdadaw");
      System.out.println(s);
    }
}
