package 力扣.test290;

import java.util.HashMap;
import java.util.Objects;

/**
 * @Author 陈豪
 * @Date 2021/5/10 10:52
 * @Version 1.0
 */

public class Test {
    public boolean wordPattern(String pattern, String str) {
        /*Map<String, Character> str2ch = new HashMap<String, Character>();
        Map<Character, String> ch2str = new HashMap<Character, String>();
        int m = str.length();
        int i = 0;
        for (int p = 0; p < pattern.length(); ++p) {
            char ch = pattern.charAt(p);
            if (i >= m) {
                return false;
            }
            int j = i;
            while (j < m && str.charAt(j) != ' ') {
                j++;
            }
            String tmp = str.substring(i, j);
            if (str2ch.containsKey(tmp) && str2ch.get(tmp) != ch) {
                return false;
            }
            if (ch2str.containsKey(ch) && !tmp.equals(ch2str.get(ch))) {
                return false;
            }
            str2ch.put(tmp, ch);
            ch2str.put(ch, tmp);
            i = j + 1;
        }
        return i >= m;*/
        String[] strings = str.split(" ");
        if (pattern.length() != strings.length) {
            return false;
        }
        HashMap<Object, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if(!Objects.equals(hashMap.put(pattern.charAt(i), i), hashMap.put(strings[i], i))){
                return false;
            }
        }
        return true;
    }
}
