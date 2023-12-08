import java.util.ArrayList;

public class StackImplementationUsingArrayList {
    class Stack {
       static ArrayList<Integer> list = new ArrayList<>();
//        int top = -1;
//        isEmpty function
        public boolean isEmpty() {
            return list.size() == 0;
        }

//        Push function
        public void push(int data) {
            list.add(data);

        }

//        Pop function
        public int pop() {
            if(isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            } else {
                int top = list.get(list.size() - 1);
                list.remove(list.size() - 1);
                return top;
            }
        }

//        Peek function
        public int peek() {
            if(isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            } else {
                return list.get(list.size() - 1);
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("Stack Implementation using ArrayList");
        StackImplementationUsingArrayList s = new StackImplementationUsingArrayList();
        StackImplementationUsingArrayList.Stack stack = s.new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top Element: " + stack.peek());
        System.out.println("Popped Element: " + stack.pop());
        System.out.println("Top Element: " + stack.peek());
        System.out.println("Popped Element: " + stack.pop());
        System.out.println("Top Element: " + stack.peek());
        System.out.println("Popped Element: " + stack.pop());
    }

}
