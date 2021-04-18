package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
    public static void main(String[] args) {
        Collection collection=new ArrayList();//多态
        collection.add("dasdasda");
        collection.add("131531");
//只要集合结构发生变换就要重新获取迭代器否则报错ConcurrentModificationException

        collection.add("sdad");
        collection.add(1332);//自动装箱
        collection.add(new Object());
        System.out.println(collection.size());
        System.out.println(collection.contains(1332));
        System.out.println(collection.contains(2222));
        collection.remove(1332);
        System.out.println(collection.contains(1332));
        Object[] objarray=collection.toArray();
        for (int i=0;i<objarray.length;i++)
        {
            System.out.println(objarray[i]);
        }
        System.out.println("==============================");
        Iterator a= collection.iterator();//多态
        for (;a.hasNext();)
        {
            a.remove();//迭代器的删除器
           // collection.remove(1322);会报错因为“快照”检查到不一样了
            System.out.println(a.next());
        }

    }
}
