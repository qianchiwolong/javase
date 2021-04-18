package houdidi02;

public class Test {
    public static void main(String[] args) {
        Foodmenu fm=new Chinacook();
        Foodmenu fm2=new Americacook();
        Customer c1=new Customer(fm);
        c1.order();
        Customer c2=new Customer(fm2);
        c2.order();

    }


}
