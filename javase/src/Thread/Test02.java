package Thread;

public class Test02 {
    public static void main(String[] args) {
       SB r=new SB();
       Thread thread05=new Thread(r);
       thread05.start();
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("holle");
        r.run=false;

    }
}
class SB implements Runnable{
   boolean run=true;
    public void run(){

        for(int i=0;i<10;i++){
            if(run){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"----->"+i);
        }else {
                //这里可以写你要在终止线程前要保存的数据
                return;
            }
        }

    }
}
