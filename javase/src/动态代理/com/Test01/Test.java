package 动态代理.com.Test01;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        holleservlce holleservlce=new holleservlceshixian();
       // holleservlce.sayholle("张三");
        Method method=holleservlce.class.getMethod("sayholle", String.class);
        method.invoke(holleservlce,"李四");
    }
}
