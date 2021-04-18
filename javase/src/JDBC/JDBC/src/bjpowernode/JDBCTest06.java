package JDBC.JDBC.src.bjpowernode;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
    模拟实现用户登录功能
 */
public class JDBCTest06 {
    public static void main(String[] args) {
        // 初始化界面
        Map<String,String> userLoginInfo = initUI();
        // 验证用户名和密码
        boolean loginSuccess = login(userLoginInfo);
        // 输出最后结果
        System.out.println(loginSuccess ? "登录成功" : "登录失败");
    }

    /**
     * 用户登录
     * @param userLoginInfo 用户登录信息
     * @return true表示登录成功，false表示登录失败
     */
    private static boolean login(Map<String, String> userLoginInfo) {
        boolean loginSuccess = false;
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // 1、注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2、获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","146");
            // 3、获取数据库操作对象
            stmt = conn.createStatement();
            // 4、执行sql语句
            String sql = "select * from t_user where userName = '"+ userLoginInfo.get("userName")+ "' and userPassword = '" + userLoginInfo.get("userPassword")+ "'";
            rs = stmt.executeQuery(sql);
            // 5、处理结果集
            if(rs.next()) {
                loginSuccess = true;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            // 6、释放资源
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return loginSuccess;
    }


    /**
     * 初试化界面
     * @return 用户输入的用户名和密码等登录信息
     */
    private static Map<String, String> initUI() {
        Scanner s = new Scanner(System.in);

        System.out.print("请输入用户:");
        String userName = s.nextLine();
        System.out.print("请输入密码:");
        String userPassword = s.nextLine();

        Map<String,String> userLoginInfo = new HashMap<>();
        userLoginInfo.put("userName",userName);
        userLoginInfo.put("userPassword",userPassword);

        return userLoginInfo;
    }
}
