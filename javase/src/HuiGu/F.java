package HuiGu;

public class F extends WuQi implements Moveable {
    @Override
    public void move() {
        System.out.println("飞机起飞");
    }

    @Override
    public String toString() {
        return "飞机";
    }
}
