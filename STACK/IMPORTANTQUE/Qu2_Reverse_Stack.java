package IMPORTANTQUE;

// Java program to reverse a stack using recursion

import java.util.Stack;

public class Qu2_Reverse_Stack {

//    Reverse Stack Function
public static void pushAtBottom(Stack<Integer> s, int data) {

    if (s.isEmpty()) {
        s.push(data);
        return;
    }

    int top = s.pop();
    pushAtBottom(s, data);

//    These execution will take place when the function call stack will be returning
    s.push(top);

}
    public static void reverseStack(Stack<Integer> s) {

        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverseStack(s);

//        These execution will take place when the function call stack will be returning
        pushAtBottom(s, top);

    }


    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Stack before reversing: " + s);
        reverseStack(s);
        System.out.println("Stack after reversing: " + s);
    }
}
