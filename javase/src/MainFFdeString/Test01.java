package MainFFdeString;

public class Test01 {
    public static void main(String[] args) {
        if(args.length!=2){
            System.out.println("使用程序时请设置启动参数列入");
            System.out.println("用户名：张三   密码：151516");
            return;
        }
        if("asd".equals(args[0])&&"123456".equals(args[1])){
            System.out.println("登录成功");
            System.out.println("欢迎"+args[0]+"回家");
        }
        else System.out.println("用户名或密码输入错误");

    }
}
