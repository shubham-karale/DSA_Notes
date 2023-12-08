//STEPS:
//1. Create a Node class
//2. Create a Stack class
//3. Create a push function
//4. Create a pop function
//5. Create a peek function
//6. Create a main function
//7. Create a Stack object
//8. Call push function
//9. Call pop function
//10. Call peek function


public class StackUsingLL {
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
//    Create Stack Class
    static class Stack {
        public static Node head;
        public static void push(int data) {
            Node newNode = new Node(data);
            if(head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }

//        Pop function
        public static int pop() {
            if(head == null) {
                System.out.println("Stack is Empty");
                return -1;
            } else {
                int top = head.data;
//                head ke next node ko head bana dena = delete kar dena
                head = head.next;
                return top;
            }
        }

//        Peek function
        public static int peek() {
            if(head == null) {
                System.out.println("Stack is Empty");
                return -1;
            } else {
                return head.data;
            }
        }



}

    public static void main(String args []) {
        System.out.println("Stack Implementation using LinkedList");
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Top Element: " + s.peek());
        System.out.println("Popped Element: " + s.pop());
        System.out.println("Top Element: " + s.peek());
        System.out.println("Popped Element: " + s.pop());
        System.out.println("Top Element: " + s.peek());
        System.out.println("Popped Element: " + s.pop());
        System.out.println("Top Element: " + s.peek());
        System.out.println("Popped Element: " + s.pop());
    }
}