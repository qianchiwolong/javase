package 剑指offer.Test09;
/**
 *用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
 * 分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 * 示例 1：
 *
 * 输入：
 * ["CQueue","appendTail","deleteHead","deleteHead"]
 * [[],[3],[],[]]
 * 输出：[null,null,3,-1]
 *
 * 示例 2：
 *
 * 输入：
 * ["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
 * [[],[],[5],[2],[],[]]
 * 输出：[null,-1,null,null,5,2] */

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 *
 *
 1 <= values <= 10000
 最多会对 appendTail、deleteHead 进行 10000 次调用

 */
public class CQueue {
   /* Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();
    public CQueue() {
    }


    public void appendTail(int value) {
        stack1.push(value);

    }

    public int deleteHead() {
        if (stack1.isEmpty()) return -1;
        while (!stack1.isEmpty())
        {
            stack2.push(stack1.pop());
        }
    int res= stack2.pop();
        while (!stack2.isEmpty())
        {
            stack1.push(stack2.pop());
        }
        return res;
    }*/
    Deque<Integer> stack1;
    Deque<Integer> stack2;

    public CQueue() {
        stack1 = new LinkedList<Integer>();
        stack2 = new LinkedList<Integer>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        // 如果第二个栈为空
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            return -1;
        } else {
            int deleteItem = stack2.pop();
            return deleteItem;
        }
    }


    public static void main(String[] args) {
        CQueue queue=new CQueue();
        queue.appendTail(1);
        queue.appendTail(9);
        queue.appendTail(3);
        System.out.println(queue.deleteHead());
        queue.appendTail(4);
        queue.appendTail(5);
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());
    }
}
