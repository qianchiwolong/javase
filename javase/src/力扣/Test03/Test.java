package 力扣.Test03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Test {
    public int lengthOfLongestSubstring(String s) {
      /*  HashMap<Character,Integer> map=new HashMap<>(s.length());

        char[] chars=s.toCharArray();
        for (int i=0;i<chars.length;i++)
        {
           if (map.containsKey(chars[i])) ;
           map.put(chars[i],i);
        }
      return map.size();*/
     /*   HashSet<Character> set=new HashSet<>(s.length());
        char[] chars=s.toCharArray();
        for (int i=0;i<chars.length;i++)
            set.add(chars[i]);
        return set.size();
*/
        HashMap<Character,Integer> map=new HashMap<>(s.length());
        int maxlength=0;
        char[] chars=s.toCharArray();
        int index=0;
        int i;
        while (index<chars.length-1){
            i=index;
        for (;i<chars.length;i++)
        {

            if (map.containsKey(chars[i])) {
                maxlength=maxlength>map.size()?maxlength:map.size();
                map.clear();
                break;
            }

            map.put(chars[i],i);
        }
         index++;
        }
        return maxlength>map.size()?maxlength:map.size();


    }

    public static void main(String[] args) {
        Test a=new Test();
        System.out.println(a.lengthOfLongestSubstring("pwcwkew"));
    }
}
