package 细节之处.Test;

import ArrayHomework.ArrayExcept;

import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
        String s="{ ( [ ])}";
        Test02 zhan=new Test02();
        zhan.isValid(s);
    }
    public boolean isValid(String s) {
     Test02 zhan=new Test02();

       for (int i=0;i<s.length();i++)
           if (s.charAt(i)=='{'||s.charAt(i)=='}'||s.charAt(i)=='['||s.charAt(i)==']'||s.charAt(i)=='('||s.charAt(i)==')')
           {
               try {
                   zhan.pish(s.charAt(i));
               } catch (ArrayExcept arrayExcept) {
                   arrayExcept.printStackTrace();
               }

           }

   return false;
    }
    private Object[] elements;
    private int index=-1;


    public void pish(Object obj) throws ArrayExcept {
        if(this.index>=elements.length-1){
            // System.out.println("栈已满");
            // return;
            throw new ArrayExcept("栈满");
        }
        this.index++;
        this.elements[index]=obj;
    }
    public Object pop() throws ArrayExcept {
        if(index<=-1){
            //System.out.println("弹栈失败栈以空");
            //return null;
            throw new ArrayExcept("栈空");
        }
        index--;
        return null;
    }

}
