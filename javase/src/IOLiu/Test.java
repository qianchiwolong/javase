package IOLiu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
     FileInputStream fil=null;
        try {
            fil=new FileInputStream("E:\\io流测试文件\\lj.txt");
//             int readDate =0;
//            while ((readDate=fil.read())!=-1)
//            {
//                System.out.println(readDate);
//            }
//            byte [] b=new byte[4];
//            while (true){
//                int re=fil.read(b);
//                if (re==-1) {
//                   break;
//                }
//                System.out.print(new String(b,0,re));
//            }
            byte [] b=new byte[4];
            int  re=0;
            while ((re=fil.read(b))!=-1){

                System.out.print(new String(b, 0, re));
            }
            //上面的方法不能再简化去除re如果去除就会掉两次read方法导致索引越界
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fil != null) {
                try {
                    fil.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
