package equalsoverset;

public class Pluss {
    public static void main(String[] args) {
        Student s1=new Student("张三",new Address("中国"));
        Student s2=new Student("张三",new Address("中国"));
        System.out.println(s1.equals(s2));
    }
}
class Student{
    private String name;
  private   Address addr;
    public  Student(){}
    public Student(String name,Address addr) {
        this.addr=addr;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==null||!(obj instanceof Student))return false;
        if(this==obj)return true;

        if(name.equals(((Student) obj).getName())&&addr.equals((Address)((Student) obj).getAddr()))return true;
        return false;
    }
}
class Address{
   private String zhuzhi;
   public Address(){}
    public Address(String zhuzhi) {
        this.zhuzhi = zhuzhi;
    }

    public String getZhuzhi() {
        return zhuzhi;
    }

    public void setZhuzhi(String zhuzhi) {
        this.zhuzhi = zhuzhi;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==null||!(obj instanceof Address))return false;
        if(this==obj)return true;
        if(zhuzhi.equals(((Address) obj).getZhuzhi()))return true;
        return false;
    }
}