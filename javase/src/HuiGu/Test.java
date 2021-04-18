package HuiGu;

public class Test {
    public static void main(String[] args) {

        Army army=new Army(4);
        TanK t1=new TanK();
        F f1=new F();
        DiaoBao d1=new DiaoBao();

        try {

            army.WuQiadd(t1);
            army.WuQiadd(f1);
            army.WuQiadd(f1);
            army.WuQiadd(d1);
            army.WuQiadd(t1);
            army.WuQiadd(d1);
        } catch (WuQiExcept wuQiExcept) {
            wuQiExcept.printStackTrace();
        }

        army.shoot();
        army.move();
    }
}
