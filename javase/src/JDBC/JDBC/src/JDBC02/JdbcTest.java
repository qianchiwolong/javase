package JDBC.JDBC.src.JDBC02;

import java.sql.*;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class JdbcTest {
    public static void main(String[] args) {
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;
        ResourceBundle resourceBundle=ResourceBundle.getBundle("JDBC02");
        String driver=resourceBundle.getString("driver");
        String url=resourceBundle.getString("url");
        String user=resourceBundle.getString("user");
        String password=resourceBundle.getString("password");
        try {
            Class.forName(driver);//com.mysql.cj.jdbc.Driver
            //connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode?serverTimezone=UTC","root","990808");
            connection=DriverManager.getConnection(url,user,password);
            statement=connection.createStatement();
            resultSet=statement.executeQuery("select ename,sal from emp ");
            while (resultSet.next()){
                String ename=resultSet.getString("ename");
                double sal=resultSet.getDouble("sal");
                System.out.println(ename+"       "+sal);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(resultSet!=null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                if (statement != null) {
                    try {
                        statement.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    if (connection != null) {
                        try {
                            connection.close();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
