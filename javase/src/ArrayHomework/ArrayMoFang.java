package ArrayHomework;

public class ArrayMoFang {
  /*  int inder;
    Object [] element=new Object[10];
    public ArrayMoFang(){}
    public void push(Object obj){
        for( inder=0;inder<element.length;inder++)
        {
        element[inder]=obj;
        }
        if(inder==element.length-1){
            System.out.println("此栈已满");
        }
    }
    public void pop(){
        element[inder]==null;
    }

    public static void main(String[] args) {

       ArrayMoFang a=new ArrayMoFang();
       a.push((向下转型);
    }
*/
    private Object[] elements;
    private int index;

    public ArrayMoFang() {
        //一维数组初始化
        this.elements=new Object[10];
        this.index=-1;
    }
public void pish(Object obj) throws ArrayExcept {
        if(this.index>=elements.length-1){
           // System.out.println("栈已满");
           // return;
            throw new ArrayExcept("栈满");
        }
        this.index++;
        this.elements[index]=obj;
    System.out.println("压栈"+obj+"元素成功栈帧指向"+index);
}
public Object pop() throws ArrayExcept {
        if(index<=-1){
           //System.out.println("弹栈失败栈以空");
            //return null;
            throw new ArrayExcept("栈空");
        }
    System.out.println("弹栈成功");
        index--;
    System.out.println("元素"+elements[index+1]+"以弹出，栈帧指向"+index);
    return null;
}
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }
}
