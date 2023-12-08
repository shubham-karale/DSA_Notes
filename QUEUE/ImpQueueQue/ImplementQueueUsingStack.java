package ImpQueueQue;

import java.util.Stack;

// Implement Queue Using Stacks = Asked in Microsoft and Google
// TC = push = O(n) and pop=  (n)
public class ImplementQueueUsingStack {

    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

//        isEmpty() = If the first stack is empty then return true
        public static boolean isEmpty() {
            return s1.isEmpty();
        }

//        Add() =
        public static void add(int data) {
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }

        }

//        Remove()

        public static int remove() {
            return s1.pop();
        }
//        Peek();
        public static int peek() {
            return s1.peek();
        }

    }

    public static void main(String[] args) {

        System.out.println("Implement Queue Using Two Stacks");
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();



        }

    }

}
