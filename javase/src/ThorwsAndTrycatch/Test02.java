package ThorwsAndTrycatch;
/*
* java 语法规则方法体中的语句逐条执行遇到return必须退出方法体
* 所以此时fun方法返回的是100而不是对照输出语句那样先加一再返回
* return一定是最后执行的
* */
public class Test02
{
    public static void main(String[] args) {
        System.out.println(fun());
    }
    private static int fun()
    {int i=100;
        try {
            System.out.println("try....");
            return i;
        }finally {
            System.out.println("finaiiy....");
            ++i;
            //i++;
        }
    }
}
