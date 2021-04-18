package FanXing;

import java.util.*;

public class
Test02 {
    public static void main(String[] args) {
         Map<Integer,String> a=new HashMap<Integer,String>();
         a.put(1,"zhangs");
         a.put(2,"houdidi");
         a.put(3,"houlaji");
        System.out.println(a.size());
        System.out.println(a.get(1));
        System.out.println("===================================");
        Set<Integer> set=a.keySet();
       Iterator iterator=set.iterator();
       while (iterator.hasNext())
       {
           System.out.println(iterator.next());
       }
        for(Integer A:set){
            System.out.println(A);
        }
        System.out.println("===================================");
        for(Integer A:set){
            System.out.println(a.get(A));//A就是key 通过遍历key来获得value
        }
        System.out.println("===================================");
        System.out.println(a.remove(2));
        System.out.println("===================================");
        Collection<String> strings=a.values();
        for(String A:strings){
            System.out.println(A);
        }
        System.out.println("===================================");
        Set<Map.Entry<Integer,String>> set1=a.entrySet();
        for (Map.Entry<Integer,String>  A:set1){
            System.out.println(A.toString());
        }
        Iterator<Map.Entry<Integer,String>> iterator1=set1.iterator();
        while (iterator1.hasNext())
        {
           Map.Entry<Integer,String> m=iterator1.next();
           Integer i=m.getKey();
          String s= m.getValue();
            System.out.println(i+s);
        }

    }

}
