package Thread.shangguigu;

/**
 *多线程的创建 方式一 继承与thread类
 * 1 创建一个继承thread的子类
 * 2 重写thread的run方法 将此线程执行的操作声明在run方法中
 * 3 创建子类对象
 * 4 通过此对象调用start
 *
 *
 *
 * @Author 陈豪
 * @Date 2021/3/21 10:19
 * @Version 1.0
 */

public class ThreadTest  {
    public static void main(String[] args) {
        mythread mythr = new mythread();
        mythr.start();//启动此线程 调用当前线程的run方法
        for (int i=0;i<100;i++){
            System.out.println(i+"*********");
        }
    }

}
class mythread extends Thread{
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
