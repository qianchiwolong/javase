package RandonTest;
/*
* 编写一个程序产生5个不重复的随机数，如果重复重新生成
* 吧这5个数存入以个数组中
* */
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
       int[] array=new int[5];
       //array[0]=producerandom();
       for (int i=0;i<array.length;i++)
       {
          array[i]=-1;
          // array[i]=producerandom();
           /*for (int j=array.length-1;j>0;j--)
           {
               if(array[j]==array[j-1]){
                   array[j-1]=producerandom();
               }*/

           }

       for (int i=0;i<array.length;)
       {
           int num=producerandom();
           if(!find(array,num)){
               array[i]=num;
               i++;
           }
       }

       /*for (int i=0;i<array.length;i++)
           for (int j=1;j<i;j++)
           {
               if(array[i]==array[j]){
                   array[j]=producerandom();
           }*/

       for (int i=0;i<array.length;i++){
           System.out.println(array[i]);
       }
    }

    public static int producerandom(){
        Random random=new Random();
        return   random.nextInt(6);
    }
    public  static boolean find(int[] a,int key)
    {
       // Arrays.sort(a);
       //return Arrays.binarySearch(a,key)>0;
        for (int i=0;i<a.length;i++)
        {
            if(a[i]==key)return true;
        }
        return false;
    }
}
