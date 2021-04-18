package 剑指offer.Test06;
/**输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 示例 1：

 输入：head = [1,3,2]
 输出：[2,3,1]
 */
public class Test {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
        public static int[] reversePrint(ListNode head) {
            int length=0;
            ListNode temp1=head;
            while (temp1!=null)
            {
                length++;
                temp1=temp1.next;
            }
            int res[]=new int[length];
            ListNode temp=head;
            for (int i=res.length-1;i>=0;i--)
            {
                res[i]=temp.val;
                temp=temp.next;
            }
            return res;

            //解法2利用栈来反转
        }

    public static void main(String[] args) {
        ListNode a=new ListNode(1);
//        a.next=
        ListNode b= new ListNode(2);
        a.next=b;
        b.next=new ListNode(3);
        for (int i=0;i<reversePrint(a).length;i++)
        {
            System.out.println(reversePrint(a)[i]);
        }
    }

}
class ListNode {
         int val;
        ListNode next;
         ListNode(int x) { val = x; }
      }