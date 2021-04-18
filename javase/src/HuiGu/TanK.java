package HuiGu;

public class TanK extends WuQi implements Shootable,Moveable {

    @Override
    public void move() {
        System.out.println("坦克移动");
    }

    @Override
    public void shoot() {
        System.out.println("坦克开炮");
    }

    @Override
    public String toString() {
        return "坦克";
    }
}
