package jzoffer;

import java.util.Stack;

/**
 * @author dingshuangen
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */
class Stack2Queue {

    /**
     * 入队栈
     */
    private Stack<Integer> stack1;
    /**
     * 出队栈
     */
    private Stack<Integer> stack2;

    public Stack2Queue() {
        stack1 = new Stack<>();;
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        stack1.push(value);
    }

    public int deleteHead() {

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            return -1;
        }

        return stack2.pop();
    }
}