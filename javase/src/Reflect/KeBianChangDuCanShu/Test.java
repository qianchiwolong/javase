package Reflect.KeBianChangDuCanShu;

public class Test {
    public static void main(String[] args) {
        m1();
        m1(12,21313,61);
        m2("lj ",1313,565);
        m3("永","远","的","神");
    }
    public static void m1(int... ints){
        System.out.println("可变长度参数方法");
    }
    public static void m2(String s,long... l){
        System.out.println("参数String,long...");
    }
    public static void m3(String... a){
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
