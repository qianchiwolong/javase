package 力扣.test1518;

/**
 * @Author 陈豪
 * @Date 2021/5/10 11:13
 * @Version 1.0
 */

public class Test {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int res=numBottles;
        while (true){
            int temp=numBottles/numExchange;
            res+=temp;
            numBottles=numBottles%numExchange+temp;
            if (numBottles<numExchange) break;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(numWaterBottles(15,4));
    }
}
