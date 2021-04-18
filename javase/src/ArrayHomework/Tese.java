package ArrayHomework;

public class Tese {
    public static void main(String[] args) {
        ArrayMoFang zhan=new ArrayMoFang();
        try {
            for(int i=0;i<152;i++)
            zhan.pish("ss");
        } catch (ArrayExcept arrayExcept) {
           arrayExcept.printStackTrace();
           // System.out.println(arrayExcept.getMessage());
        }
        try {
            zhan.pop();
        } catch (ArrayExcept arrayExcept) {
            arrayExcept.printStackTrace();
        }
    }
}
