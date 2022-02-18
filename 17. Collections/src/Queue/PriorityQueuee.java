package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuee {
    public static void main(String[] args) {
        Queue<Integer> pQueue = new PriorityQueue<Integer>();

        pQueue.add(3);
        pQueue.add(8);
        pQueue.add(9);

        pQueue.add(10);
        pQueue.add(82);

        pQueue.add(30);
        pQueue.add(33);
        pQueue.add(22);

        System.out.println(pQueue);

        // Retrieve
        // Peek -> Top element
        System.out.println(" Top Of The Queue: " + pQueue.peek());

        // Delete
        // Poll
        System.out.println("Deleted element" + pQueue.poll());

        // It prints in the sequence the queue was added
        System.out.println(" Object situation: " + pQueue);

        // Right way to get priority queue
        System.out.println("Priority Queues after delete are:");
        while (!pQueue.isEmpty()) {
            System.out.println(pQueue.poll());
        }
    }

}
