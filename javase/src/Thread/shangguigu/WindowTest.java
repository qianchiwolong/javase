package Thread.shangguigu;

/**
 * 创建三个窗口去卖 100张票 使用继承方式来做
 *
 *
 * @Author 陈豪
 * @Date 2021/3/21 11:54
 * @Version 1.0
 */
class Window extends Thread{
    private static int ticket=100;

    @Override
    public void run() {
        while (true){
            if (ticket>0){
                System.out.println(getName()+":卖票，票号"+ticket);
                ticket--;
            }else break;
        }
    }
}
public class WindowTest {
    public static void main(String[] args) {
        Window window1 = new Window();
        Window window2 = new Window();
        Window window3 = new Window();

        window1.start();
        window2.start();
        window3.start();

    }

}
