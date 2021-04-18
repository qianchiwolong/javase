package HashMapTreeMap;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapTest02 {
    public static void main(String[] args) {
        TreeSet<user> a=new TreeSet<>();
        a.add(new user("张三",22));
        a.add(new user());
        a.add(new user("wangwu",26));
//没实现Comparaable接口时运行报错因为Set接口的实现类TreeSet是可排序的
        for (user A:
             a) {
            System.out.println(A);
        }

//        TreeSet<WuGu> b=new TreeSet<>(new WuGuComptare());
        //自制比较器的另一种写法匿名类部类
        TreeSet<WuGu> b=new TreeSet<>(new Comparator<WuGu>() {
            @Override
            public int compare(WuGu o1, WuGu o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        b.add(new WuGu(10));
        b.add(new WuGu(60));
        b.add(new WuGu(5));
        b.add(new WuGu(10));
        for (WuGu A:
                b) {
            System.out.println(A);
        }
    }
}
//第一种方法
class user implements Comparable<user>{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public user() {
    }

    public user(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(user o) {
        return this.age-o.age;
    }
}
//第二种方法自制比较器
class WuGuComptare implements Comparator<WuGu> {


    @Override
    public int compare(WuGu o1, WuGu o2) {
        return o1.getAge()- o2.getAge();
    }
}
class WuGu{
    private int age;

    public WuGu() {
    }

    public WuGu(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "WuGu{" +
                "age=" + age +
                '}';
    }
}