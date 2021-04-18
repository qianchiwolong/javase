package JDBC.JDBC.src.usertest;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static boolean login(Map<String, String> userloginInfo) {
        boolean a=false;
        Connection conn=null;
        Statement stat=null;
        ResultSet re=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode?serverTimezone=UTC","root","990808");
            stat=conn.createStatement();
            re=stat.executeQuery("select username,password from t_user");
            while (re.next()){
                String username=re.getString("username");
                String password=re.getString("password");
                if (username.equals(userloginInfo.get("loginname"))&&password.equals(userloginInfo.get("loginpwd"))){a=true;return a;}
                else a=false;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (re != null) {
                try {
                    re.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                if (stat != null) {
                    try {
                        stat.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    if (conn != null) {
                        try {
                            conn.close();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        return a;
    }

    public static Map<String, String> initUi() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("用户名：  ");
        String username=scanner.nextLine();
        System.out.println("密码：    ");
        String password=scanner.nextLine();
        Map<String,String> userlogInfo=new HashMap<>();
        userlogInfo.put("loginname",username);
        userlogInfo.put("loginpwd",password);
        scanner.close();
        return userlogInfo;
    }
    public static void main(String[] args) {
        Map<String,String> userloginInfo=initUi();
        boolean loginsucces=login(userloginInfo);
        System.out.println(loginsucces?"登陆成功":"登录失败用户名或密码错误");
    }
}
