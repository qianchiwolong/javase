package Thread.shangguigu.线程同步;

/**
 * 创建三个窗口去卖 100张票 使用接口方式来做
 * 当一个线程a在操作tivket 其他线程不能参与进来
 * 在Java中 我们通过同步机制 来解决安全问题
 *  方式一 同步代码块
 *  synchronizea（同步监视器）{
 *      需要被同步的代码
 *      操作共享数据的代码
 *      同步监视器 俗称锁 任何一个类的对象都可以充当锁
 *      要求：多个线程必须要共用一把锁 ****
 *
 *  }
 *  方式二 同步方法
 *   如果操作共享数据的代码完整的声明在一个方法中方 我们不妨吧此方法声明同步的
 * * @Author 陈豪
 * @Date 2021/3/21 12:19
 * @Version 1.0
 */
class Windows implements Runnable{
    private  int ticket=100;

    @Override
    public void run() {
        while (true){
            if (ticket>0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+":卖票，票号"+ticket);
                ticket--;
            }else break;
        }
    }
}

public class WindowTestTwo {
    public static void main(String[] args) {
        Windows windows=new Windows();
        Thread t1=new Thread(windows);
        Thread t2=new Thread(windows);
        Thread t3=new Thread(windows);
        t1.start();
        t2.start();
        t3.start();
    }

}
