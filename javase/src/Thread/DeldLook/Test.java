package Thread.DeldLook;

import javax.naming.spi.ObjectFactoryBuilder;

public class Test {
    public static void main(String[] args) {
        Object obj1=new Object();
        Object obj2=new Object();
        Thread thread=new mythread(obj1,obj2);
        Thread thread1=new mythread1(obj1,obj2);
        thread.start();
        thread1.start();
    }
}
class mythread extends Thread{
    private Object o1;
    private Object o2;

    public mythread(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o1){
            System.out.println("mythread锁o1");
            synchronized (o2){}
        }
    }
}
class mythread1 extends Thread{
    private Object o1;
    private Object o2;

    public mythread1(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o2){
            System.out.println("mythread锁o2");
            synchronized (o1){}
        }
    }
}