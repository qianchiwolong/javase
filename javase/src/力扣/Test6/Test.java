package 力扣.Test6;

import java.util.HashMap;

public class Test {
    public String convert(String s, int numRows) {
//        StringBuffer sb1=new StringBuffer();
//        StringBuffer sb2=new StringBuffer();
//        StringBuffer sb3=new StringBuffer();
//        String result=null;
//        int index=0;
//
//        char[] ch=s.toCharArray();
//        while (index<ch.length)
//        {
//            if(index==0||0==index%(numRows+1)) sb1.append(ch[index]);
//            else if(index==1||index==index+(numRows-1)) sb3.append(ch[index]);
//                  else sb2.append(ch[index]);
//            index++;
//        }
//        result=sb1.toString()+sb2.toString()+sb3.toString();
//        return result;
        /**
         * L     D     R
         * E   O E   I I
         * E C   I H   N
         * T     S     G
         */
        if (s.length() <= numRows || numRows < 2) {
            return s;
        }

        char[] chars = new char[s.length()];
        int k = 0;
        for (int i = 0; i < numRows; i++)
        {
            if (i == 0 || i == numRows - 1) {
                int j = i;
                while (j < s.length()) {
                    chars[k++] = s.charAt(j);
                    j = j + 2 * numRows - 2;//两峰值元素的间隔距离为（2*行数-2）
                }
            } else {
                int j = i;
                boolean po = true;
                while (j < s.length())
                {
                    if (po == true) {
                        chars[k++] = s.charAt(j);
                        j = j + 2 * numRows-2-2 * i;
                        po = false;
                    } else {
                        chars[k++] = s.charAt(j);
                        j = j + 2 * i;
                        po = true;
                    }
                }
            }
        }

        return String.valueOf(chars);
    }

}
