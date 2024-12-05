// Processing the elements in order of priority

import java.util.PriorityQueue;
 
public class SortedPriorityQueue {
    public static void main(String[] args) {
        // Create a priority queue to store integers (this will be sorted in ascending order by default)
        PriorityQueue<Integer> pq = new PriorityQueue<>();
 
        // Add elements to the queue
        pq.add(4); // Add 4
        pq.add(5); // Add 5
        pq.add(2); // Add 2
        pq.add(3); // Add 3
        pq.add(1); // Add 1
 
        // Print the elements in sorted order by polling them from the priority queue
        System.out.println("Processing elements in sorted order:");
 
        // Process elements in sorted order (smallest to largest)
        while (!pq.isEmpty()) { // Loop until the queue is empty
            System.out.println(pq.poll()); // Retrieve and remove the smallest element
        }
    }
}