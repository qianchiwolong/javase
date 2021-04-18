package 细节之处.实例化;

/**
 * @Author 陈豪
 * @Date 2021/3/15 20:10
 * @Version 1.0
 */

public class sun extends zilei {
    String neam;

    public sun(String neam) {
        this.neam = neam;
    }

    public sun() {
        System.out.println("sunlei无参构造");
    }


    public static void main(String[] args) {

        sun sun=new sun("sadj");
        System.out.println(sun.fun());
        System.out.println(sun.nameda);
    }
}
