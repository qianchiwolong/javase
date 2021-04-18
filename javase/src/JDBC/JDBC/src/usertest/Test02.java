package JDBC.JDBC.src.usertest;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test02 {
    public static boolean adduser(String newusername,String newpassword)
    {
        boolean a=false;
        Connection conn=null;
       PreparedStatement ps=null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode?serverTimezone=UTC","root","990808");
            conn.setAutoCommit(false);
            String sql="insert into t_user(username,password) values(?,?)";
            ps=conn.prepareStatement(sql);
            ps.setString(1,newusername);
            ps.setString(2,newpassword);
            ps.executeUpdate();
           conn.commit();
            a=true;
        } catch (ClassNotFoundException e) {
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                if (conn == null) {
                    try {
                        conn.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        return a;
    }

    public static void main(String[] args) {
        boolean c=adduser("cheng","990808");
        System.out.println(c?"注册成功":"注册失败");
    }
}
