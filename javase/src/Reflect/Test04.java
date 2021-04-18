package Reflect;

import java.lang.reflect.Field;

public class Test04 {
    public static void main(String[] args)throws Exception {
        Class c=Class.forName("Reflect.User");
        Object obj=c.newInstance();
        Field onfield=c.getDeclaredField("age");
        onfield.set(obj,"15");
        System.out.println(onfield.get(obj));

    }
}
