package DateTest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd   HH:mm:ss  SSS");
        String date1=dateFormat.format(date);
        System.out.println(date1);
    }
}
