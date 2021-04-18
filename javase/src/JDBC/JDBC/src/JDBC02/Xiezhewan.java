package JDBC.JDBC.src.JDBC02;
import java.sql.*;
import java.util.ResourceBundle;

public class Xiezhewan {
    public static void main(String[] args)
    {
        Connection conn=null;
        Statement stat=null;
        ResultSet rs=null;
        ResourceBundle rsb=ResourceBundle.getBundle("");
        String driver=rsb.getString("");
        String url=rsb.getString("");
        String user=rsb.getString("");
        String password=rsb.getString("");
        try{
            Class.forName(driver);
            conn=DriverManager.getConnection(url,user,password);
            stat=conn.createStatement();
            rs=stat.executeQuery("sql");
            while(rs.next())
            {
            }

        }catch(Exception e)
        {
            e.printStackTrace();
        }finally{
            if( null != rs) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(stat!=null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn!=null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }


        }

    }
}
