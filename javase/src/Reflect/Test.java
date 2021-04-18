package Reflect;

import java.io.FileInputStream;
import java.util.Properties;

public class Test {
    public static void main(String[] args)throws Exception {
        FileInputStream fis=new FileInputStream("houdidi\\src\\Reflect\\classinfo.properties");
        Properties properties=new Properties();
        properties.load(fis);
        fis.close();
       String s= properties.getProperty("className");
        System.out.println(s);
        Class c=Class.forName(s);
        Object o= c.newInstance();
        System.out.println(o);
    }
}
