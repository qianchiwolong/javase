package Thread.account;

public class AccountThread implements Runnable {
    private Account act;
    double a;
    public AccountThread(Account act,double a) {
        this.act = act;
        this.a=a;
    }

    @Override
    public void run() {

        act.qukuan(this.a);
        System.out.println(Thread.currentThread().getName()+"    账户名  "+act.getName()+"   余额"+act.getAccount());
    }
}
