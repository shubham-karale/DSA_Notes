package QueueIntro;

import java.net.Inet4Address;
import java.util.LinkedList;
import java.util.Queue;
//NOTE: Queue is an Interface in Java so that is why we can't create objects of Queue
//NoTE: also in Java Objects are created of only of classes
//LOGIC: Queue can be implemented By Two classes 1) ArrayDequeue 2) LinkedList

public class QueueCollections {
    public static void main(String[] args) {
        System.out.println("Queue Using Collections");
        Queue<Integer> q = new LinkedList<>();
        q.add(5);
        q.add(9);
        q.add(65);
        q.add(7);
        q.add(45);

        System.out.println(q);
    }
}
