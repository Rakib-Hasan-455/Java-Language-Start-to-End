package Queue;

import java.util.ArrayList;

public class Queuee {
    ArrayList<Integer> queue = new ArrayList<>();
    public static void main(String[] args) {
        Queuee queuee = new Queuee();
        // Create
        queuee.enQueue(10);
        queuee.enQueue(20);
        queuee.enQueue(13);
        queuee.enQueue(9);
        // Delete
        queuee.deQueue();
        // Retrive
        while (queuee.queue.size() != 0) {
            System.out.println(queuee.deQueue());
        }
    }

    public Integer enQueue(Integer x) {
        queue.add(x);
        return x;
    }

    public Integer deQueue() {
        if(queue.size() != 0) {
            return queue.remove(0);
        }
        return 0;
    }

    public void top() {
        System.out.println("Top element is: " + queue.get(queue.size() - 1));
    }
}
