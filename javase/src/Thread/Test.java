package Thread;

public class Test {
    public static void main(String[] args) {
    Thread a=new Thread(new AD());
    a.start();

    a.interrupt();
        System.out.println("holle");
    }

}
class AD implements Runnable{

    public void run(){
        try {
            Thread.sleep(1000*60*60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}