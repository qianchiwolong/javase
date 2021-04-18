package 剑指offer.test50;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author 陈豪
 * @Date 2021/4/5 18:50
 * @Version 1.0
 */

public class Test {
    public static char firstUniqChar(String s) {
      /*  Map<Character,Boolean> map=new HashMap<>(s.length());
        for (int i = 0; i <s.length() ; i++) {
            if (map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),false);
            }else map.put(s.charAt(i),true);
        }
        for (int i = 0; i <s.length() ; i++) {
            if (map.get(s.charAt(i))){
                return s.charAt(i);
            }
        }
    return ' ';*/
        HashMap<Character, Boolean> dic = new HashMap<>();
        char[] sc = s.toCharArray();
        for(char c : sc)
            dic.put(c, !dic.containsKey(c));
        for(char c : sc)
            if(dic.get(c)) return c;
        return ' ';

    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("abaccdeff"));
    }

}
