package IOLiu.FileCopy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        FileOutputStream fil=null;//写文件
        FileInputStream fos=null;//读文件
        byte[] b=new byte[1024];
        try {
            fos=new FileInputStream("E:\\STEAM\\steamapps\\workshop\\content\\431960\\1801562091\\眷思量1.mp4");
            fil=new FileOutputStream("E:/眷思量1.mp4");
            try {
                fil.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
            int re=0;
            try {
                if((re=fos.read(b))==-1)
                {
                fos.read(b);
                fil.write(b,0,re);}
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
