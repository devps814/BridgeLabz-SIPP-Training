// Q19_PriorityQueueLazyDeletion.java
// Priority queue with lazy deletion
import java.util.*;

public class Q19_PriorityQueueLazyDeletion {
    private PriorityQueue<Integer> pq = new PriorityQueue<>();
    private Set<Integer> deleted = new HashSet<>();

    public void insert(int x) {
        pq.offer(x);
    }

    public void delete(int x) {
        deleted.add(x);
    }

    public Integer poll() {
        while (!pq.isEmpty() && deleted.contains(pq.peek())) {
            deleted.remove(pq.poll());
        }
        return pq.poll();
    }

    public static void main(String[] args) {
        Q19_PriorityQueueLazyDeletion pq = new Q19_PriorityQueueLazyDeletion();
        pq.insert(5);
        pq.insert(1);
        pq.insert(3);
        pq.delete(1);
        System.out.println(pq.poll()); // 3
    }
}
