package Stringbuffer;
//StringBuffer优化可以在定义时给个初始化容量
//StringBuffer默认为16超过时自动扩容
//扩容次数越多效率越低
//StringBuffer中的方法都有synchronized修饰表示StrinnBuffer在多线程环境下运行是安全的
public class StringbufferTest {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer();
        s.append('a');
        s.append(100);
        s.append(true);
        s.append("hfuiahfuiaiuhiagfigigiugigigigfeigfiegfg");
        System.out.println(s);
        StringBuffer s1=new StringBuffer(25);
    }
}
