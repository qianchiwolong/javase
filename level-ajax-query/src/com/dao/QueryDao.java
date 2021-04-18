package com.dao;

import com.entity.City;
import com.entity.Province;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class QueryDao {
    //查询所有省份信息
    public List<Province> querypro(){
        List<Province> list=new ArrayList<>();
        Connection connection=null;
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        ResourceBundle resourceBundle=ResourceBundle.getBundle("leveljdbc");
        String driver=resourceBundle.getString("driver");
        String url=resourceBundle.getString("url");
        String user=resourceBundle.getString("user");
        String password=resourceBundle.getString("password");
        String sql="select * from province order by id";

        try {
            Class.forName(driver);//com.mysql.cj.jdbc.Driver
            //connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode?serverTimezone=UTC","root","990808");
            connection= DriverManager.getConnection(url,user,password);
            statement=connection.prepareStatement(sql);
            resultSet=statement.executeQuery();
            while (resultSet.next()){//查询结果多余1条数据
                Province res=null;
                res=new Province();
                res.setId(resultSet.getInt("id"));
                res.setName(resultSet.getString("name"));
                res.setJiancheng(resultSet.getString("jiancheng"));
                res.setShenghui(resultSet.getString("shenghui"));
                list.add(res);
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
        return list;
    }
    //通过id来获取省份下面的城市
    public List<City> querycity(Integer proid){
        List<City> list=new ArrayList<>();
        Connection connection=null;
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        ResourceBundle resourceBundle=ResourceBundle.getBundle("leveljdbc");
        String driver=resourceBundle.getString("driver");
        String url=resourceBundle.getString("url");
        String user=resourceBundle.getString("user");
        String password=resourceBundle.getString("password");
        String sql="select id,name from city where provinceid=?";

        try {
            Class.forName(driver);//com.mysql.cj.jdbc.Driver
            //connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode?serverTimezone=UTC","root","990808");
            connection= DriverManager.getConnection(url,user,password);
            statement=connection.prepareStatement(sql);
            statement.setInt(1,proid);
            resultSet=statement.executeQuery();
            while (resultSet.next()){//查询结果多余1条数据
                City res=null;
                res=new City();
                res.setId(resultSet.getInt("id"));
                res.setName(resultSet.getString("name"));
                res.setProid(resultSet.getInt("provinceid"));
                list.add(res);
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
        return list;
    }
}
