package FanXing;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Animal>  a=new ArrayList<>();
        a.add(new cat());
        a.add(new Bird());
        //迭代器遍历集合
     Iterator<Animal> z= a.iterator();
     while (z.hasNext()){
        // z.next().move();
        Animal X= z.next();
        if (X instanceof cat){((cat) X).chat();}
        else if(X instanceof Bird){((Bird) X).fly();}
     }
     //for遍历只适用实现list的集合（有下标）对下标元素进行操作
     for (int i=0;i<a.size();i++){
         System.out.println(a.get(i));
     }
     //foreach遍历只适用实现list的集合且不能对元素下标进行操作
        for (Animal A:a) {
            System.out.println(A);
        }
    }

}
class Animal{
    public void move(){
        System.out.println("动物移动");
    }
}
class cat extends Animal{
    public void chat(){
        System.out.println("猫在抓老鼠");
    }
}
class Bird extends Animal{
    public void fly(){
        System.out.println("起飞");
    }
}