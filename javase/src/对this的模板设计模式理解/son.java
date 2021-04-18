package 对this的模板设计模式理解;

public class son extends farther {
    @Override
    public void doput() {

        super.doput();
        System.out.println("son   doput");
    }

    @Override
    public void dppost() {
        super.dppost();
        System.out.println("son   dopost");
    }
}
