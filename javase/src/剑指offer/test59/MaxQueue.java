package 剑指offer.test59;

import 剑指offer.Test10.Solution;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author 陈豪
 * @Date 2021/4/22 22:40
 * @Version 1.0
 */

class MaxQueue {
    Queue<Integer> queue;
    Deque<Integer> max;

    public MaxQueue() {
        queue = new LinkedList<Integer>();
        max = new LinkedList<Integer>();
    }

    public int max_value() {
        if (max.isEmpty()) {
            return -1;
        }
        return max.peekFirst();
    }

    public void push_back(int value) {
        while (!max.isEmpty() && max.peekLast() < value) {
            max.pollLast();
        }
        max.offerLast(value);
        queue.offer(value);
    }

    public int pop_front() {
        if (queue.isEmpty()) {
            return -1;
        }
        int res = queue.poll();
        if (res == max.peekFirst()) {
            max.pollFirst();
        }
        return res;
    }

}