package JDBC.JDBC.src.usertest;

import java.util.Map;
import java.util.Scanner;

public class Test03 {

    public static void main(String[] args) {

        System.out.println("请选择功能");
        System.out.println("1用户登录");
        System.out.println("2用户注册");
        Scanner s=new Scanner(System.in);
        int i=s.nextInt();

        switch (i){
            case 1:  {
             Map<String,String> userloginInfo=Test.initUi();
                boolean loginsucces=Test.login(userloginInfo);
                System.out.println(loginsucces?"登陆成功":"登录失败用户名或密码错误");} break;
            case 2: {
                System.out.println("请输入用户名");
                String lj=s.nextLine();
                String newusername=s.nextLine();//吸收换行符
                System.out.println("请输入密码");
                String newpasswoed=s.nextLine();
                 boolean b=  Test02.adduser(newusername,newpasswoed);
                System.out.println(b?"注册成功":"注册失败");
            }break;
        }
    }
}
