package 力扣.test155;

import java.util.Stack;

/**
 * @Author 陈豪
 * @Date 2021/4/6 13:51
 * @Version 1.0
 */

public class MinStack {
   Stack<Integer> stack;
   Stack<Integer> min;

    public MinStack() {
      stack=new Stack<>();
      min=new Stack<>();
      min.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
        stack.push(val);
        int temp=min.peek()<val?min.peek():val;
        min.push(temp);
    }

    public void pop() {
            stack.pop();
            min.pop();

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }

}
