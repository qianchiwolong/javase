package Thread.account;

public class Test {
    public static void main(String[] args) {
//        Account actt=new Account("陈豪",10000);
//        AccountThread act=new AccountThread(actt,5000);
//        Thread thread = new Thread(act);
//        Thread thread1=new Thread(act);
        Account actt=new Account("陈豪",10000);
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
               actt.qukuan(5000);
                System.out.println(Thread.currentThread().getName()+"    账户名  "+actt.getName()+"   余额"+ actt.getAccount());
            }
        });
      Thread thread1=new Thread(new Runnable() {
          @Override
          public void run() {
              actt.qukuan(5000);
              System.out.println(Thread.currentThread().getName()+"    账户名  "+actt.getName()+"   余额"+ actt.getAccount());
          }
      });
        thread.setName("线程1");
        thread1.setName("线程2");
        thread.start();
        thread1.start();
    }
}
