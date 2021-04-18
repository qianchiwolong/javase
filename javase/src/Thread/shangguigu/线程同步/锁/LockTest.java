package Thread.shangguigu.线程同步.锁;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 解决线程安全问题的方式三 lock 锁  5.0新增
 * 1 实例化ReentranrLock
 * @Author 陈豪
 * @Date 2021/3/21 17:24
 * @Version 1.0
 */
class  myrunable implements Runnable{
    private int ticek=100;
    private ReentrantLock lock=new ReentrantLock();

    @Override
    public void run() {
        while (true){
            try {
                lock.lock();
                if (ticek>0){
                    System.out.println(Thread.currentThread().getName()+"买票  票号"+ticek);
                    ticek--;
                }else break;
            }finally {
                lock.unlock();
            }

        }
    }
}
public class LockTest {
    public static void main(String[] args) {
        myrunable myrunable = new myrunable();
        Thread t1=new Thread(myrunable);
        Thread t2=new Thread(myrunable);
        Thread t3=new Thread(myrunable);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
