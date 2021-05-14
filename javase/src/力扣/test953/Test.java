package 力扣.test953;

/**
 * @Author 陈豪
 * @Date 2021/5/14 14:01
 * @Version 1.0
 */

public class Test {
   /* public boolean isAlienSorted(String[] words, String order) {
        for (int i = 0; i <words.length-1 ; i++) {
            if (!check(words[i],words[i+1],order)) return false;
        }
        return true;
    }



    private boolean check(String first,String last,String orde){
        for (int i = 0; i <first.length()-1 ; i++) {
            if (checkword(first.charAt(i),orde)>checkword(first.charAt(i+1),orde))return false;
        }
        for (int i = 0; i <last.length()-1; i++) {
            if (checkword(last.charAt(i),orde)>checkword(last.charAt(i+1),orde)) return false;
        }

        if (checkword(first.charAt(first.length()-1),orde)>checkword(last.charAt(last.length()-1),orde))return false;
        return true;
    }

    private int checkword(char c,String orde){
        for (int i = 0; i <orde.length() ; i++) {
            if (c==orde.charAt(i)) return i;
        }
        return -1;
    }*/  //理解错了是所有的  次方法有改善之处可以保留前一次在字order中查询的结果减少遍历
/*   public boolean isAlienSorted(String[] words, String order){
       for (int i = 0; i <words.length-1 ; i++) {
           String first=words[i];
           String last=words[i+1];
           if (first.length()<last.length()) continue;
           if (first.length()==last.length()) {
           for (int j = 0; j <last.length() ; j++) {
               if (first.charAt(j)==last.charAt(j)) continue;
               else {
                   int fi=checkword(first.charAt(j),order);
                   int la=checkword(last.charAt(j),order);
                   if (fi<la) continue;
                   else return false;
                }
              }
           }

       }
       return true;
   }

    private int checkword(char c,String orde){
        for (int i = 0; i <orde.length() ; i++) {
            if (c==orde.charAt(i)) return i;
        }
        return -1;
    }*/
   public boolean isAlienSorted(String[] words, String order) {
       int[] arr  = new int[26];
       for(int i=0;i<order.length();i++){
           arr[order.charAt(i)-'a']=i;
       }
       for(int i=0;i<words.length-1;i++){
           boolean flag = false;
           for(int j = 0;j<Math.min(words[i].length(),words[i+1].length());j++){
               if(arr[words[i].charAt(j)-'a']==arr[words[i+1].charAt(j)-'a']){
                   continue;
               }
               if(arr[words[i].charAt(j)-'a']>arr[words[i+1].charAt(j)-'a']){
                   return false;
               }else{
                   flag=true;
                   break;
               }
           }
           if(words[i].length()>words[i+1].length()&&!flag){
               return false;
           }
       }
       return true;
   }

    public static void main(String[] args) {
        Test test=new Test();
        String[] words={"apple","app"};
        String oreder="abcdefghijklmnopqrstuvwxyz";
        System.out.println(test.isAlienSorted(words,oreder));
    }
}
