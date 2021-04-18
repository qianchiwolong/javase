package 剑指offer.Test67;

/**
 * @Author 陈豪
 * @Date 2021/2/9 12:49
 * @Version 1.0
 */

public class Test {
    public static int strToInt(String str) {
        String s=str.trim();
        if (s.length()==0) return 0;
        if (!(s.charAt(0)!='+'||s.charAt(0)!='-'||(s.charAt(0)<='9'&&s.charAt(0)>='0'))) return 0;
        char[] chars=s.toCharArray();
        boolean flag=true;
        int index=0;
        if (chars[index]=='+') index++;
        else if (chars[index]=='-'){
            index++;
            flag=false;
        }
        int res=0;
        while (index<chars.length){
            if (chars[index]<='9'&&chars[index]>='0') {
                res =res * 10 + (chars[index]-'0');
                if (flag){
                    if (res > Integer.MAX_VALUE / 10 && (res == Integer.MAX_VALUE / 10 && (chars[index]-'0') > Integer.MAX_VALUE % 10)) {
                        System.out.println(res > Integer.MAX_VALUE / 10 );
                        System.out.println(res == Integer.MAX_VALUE / 10 && (chars[index]-'0') > Integer.MAX_VALUE % 10);

                        return Integer.MAX_VALUE;
                }}
                else if (-res < Integer.MIN_VALUE / 10 && (-res == Integer.MIN_VALUE / 10 && (chars[index] - '0') > -(Integer.MIN_VALUE % 10))) {
                    return Integer.MIN_VALUE;
                }
                index++;
            }else break;
        }
        return flag?res:-res;
    }


    public static void main(String[] args) {
        System.out.println(strToInt("2147483649"));

    }
}
