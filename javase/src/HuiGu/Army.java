package HuiGu;



public class Army {


    private  WuQi[] armies;

    /*public Army(Army[] armies) {
        this.armies = armies;
    }*/
    public Army(int i){
        armies=new WuQi[i];
    }

    /**
     *
     * @param a
     * @throws WuQiExcept
     */
    public void WuQiadd(WuQi a) throws WuQiExcept {

        for (int i=0;i<armies.length;i++)
        {
            if (null==armies[i])
            {
                armies[i]=a;
                System.out.println(a+"添加成功");
                return;
            }

        }
       throw new WuQiExcept("武器库已满");

    }
  public void shoot(){
        for (int i=0;i<armies.length;i++)
        {
            if(armies[i] instanceof Shootable)
            ((Shootable) armies[i]).shoot();
        }
  }
  public void move(){
      for (int i=0;i<armies.length;i++)
      {
          if(armies[i] instanceof Moveable)
              ((Moveable) armies[i]).move();
      }
  }
}
