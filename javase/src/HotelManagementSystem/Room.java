package HotelManagementSystem;

public class Room {
   /* public static void main(String[] args) {//测试程序
        Room b=new Room(102,"普通级",true);
        Room a=new Room(102,"普通级",false);
        System.out.println(a);
        System.out.println(a.equals(b));

    }*/
    private int on;
    private String type;
    private boolean status;

    @Override
    public boolean equals(Object obj) {
        if(this==null||!(obj instanceof Room))return false;
        if(this==obj)return true;
        if(this.on==((Room)obj).getOn())return true;
        return false;
    }

    @Override
    public String toString() {
        return "【"+this.on+","+this.type+","+(status?"订":"空")+"】";
    }

    public Room() {
    }

    public Room(int on, String type, boolean status) {
        this.on = on;
        this.type = type;
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getOn() {
        return on;
    }

    public void setOn(int on) {
        this.on = on;
    }
}
