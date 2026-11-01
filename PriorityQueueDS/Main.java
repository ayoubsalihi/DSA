package PriorityQueueDS;
import java.util.* ;

public class Main {

    // *****************************************************
    // Priority Queue = FIFO data structure. First-In First-Out
    //					Every element has a priority. Elements with higher priority are served before elements with lower priority
    public static void main(String[] args) {
        Queue<String> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        priorityQueue.offer("Ayoub");
        priorityQueue.offer("Bassim");
        priorityQueue.offer("Samir");
        priorityQueue.offer("Rida");

        // priorityQueue.poll();
        // priorityQueue.poll();
        // priorityQueue.poll();
        // priorityQueue.poll();
        System.out.println(priorityQueue);
        
    }
}
