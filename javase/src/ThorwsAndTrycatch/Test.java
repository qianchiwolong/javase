package ThorwsAndTrycatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) {
        System.out.println("mainbing");
        try {
            m1();

        } catch (FileNotFoundException e) {
            System.out.println("文件路径错误或文件不存在");
           e.printStackTrace();
        }
        System.out.println("===================================");
       NullPointerException e=new NullPointerException();
        String a= e.getLocalizedMessage();
        e.printStackTrace();
        System.out.println("mainend");
    }
    public static void m1() throws FileNotFoundException {
        System.out.println("m1bing");
        m2();
        System.out.println("m1end");
    }

    private static void m2() throws FileNotFoundException {
        System.out.println("m2bing");
    m3();
        System.out.println("m2end");
    }

    private static void m3() throws FileNotFoundException {
        System.out.println("m3bing");
    new FileInputStream("D:\\桌面\\测试.tt");
        System.out.println("m3end");
    }
}
