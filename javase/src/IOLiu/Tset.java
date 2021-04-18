package IOLiu;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Tset {
    public static void main(String[] args) {
        FileOutputStream fil=null;
        try {
            fil=new FileOutputStream("E:\\io流测试文件\\lj.txt",true);
            String S="侯弟弟";
            byte[] a=S.getBytes();
            fil.write(a);
            fil.flush();
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
