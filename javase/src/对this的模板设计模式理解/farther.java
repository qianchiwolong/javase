package 对this的模板设计模式理解;

public class farther {
    public void server(String mthod){
      if ("put".equals(mthod)){
          this.doput();
      }else if("dopost".equals(mthod)){
          this.dppost();
      }
    }
    public void doput(){
        System.out.println("farther   doput");
    }
    public void dppost(){
        System.out.println("farther     dopost");
    }
}
