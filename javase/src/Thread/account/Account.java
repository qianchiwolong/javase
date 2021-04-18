package Thread.account;

public class Account {
    private String name;
    private double account;

    public Account() {
    }

    public Account(String name, double account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }
    public void   qukuan(double money){
       // this.setAccount(this.getAccount()-money);
         double after;
         after=this.getAccount()-money;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setAccount(after);
    }
}
