package 细节之处.接口与抽象类;

/**
 * @Author 陈豪
 * @Date 2021/3/14 19:59
 * @Version 1.0
 */

public abstract class MyAbstract implements MyInterface{
    public static int a=10;
    public MyAbstract() {
        System.out.println("MyAbstract");
    }

    public String fun1(int a){
        return null;
    };

    public int fun2() {
        return 0;
    }

    public abstract void fun3();

    public static final void fun4() {
        System.out.println("抽象类静态方法");
    }
}
