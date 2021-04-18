package Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Test03 {
    public static void main(String[] args) throws Exception{
        StringBuilder s=new StringBuilder();

        Class class1=Class.forName("Reflect.User");
        s.append(Modifier.toString(class1.getModifiers())+"   class   "+class1.getSimpleName()+"{"+"\n");
        Field []field=class1.getDeclaredFields();
        for (Field field1:field)
        {
            //s.append(Modifier.toString(class1.getModifiers())+"\t"+class1.getTypeName()+field);
            s.append("  "+Modifier.toString(field1.getModifiers())+"  "+field1.getType().getSimpleName()+"  "+field1.getName());
            s.append(";");
            s.append("\n");
        }
        s.append("}");
        System.out.println(s);

    }
}
