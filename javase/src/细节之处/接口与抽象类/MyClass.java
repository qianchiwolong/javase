package 细节之处.接口与抽象类;

import java.util.Objects;

/**
 * @Author 陈豪
 * @Date 2021/3/14 20:03
 * @Version 1.0
 */

public class MyClass extends MyAbstract {
    protected  int a;
    private   int b;
    public   int c;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return a == myClass.a &&
                b == myClass.b &&
                c == myClass.c;
    }




    @Override
    public void fun3() {

    }


    public static void main(String[] args) {
        MyClass myClass=new MyClass();
        MyAbstract myAbstract=new MyClass();
        myAbstract.a++;
        myClass.a++;
        System.out.println(myClass.a);
        MyClass.fun4();
    }
}
