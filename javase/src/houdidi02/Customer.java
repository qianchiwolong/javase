package houdidi02;

public class Customer {
    private Foodmenu foodmenu;

    public Customer(){}

    public Customer(Foodmenu foodmenu) {
        this.foodmenu = foodmenu;
    }

    public Foodmenu getFoodmenu() {
        return foodmenu;
    }

    public void setFoodmenu(Foodmenu foodmenu) {
        this.foodmenu = foodmenu;
    }
    public void order(){//顾客点菜方法
        foodmenu.shizhichaojidan();
        foodmenu.tangculiji();
    }
}
