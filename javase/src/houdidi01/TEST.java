package houdidi01;

public class TEST {
    public static void main(String[] args) {
        System.out.println(A.i);
        A s=new X();
        s.fun();
        System.out.println("------------------------");
        A s1=new Y();
        s1.fun();
        System.out.println("------------------------");
        B s2=(B)s1;
        s2.fun();
        s2.fun1();
        System.out.println("------------------------");
        A s3=new Z();
        System.out.println(s3 instanceof C);//为啥用instanceof去判断s3为c接口时返回true
        System.out.println("------------------------");
        fu f1=new Zi();
        // f1.fun();//Cannot resolve method 'fun' in 'fu'
        Zi f2=(Zi)f1;
        f2.fun();
        A f3=new Zi();
        f3.fun();
    }}
class fu{
    public fu(){
        System.out.println("父类的无参构造");
    }
}
interface  A{
    //    常量
    int i=10;
    //    抽象方法
    void fun();
}
interface C{
    void fun2();
}
interface  B extends A{
    void fun1();
}
class X implements A{
    @Override
    public void fun() {
        System.out.println("x的A接口的抽象方法实现");
    }
}
class Y implements B{
    //
    @Override
    public void fun() {
        System.out.println("y的a接口的抽象方法实现");
    }

    @Override
    public void fun1() {
        System.out.println("y的B接口的抽象方法实现");
    }
}
class Z implements A,C{
    public  Z(){
        System.out.println("z的无参构造");
    }
    @Override
    public void fun() {
        System.out.println("Z的A接口的抽象方法实现");
    }

    @Override
    public void fun2() {
        System.out.println("Z的C接口的抽象方法实现");
    }
}
class Zi extends fu implements A{

    @Override
    public void fun() {
        System.out.println("zi的A接口的抽象方法实现");
    }
}
