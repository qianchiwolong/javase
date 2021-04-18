package 动态代理.com.Test02.andler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class mysellhandler implements InvocationHandler {
    private Object target=null;

    public mysellhandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Object res=method.invoke(target,objects);
        if (res!=null)
        {
            Float price=(Float)res;
            price=price+25;
            res=price;
        }
        return res;
    }
}
