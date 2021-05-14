package 力扣.Test125;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 陈豪
 * @Date 2021/5/13 17:15
 * @Version 1.0
 */

public class Test {
    public static boolean isPalindrome(String s) {
        String s1 = s.toLowerCase();
        List<Character> si=new ArrayList<>();
        for (char c : s1.toCharArray()) {
            if (c>='a'&&c<='z'||c>='0'&c<='9'){
                si.add(c);
            }
        }
        int first=0,last=si.size()-1;
        while (first<last){
            if (si.get(first)==si.get(last)){
                first++;
                last--;
            }else return false;
        }
        return true;
    }


    public static void main(String[] args) {
        /**/
        System.out.println(isPalindrome(""));
    }
}
