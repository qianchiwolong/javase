package 剑指offer.Test52;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
* 输入两个链表，找出它们的第一个公共节点。

如下面的两个链表：

在节点 c1 开始相交。
示例 1：

输入：intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
输出：Reference of the node with value = 8
输入解释：相交节点的值为 8 （注意，如果两个列表相交则不能为 0）。
* 从各自的表头开始算起，链表 A 为 [4,1,8,4,5]，链表 B 为 [5,0,1,8,4,5]。在 A 中，相交节点前有 2 个节点；在 B 中，相交节点前有 3 个节点。
*/
public class Test {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        /*if (headA==null||headB==null){return null;}
        ListNode temp2=headB;
        ListNode res=null;
        while (temp2!=null) {
            ListNode temp=headA;
            while (temp.next != null && temp!= temp2) {
                temp = temp.next;
            }
            res=temp;
            if (temp == temp2) {
                return res;
            }
            temp2=temp2.next;

        }
        return null;*/
       /* if (headA==null||headB==null){return null;}
        Set<Integer> set=new HashSet<>();
        ListNode temp1=headA;
        ListNode temp2=headB;
        while (temp1.next!=null){
            set.add(temp1.val);
            temp1=temp1.next;
        }
        while (temp2.next!=null){
            if (set.contains(temp2.val)) return temp2.next;
            temp2=temp2.next;
        }
        return null;*/
        Set<ListNode> set = new HashSet<>();
        //先把链表A的结点全部存放到集合set中
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }

        //然后访问链表B的结点，判断集合中是否包含链表B的结点，如果包含就直接返回
        while (headB != null) {
            if (set.contains(headB))
                return headB;
            headB = headB.next;
        }
        //如果集合set不包含链表B的任何一个结点，说明他们没有交点，直接返回null
        return null;

    }
} 
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }