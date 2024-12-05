import java.util.PriorityQueue;
 
public class SimplePriorityQueue {
    public static void main(String[] args) {
        // Create a priority queue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
 
        // Add elements to the queue
        priorityQueue.add(10);
        priorityQueue.add(5);
        priorityQueue.add(20);
        priorityQueue.add(1);
 
        // Process the queue
        System.out.println("Elements in ascending order:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll()); // Remove and print the smallest element
        }
    }
}
 