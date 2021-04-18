package NiMingNeiBuLie;

import java.security.PublicKey;

public class Test {
    public static void main(String[] args) {
        Math m=new Math();
        //m.mysum(new JiSuanShiXian(),10,20);
       m.mysum(new JiSuan() {
           @Override
           public int sum(int a, int b) {
               return a+b;
           }
       },10,20);
    }
}
interface JiSuan{
    int sum(int a, int b);
}
/*class JiSuanShiXian implements JiSuan{
    public int sum(int a,int b){
        return a+b;

}

    }*/
class Math{
    public void mysum(JiSuan c,int x,int y){
        int i=c.sum(x,y);
        System.out.println(i);
    }}