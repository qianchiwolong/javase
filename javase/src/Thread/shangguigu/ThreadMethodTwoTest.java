package Thread.shangguigu;

/**
 * 第二种创建线程的方法
 * 1 创建实习接口的类
 * 2 实习类实现抽象方法
 * 3 创建此类对象
 * 4 将此对象作为参数传递到Thread类的构造器中 创建thread类的对象
 * 5 通过thread类的对象调用start方法
 * @Author 陈豪
 * @Date 2021/3/21 12:06
 * @Version 1.0
 */
class MyThread implements Runnable{

    @Override
    public void run() {
        System.out.println(fun());
    }
    private static int fun(){
        int sum=0;
        for (int i=1;i<=100;i++){
            sum+=i;
        }

        return sum;
    }
}
public class ThreadMethodTwoTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();


    }
}
