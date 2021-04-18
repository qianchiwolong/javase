package 剑指offer.Test25;
/*
* 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。

示例1：

输入：1->2->4, 1->3->4
输出：1->1->2->3->4->4
* */
public class Test {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
     if (l1==null) return l2;
     if (l2==null) return l1;
     ListNode newhead=new ListNode(0);
     ListNode temp=newhead;
     ListNode first=l1;
     ListNode last=l2;

     while (first==null&&last==null)
     {
         if (first.val<=last.val){
             temp.next=first;
             first=first.next;
             temp=temp.next;
         }else {
             temp.next=last;
             last=last.next;
             temp=temp.next;

         }
     }
     if (first!=null) temp.next=first;
     if (last!=null)temp.next=last;
     return newhead.next;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}