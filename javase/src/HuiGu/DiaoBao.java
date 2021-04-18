package HuiGu;

public class DiaoBao extends WuQi implements Shootable {
    @Override
    public void shoot() {
        System.out.println("碉堡射击");
    }

    @Override
    public String toString() {
        return "碉堡";
    }
}
