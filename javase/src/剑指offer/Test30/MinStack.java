package 剑指offer.Test30;


import java.util.Stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
 *
 *
 *
 * 示例:
 *
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.min();   --> 返回 -3.
 * minStack.pop();
 * minStack.top();      --> 返回 0.
 * minStack.min();   --> 返回 -2.
 *
 *
 *
 * 提示：
 *
 *     各函数的调用总次数不超过 20000 次

 * */
public class MinStack {
    int[] stack=new int[2000];
    int[] stack1=new int[2000];
    private int index=-1;
    private int index1=0;

    public MinStack() {

    }

    public void push(int x) {
     index++;
     stack[index]=x;
     if (stack[index]<stack1[index1]){
         stack1[index1]=stack[index];
         index1++;
     }
    }

    public void pop() {
        index--;
        if (stack1[index1--]==stack[index])
        {
            index1--;
        }
    }

    public int top() {
     return stack[index];
    }

    public int min() {
        if (index1>=1) return stack1[index1-1];
        else return stack1[index1];
    }

  /*  Stack<Integer> A, B;
    public MinStack() {
        A = new Stack<>();
        B = new Stack<>();
    }
    public void push(int x) {
        A.add(x);
        if(B.empty() || B.peek() >= x)
            B.add(x);
    }
    public void pop() {
        if(A.pop().equals(B.peek()))
            B.pop();
    }
    public int top() {
        return A.peek();
    }
    public int min() {
        return B.peek();
    }
*/
    public static void main(String[] args) {
        MinStack stack=new MinStack();

        stack.push(-3);
        stack.push(-3);
        stack.push(-3);
        stack.push(16);
        stack.push(10);
        stack.push(-10);


        System.out.println(stack.min());
        stack.pop();
        stack.pop();
        System.out.println(stack.min());



    }
}
