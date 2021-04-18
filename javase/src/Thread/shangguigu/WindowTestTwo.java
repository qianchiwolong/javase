package Thread.shangguigu;

/**
 * 创建三个窗口去卖 100张票 使用接口方式来做
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
