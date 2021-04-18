package Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Test02 {
    public static void main(String[] args) throws Exception{
        Class classname=Class.forName("Reflect.User");
        Field[] a=classname.getFields();
        System.out.println(a.length);
        Field f1=a[0];
        System.out.println(f1.getName());

       Field[] f2= classname.getDeclaredFields();
        System.out.println(f2.length);
        for (Field field:f2)
        {
            int i=field.getModifiers();
            String string=Modifier.toString(i);
            System.out.println(string);
            System.out.println(field.getType().getName());
            System.out.println(field);
            System.out.println("==================");
        }
    }

}
