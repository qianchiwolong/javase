package 力扣.test680;

/**
 * @Author 陈豪
 * @Date 2021/5/13 19:27
 * @Version 1.0
 */

public class Test {
    public boolean validPalindrome(String s) {
        int first=0,last=s.length()-1;
        while (first<=last){
            if (s.charAt(first)==s.charAt(last)){
                first++;
                last--;
            }else {
             return check(s,first+1,last)||check(s,first,last-1);
            }
        }
        return true;
    }

    private boolean check(String s,int first,int last){
        while (first<=last){
            if (s.charAt(first)==s.charAt(last)){
                first++;
                last--;
            }else return false;
        }

        return true;
    }


    public static void main(String[] args) {
        /*
        fxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxf
        * */
        Test test=new Test();
        System.out.println(test.validPalindrome(""));
    }
}
