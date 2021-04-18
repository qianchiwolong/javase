package 剑指offer.Test31;

import java.util.Stack;

/**输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如，序列 {1,2,3,4,5} 是某栈的压栈序列，序列 {4,5,3,2,1}
 * 是该压栈序列对应的一个弹出序列，但 {4,3,5,1,2} 就不可能是该压栈序列的弹出序列。



 示例 1：

 输入：pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
 输出：true
 解释：我们可以按以下顺序执行：
 push(1), push(2), push(3), push(4), pop() -> 4,
 push(5), pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1

 示例 2：

 输入：pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
 输出：false
 解释：1 不能在 2 之前弹出。
  * */
public class Test {
    public boolean validateStackSequences1(int[] pushed, int[] popped) {
        int i = 0, j = 0;
        for (int e : pushed) {
            pushed[i] = e;
            while (i >= 0 && pushed[i] == popped[j]) {
                j++;
                i--;
            }
            i++;
        }
        return i == 0;
    }
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack=new Stack<>();
        int index1=0;
        int index2=0;

        while (index1<pushed.length){

            stack.push(pushed[index1]);
            while (!stack.isEmpty()&&stack.peek()==popped[index2]){//判断栈顶元素是不是popped数组的索引处元素如果是则弹栈，并且检查下一个元素是不是还和栈顶元素相同
                stack.pop();
                index2++;
            }
            index1++;
        }
        return stack.isEmpty();//如果最后栈空了说明popped数组符合弹栈的顺序
}

    public static void main(String[] args) {
        int[]  a={1,2,3,4,5};
        int[]  b={4,5,3,2,1};
        int[]  c={4,5,3,1,2};
        int[]  d={3,5,4,2,1};
        System.out.println(validateStackSequences(a,c));
    }
}
