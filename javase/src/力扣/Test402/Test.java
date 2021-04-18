package 力扣.Test402;

public class Test {
    public String removeKdigits(String num, int k) {
        //int num = Integer.parseInt(String.valueOf(ch));
        if(k>num.length()) return "0";
        char[] chars=num.toCharArray();
        int [] ints=new int[chars.length];
        for (int i=0;i<chars.length;i++)
        {
            if (Character.isDigit(chars[i]))// 判断是否是数字
                ints[i] = Integer.parseInt(String.valueOf(chars[i]));
        }
       return "";
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int a=0;
        int b=0;
        int d=1;
        while(l1!=null)
        {
         a=a*d+l1.val;
         l1=l1.next;
         d=d*10;
        }
        d=1;
        while(l2!=null)
        {
            b=b*d+l2.val;
            l2=l2.next;
            d=d*10;
        }
        Integer c=a+b;
        String str = c.toString();// 转化为字符串
        int[] intArray = new int[str.length()];// 新建一个数组用来保存num每一位的数字
        for (int i = 0; i < str.length(); i++) {
            // 遍历str将每一位数字添加如intArray
            Character ch = str.charAt(i);
            intArray[i] = Integer.parseInt(ch.toString());
        }
        ListNode res=new ListNode();
        for (int i=intArray.length-1;i>=0;i--)
        {
            res.next=new ListNode(intArray[i],new ListNode(intArray[i--]));
        }
      return res.next;
    }


    public static void main(String[] args) {
        Test a=new Test();
        ListNode b=new ListNode(2);
        b.next=new ListNode(4);
        b.next.next=new ListNode(5);
        ListNode c=new ListNode(5);
        c.next=new ListNode(4);
        c.next.next=new ListNode(2);
       ListNode A= a.addTwoNumbers(b,c);
        while(A!=null)
        {
            System.out.println(A.val);
            A=A.next;
        }

    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val;}
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
