package 剑指offer.Test18;
/**给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。

 返回删除后的链表的头节点。*/

public class Test {
    public ListNode deleteNode(ListNode head, int val) {

      if(head.val==val) return head.next;
       ListNode temp=head;

        while (temp.next!=null)
        {
            if (temp.next.val==val)
            {
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
        }
         return head;
    }

}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
  }