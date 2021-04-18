

package 剑指offer.Test35;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author 陈豪
 * @Date 2021/2/9 8:25
 * @Version 1.0
 */
/*
* 请实现 copyRandomList 函数，复制一个复杂链表。在复杂链表中，
* 每个节点除了有一个 next 指针指向下一个节点，还有一个 random 指针指向链表中的任意节点或者 null。

*/
public class Test {
   /* Map<Node,Node> map=new HashMap<>();
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        Node renode=copy(head);
        Node temp=renode;
        while (temp!=null&& !map.isEmpty()){
            temp.random=map.get(temp);
            temp=temp.next;
        }

        return renode;
    }

    public   Node copy(Node head){
        Node rehead=new Node(head.val);
        Node temp=rehead;
        while (head.next!=null){
            map.put(head,head.random);
            head=head.next;
            temp.next=new Node(head.val);
            temp=temp.next;
        }
       *//* do {
            map.put(head,head.random);
            head=head.next;
            temp.next=new Node(head.val);
            temp=temp.next;
        }while (head.next!=null);*//*
        return rehead;
    }*/

       public Node copyRandomList(Node head) {
           if(head == null) return null;
           Node cur = head;
           Map<Node, Node> map = new HashMap<>();
           // 3. 复制各节点，并建立 “原节点 -> 新节点” 的 Map 映射
           while(cur != null) {
               map.put(cur, new Node(cur.val));
               cur = cur.next;
           }
           cur = head;
           // 4. 构建新链表的 next 和 random 指向
           while(cur != null) {
               map.get(cur).next = map.get(cur.next);
               map.get(cur).random = map.get(cur.random);
               cur = cur.next;
           }
           // 5. 返回新链表的头节点
           return map.get(head);
       }



    public static void main(String[] args) {
        Test test=new Test();
        Node head=new Node(1);
        Node head1=new Node(2);
        Node head2=new Node(3);
        head.next=head1;
        head1.next=head2;
        head.random=null;
        head1.random=head;
        head2.random=head;
        test.copyRandomList(head);

    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}




