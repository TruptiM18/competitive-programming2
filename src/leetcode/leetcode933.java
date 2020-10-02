package leetcode;

import java.util.*;

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */

public class leetcode933 {
    private Queue<Integer> queue;
    private int size;

    public leetcode933() {
        this.queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);
        size++;
        while (queue.peek() < (t - 3000)) {
            queue.poll();
            size--;
        }
        return size;
    }
}
