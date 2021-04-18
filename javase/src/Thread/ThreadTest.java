package Thread;

public class ThreadTest {
    public static void main(String[] args) {
        Thread currentThread=Thread.currentThread();
        System.out.println(currentThread);
        //方法一
        A a=new A();
        a.start();
        //方法二
       Thread t=new Thread(new B());
       t.start();
        //方法二的匿名内部类写法
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++)
                {
                    System.out.println("匿名内部类线程"+i);
                }
            }
        });
        t1.start();


        for (int i=0;i<10;i++){
            System.out.println("主线程"+i);
        }
    }
}
class A extends Thread{
    public void run(){

        for (int i=0;i<10;i++){
        System.out.println("A副线程"+i);
        }
    }

}
class B implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println("B副线程"+i);
        }
    }
}