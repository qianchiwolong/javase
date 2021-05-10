package 力扣.test1487;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author 陈豪
 * @Date 2021/5/8 9:04
 * @Version 1.0
 */

public class Test {
    public static String[] getFolderNames(String[] names) {
    /*    Map<String,Integer> map=new HashMap<>();
        for (String name : names) {
           if (map.containsKey(name)){
               Integer integer = map.get(name);
               integer++;
               map.put(name,integer);
           }else map.put(name,0);
        }
        String[] res=new String[names.length];
        int index=0;
        Set<String> strings = map.keySet();
        for (String name : strings) {
            Integer integer = map.get(name);
            if (integer>0){
                res[index]=name;
                index++;
                for (int i = 1; i <= integer; i++) {
                    res[index]=name+"("+i+")";
                    index++;
                }
            }else {
                res[index]=name;
                index++;
            }
        }


        return res;*/
        int n = names.length;
        String[] ans = new String[n];
        //文件名及其序列号
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            //计数从0开始，所以为了保持操作统一，默认值是-1.
            int k = map.getOrDefault(names[i], -1) + 1;
            //计算当前name
            String name = names[i] + (k==0 ? "" : "("+k+")");
            //如果已经存在，需要增加k的序列号
            while(map.get(name) != null) {
                k++;
                //k更新后，更新name
                name = names[i] +"("+k+")";
            }
            //当前name保存，已经计算的name中是唯一的
            ans[i] = name;
            //注意这里保存的是names[i]的序列号，而不是name,因为name可能本身包含序列号，不能确定顺序是否正确,如pes(2019)
            map.put(names[i], map.getOrDefault(names[i], -1) + 1);
            //保存本次唯一的name, 及其序列号0
            map.put(ans[i], 0);
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] a={"wano","wano","wano","wano"};
        getFolderNames(a);
    }
}
