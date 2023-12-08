package IMPORTANTQUE;

// Java program to insert an element at the bottom of a stack
//Logic: Pop all elements from stack and push them to the function call stack using recursion.
import java.util.*;

public class Qu1_Push_At_The_Bottom_Stack {

    //Create function to push at bottom
    public static void pushAtBottom(Stack<Integer> s, int data) {

        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Stack before pushing at bottom: " + s);
        pushAtBottom(s, 40);
        System.out.println("Stack after pushing at bottom: " + s);
    }

}
