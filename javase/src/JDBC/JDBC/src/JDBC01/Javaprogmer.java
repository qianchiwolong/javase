package JDBC.JDBC.src.JDBC01;

import java.util.ResourceBundle;

public class Javaprogmer {
    public static void main(String[] args) throws Exception {
//        Jdbc jdbc = new mysql();
//        jdbc.lianjiedb();



//

//        Class classname=Class.forName("JDBC模拟.mysql");
//        Jdbc j=(Jdbc) classname.newInstance();
//        j.lianjiedb();
        ResourceBundle  resourceBundle=ResourceBundle.getBundle("jdbc");
       String value= resourceBundle.getString("db");
       Class classname=Class.forName(value);
       Jdbc j=(Jdbc)classname.newInstance();
       j.lianjiedb();
    }
}