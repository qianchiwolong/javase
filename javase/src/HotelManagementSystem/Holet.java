package HotelManagementSystem;

public class Holet {
    public final static String name="东方之珠";
    private Room[][] rooms;

    public  Holet() {
        this.rooms=new Room[3][10];
        for(int i=0;i<rooms.length;i++)
            for(int j=0;j<rooms[i].length;j++)
            {
                if(i==0) rooms[i][j]=new Room(101+j,"普通级",false);
                if(i==1) rooms[i][j]=new Room(201+j,"贵宾级",false);
                if(i==2) rooms[i][j]=new Room(301+j,"总统级",false);
            }
    }
public  void print(){
    System.out.println("东方之珠酒店房间情况表");
    for(int i=0;i<rooms.length;i++)
    {for(int j=0;j<rooms[i].length;j++)
        {
            Room a=rooms[i][j];
            System.out.print(a);
        }
        System.out.println();
    }
}
public void Reservation(int roomon){
        int count=0;
        for(int i=0;i<rooms.length;i++)
            for(int j=0;j<rooms[i].length;j++)
            {
                count++;
                Room a=rooms[i][j];
               if(roomon==a.getOn())
               {
                   if(!a.isStatus()) {
                       a.setStatus(true);
                       System.out.println("订房成功 房间号为"+a.getOn());
                       return;
                   }
                   else {System.out.println(a.getOn()+"房间以被订");return;}
               }


            }

        if(count==rooms.length*rooms[0].length)
        {
            System.out.println("无此房间");
        }
}
public void Checkout(int roomon){
    for(int i=0;i<rooms.length;i++)

        for(int j=0;j<rooms[i].length;j++)
        {
            Room a=rooms[i][j];
            if(roomon==a.getOn())
            {
                if(!a.isStatus()) {System.out.println(a.getOn()+"房间以被退订");return;}
                else{
                    a.setStatus(false);
                    System.out.println("退房成功 房间号为"+a.getOn());
                    return;
                }
            }

        }


}
    public Room[][] getRooms() {
        return rooms;
    }

    public void setRooms(Room[][] rooms) {
        this.rooms = rooms;
    }
}
