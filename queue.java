import java.util.*;
class QueueAndDequeDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        System.out.println("=== Queue Example (FIFO) ===");
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue: " + queue);
        System.out.println("Removed from Queue: " + queue.remove());
        System.out.println("Front element (peek): " + queue.peek());
        System.out.println("Queue after removal: " + queue);
        Deque<Integer> deque = new ArrayDeque<>();
        System.out.println("\n=== Deque Example (Double Ended Queue) ===");
        deque.addFirst(100);
        deque.addLast(200);
        deque.addLast(300);
        System.out.println("Deque: " + deque);
        System.out.println("Removed First: " + deque.removeFirst());
        System.out.println("Removed Last: " + deque.removeLast());
        System.out.println("First element (peekFirst): " + deque.peekFirst());
        System.out.println("Last element (peekLast): " + deque.peekLast());
        System.out.println("Deque after operations: " + deque);
    }
}
