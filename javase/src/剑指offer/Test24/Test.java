package 剑指offer.Test24;
/*链表反转*/
public class Test {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) { return head; }
        ListNode cur=head;
        ListNode next=null;
        ListNode rehead=new ListNode(0);
        while (cur!=null)
        {
            next=cur.next;
            /*cur.next = reverseHead.next;//将 cur 的下一个节点指向新的链表的最前端
            reverseHead.next = cur; //将 cur 连接到新的链表上 cur = next;//让 cur 后移*/
            cur.next=rehead.next;
            rehead.next=cur;
            cur=next;
        }
        return rehead.next;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}