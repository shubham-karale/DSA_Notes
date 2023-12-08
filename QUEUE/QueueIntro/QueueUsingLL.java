package QueueIntro;

import java.util.Arrays;

// Implement Queue using LL
public class QueueUsingLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;

        }
    }

    static class Queue {

        static Node head = null;
        static Node tail = null;

        //        isEmpty()
        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        //        Enqueue -> Add()
        public static void add(int data) {

            Node newNode = new Node(data);
            if (tail == null) {
                tail = head = newNode;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //        Dequeue -> Remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is already Empty");
                return -1;
            }
            int front = head.data;

            if (head == tail) {
                tail = null;
            }
            head = head.next;
            return front;
        }

        //        Peek()
        public static int peek() {
            if (isEmpty()) {
                System.out.println("List is Already Empty");
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String[] args) {

        System.out.println("Queue Implementation Using LL");
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }


    }

}





