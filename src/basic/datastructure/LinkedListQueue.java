package basic.datastructure;

import java.util.LinkedList;

public class LinkedListQueue {

    /**
     * 선입선출
     */

    public void processQueue() {
        LinkedList<String> queue = new LinkedList<String>();

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");
        queue.offer("E");

        System.out.println("### Queue size :: " + queue.size());

        while (queue.peek() != null) {
            System.out.println(queue.poll());
        }

        System.out.println("### Queue size :: " + queue.size());

    }

    public static void main(String[] args) {
        new LinkedListQueue().processQueue();
    }

}
