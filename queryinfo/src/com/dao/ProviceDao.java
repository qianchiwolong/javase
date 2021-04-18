package com.dao;

import com.Province;

import java.sql.*;
import java.util.ResourceBundle;

//使用jdbc访问数据库
public class ProviceDao {
    public String queryProviceNameByid(Integer proviceID)
    {
        //jdbc6步
        Connection connection=null;
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        ResourceBundle resourceBundle=ResourceBundle.getBundle("ajaxjdbc");
        String driver=resourceBundle.getString("driver");
        String url=resourceBundle.getString("url");
        String user=resourceBundle.getString("user");
        String password=resourceBundle.getString("password");
        String sql="select name from province where id=?";
        String name="";
        try {
            Class.forName(driver);//com.mysql.cj.jdbc.Driver
            //connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode?serverTimezone=UTC","root","990808");
            connection= DriverManager.getConnection(url,user,password);
            statement=connection.prepareStatement(sql);
            statement.setInt(1,proviceID);
            resultSet=statement.executeQuery();
            while (resultSet.next()){//查询结果多余1条数据
               name=resultSet.getString("name");
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
        return name;
    }
    public Province queryProviceByid(Integer proviceID)
    {
        //jdbc6步
        Connection connection=null;
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        ResourceBundle resourceBundle=ResourceBundle.getBundle("ajaxjdbc");
        String driver=resourceBundle.getString("driver");
        String url=resourceBundle.getString("url");
        String user=resourceBundle.getString("user");
        String password=resourceBundle.getString("password");
        String sql="select id,name,jiancheng,shenghui from province where id=?";
        Province res=null;
        try {
            Class.forName(driver);//com.mysql.cj.jdbc.Driver
            //connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode?serverTimezone=UTC","root","990808");
            connection= DriverManager.getConnection(url,user,password);
            statement=connection.prepareStatement(sql);
            statement.setInt(1,proviceID);
            resultSet=statement.executeQuery();
            while (resultSet.next()){//查询结果多余1条数据
                res=new Province();
                res.setId(resultSet.getInt("id"));
                res.setName(resultSet.getString("name"));
                res.setJiancheng(resultSet.getString("jiancheng"));
                res.setShenghui(resultSet.getString("shenghui"));
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
        return res;
    }
}
